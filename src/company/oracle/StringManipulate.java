package company.oracle;

import java.util.Scanner;

//reverse character but special symbol is in same place.
//user will give input
//in : d@nish4uonly
//out: y@lnou4hsind
public class StringManipulate {

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String input = sc.nextLine();
		reverseString(input);
		reverseString("d@nish4uonly");
		reverseString("d@nish4uo nl,y");
		reverseString("d@ni#s^%&h4uonly");
	}
	
	public static void reverseString(String s){
		char str[] = s.toCharArray();
		int r=str.length-1; //last index
		int l=0; //first index
		char temp;
		while(l<r){
			// Ignore special characters
			if(!Character.isLetter(str[l])){
				l++;
			}else if(!Character.isLetter(str[r])) {
				r--;
			}
			
			else // Both str[l] and str[r] are not special
			{
				temp=str[l];
				str[l]=str[r];
				str[r]=temp;
				l++;
				r--;
			}
		}
		System.out.println(s+" ---> "+String.valueOf(str));
	}
}
