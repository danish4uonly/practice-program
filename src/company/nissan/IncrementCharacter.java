package company.nissan;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IncrementCharacter {
	
	private static final String FILENAME = "C:\\Users\\Acer\\Desktop\\nissan\\incrementchar.txt";

	public static void main(String[] args) throws IOException {
		
		InputStream in = new FileInputStream(new File(FILENAME));
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        System.out.println(line);
        
        StringBuilder sb=new StringBuilder();
		for(int i=0; i<line.length(); i++){
			if(line.charAt(i) == 122){//z
				sb.append((char)(97));//a
			}else if(line.charAt(i) == 90){//Z
				sb.append((char)(65));//A
			}else{
				sb.append((char)(line.charAt(i)+1));
			}
		}
		System.out.println(sb.toString());
	}

}
