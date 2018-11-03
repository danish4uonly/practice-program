package company.nissan;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CheckPrimeFactors {

	private static final String FILENAME = "C:\\Users\\Acer\\Desktop\\nissan\\primefactors.txt";

	public static void main(String[] args) throws IOException {
		
		InputStream in = new FileInputStream(new File(FILENAME));
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String line;
        List<Integer> list = new ArrayList<>();
        int count =0; 
        int exactFactors = 0;
        int totalCounts = 0;
        while( (line = br.readLine() ) != null) {
        	count++;
        	if(count==1)
        		exactFactors = Integer.parseInt(line);
        	
        	if(count==2)
        		totalCounts = Integer.parseInt(line);
        	
        	if(count>2)
        		list.add(Integer.parseInt(line));           
        }
        System.out.println(exactFactors + "   "+totalCounts);
        System.out.println(list);
        
        for(Integer i : list)
        	System.out.println(check( i, exactFactors));    
        
        
       /* int x= 8;
        System.out.println(++x * 3+" "+(--x));*/
	}
	
	//Yes or No
	public static String check(Integer number, int n){
		List<Integer> list = new ArrayList<>();
		int i =0;
	    int num =0;
		for (i = 1; i <= number; i++){
			int counter=0; 		  
	        for(num =i; num>=1; num--){
			    if(i%num==0)
			    	counter = counter + 1;
	        }
	        if (counter == 2) list.add(i);
	    }
		if(list.size() == n) return "Yes";
		return "No";
	}
}
