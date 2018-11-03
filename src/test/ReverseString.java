package test;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args){
		System.out.println("Enter the String :");
		/*Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		
		System.out.println(reverseString(s1));*/
		
		//palindrome
		//System.out.println("Enter the Number :");
		//int i1 = sc.nextInt();
		//System.out.println(reverseInteger(i1));
		primeNumber(1);
	}
	
	public static String reverseString(String s1){
		
		/*StringBuilder sb = new StringBuilder(s1);
		System.out.println(sb.reverse());*/
		String s2="";
		
		/*for(int i=s1.length()-1;i>=0;--i){
			s2=s2+s1.charAt(i);
		}*/
		
		/*String[] s3 = s1.split(" ");
		for(int i=s3.length-1;i>=0;--i){
			s2=s2+s3[i]+" ";
		}*/
		
		return s2;
	}
	
public static int reverseInteger(int num){
		
		int rev=0;
		while(num!=0){
			rev=rev*10 + num%10;
			System.out.println(rev);
			num = num/10;
			System.out.println(num);
		}
		return rev;
	}

public static void primeNumber(int num){
	
	int count=0;
	for(int i=1;i<=num;i++){
		if(num%i==0){
			count++;
		}
	}
	if(count==2){
		System.out.println("number is prime");
	}
	else
	{
		System.out.println("not prime");
	}
}

}
