package company.nissan;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class CountCharacters {

	private static final String FILENAME = "C:\\Users\\Acer\\Desktop\\nissan\\countchar.txt";

	public static void main(String[] args) throws IOException {
		
		String s1="";
        String s2="";
        int count=0;
		InputStream in = new FileInputStream(new File(FILENAME));
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
        while( (line = br.readLine() ) != null) {
            if(count==0)
                s1 = line;
            else
                s2 = line;
            count++;
        }
        
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int j = 0 ; j < s1.length() ; j++){
			if(hm.containsKey(s1.charAt(j))){
				hm.put(s1.charAt(j), hm.get(s1.charAt(j))+1);
			}else{
				hm.put(s1.charAt(j), 1);
			}
		} 
        //System.out.println(hm);
        
        HashMap<Character, Integer> hm1 = new LinkedHashMap<>();
        for(int i = 0 ; i < s2.length() ; i++){
        	if(s2.charAt(i)!='*'){
        		if(hm.containsKey(s2.charAt(i))){
    				hm1.put(s2.charAt(i), hm.get(s2.charAt(i)));
    			}else{
    				hm1.put(s2.charAt(i), 0);
    			}
        	}
        }
        //System.out.println(hm1);
        hm1.forEach((k,v)->{
    		System.out.println(k + " = " + v);
    	});
	}

}
