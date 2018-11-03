package company.nissan;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ClockStatement {

	private static final String FILENAME = "C:\\Users\\Acer\\Desktop\\nissan\\timewords.txt";

	public static void main(String[] args) throws IOException {
		
		InputStream in = new FileInputStream(new File(FILENAME));
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String line;
        int count=0;
        int hrs=0;
        int min=0;
        while( (line = br.readLine() ) != null) {
            if(count==0)
                hrs = Integer.parseInt(line);
            else
                min = Integer.parseInt(line);
            count++;
        }
        System.out.println(hrs+" : "+min);
        System.out.println(getTimeName(hrs, min));
	}
	
	public static String getTimeName(int hours, int minutes){
	      String time_name = ""; 

	      if((hours>=1 && hours<=12) && (minutes>=0 && minutes<=59)){

	        String hour_mint []={"", "one", "two", "three", "four", "five", "six","seven", "eight", "nine","ten",
	          "eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen",
	          "twenty","twenty one", "twenty two", "twenty three", "twenty four", "twenty five",
	          "twenty six","twenty seven","twenty eight", "twenty nine"};

	        String a;
	        if (hours==12)
	          a = hour_mint [1];// put 'one' if hour is 12
	        else 
	          a = hour_mint[hours+1]; // if hour is not 12 then store an hour ahead of given hour 

	        if (minutes==0)
	          time_name = hour_mint[hours]+" o' clock";
	        else if (minutes == 1)
	        	time_name = "one minute past "+hour_mint[hours]; 
	        else if (minutes == 59)
	        	time_name = "one minute to "+hour_mint[(hours % 12) + 1]; 
	        else if (minutes==15)
	          time_name = "quarter past "+hour_mint[hours];
	        else if (minutes==30)
	          time_name = "half past "+hour_mint[hours];
	        else if (minutes==45)
	          time_name = "quarter to "+a;
	        else if (minutes<30) // for minutes between 1-29
	          time_name = hour_mint[minutes]+" minutes past "+hour_mint[hours];      
	        else // between 31-59
	          time_name = hour_mint[60-minutes]+" minutes to "+a;
	      }
	      else 
	        time_name = "invalid time format";

	      return time_name;
	    }
}
