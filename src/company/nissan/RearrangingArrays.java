		package company.nissan;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RearrangingArrays {

	private static final String FILENAME = "C:\\Users\\Acer\\Desktop\\nissan\\rearrangearrays.txt";

	public static void main(String[] args) throws IOException {
		
		InputStream in = new FileInputStream(new File(FILENAME));
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String line;
        String line1;
        Map<String, Integer> map = new HashMap<>();
        int count =0; 
        int noOfTestCases = 0;
        while( (line = br.readLine() ) != null) {
        	count++;
        	if(count==1)
        		noOfTestCases = Integer.parseInt(line);
        	
        	if(count%3==0){
        		line1 = br.readLine();
        		map.put(line, Integer.parseInt(line1));
        		count++;
        	}  	          
        }
        //iterate through map
        for (Map.Entry<String, Integer> entry : map.entrySet()){
        	System.out.println(entry.getKey() + "     "+ entry.getValue());
        	System.out.println(rearrangeArrays(entry.getKey(), entry.getValue()));
        }
	}
	
	public static String rearrangeArrays(String arr, Integer elem){
		
		// The string you want to be an integer array.
		String[] integerStrings = arr.split(" "); 
		// Splits each spaced integer into a String array.
		int[] A = new int[integerStrings.length]; 
		List<Integer> list = new ArrayList<>();
		// Creates the integer array.
		for (int i = 0; i < A.length; i++){
		    A[i] = Integer.parseInt(integerStrings[i]); 
		//Parses the integer for each string.
		}
		
		int length=A.length; 
		if(length==0) return ""; 
		int i=0; 
		for(int j=0; j<length; j++)
		{
			if(A[j]!=elem)
			{
				list.add(A[j]);
				i++; 
			}
		}
		
		for(int k = 0; k < length; k++){
			if(list.size() == length)
				break;
			list.add(0, 1);
		}		
		
		
		StringBuilder builder = new StringBuilder();
		int count = 0;
		for (Integer value : list) {
			if(count == 0){
				builder.append(value);
				count++;
			}
			else
				builder.append(" "+value);
		}
		String text = builder.toString();
		
		return text;
	}
}
