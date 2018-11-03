package test;

import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class FirstNonRepeatedCharacter {
	
	public static void main(String[] args){
		System.out.println("Enter the String :");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		nonRepeatedChar(s1);
	}
	
	public static String nonRepeatedChar(String s2){		
		for(int i=0; i<s2.length(); i++){
			int count=0;
			for(int j=0; j<s2.length(); j++){
				if(i==j) continue;
				if(s2.charAt(i)==s2.charAt(j)){
					count ++;
					break;
				}
			}
			if(count==0){
				System.out.println(s2.charAt(i));
				break;
			}
		}
		return "";
	}

}
