package com;

import java.util.Arrays;

public class ArmstrongNumber {
	
	public static void main(String[] args){
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		checkArmstrongNumber(num);*/
		
		printArmstrongNumber();
		
		
		isAnagram("Mother In Law", "Hitler Woman");
		 
        isAnagram("keEp", "peeK");
 
        isAnagram("SiLeNt CAT", "LisTen AcT");
 
        isAnagram("Debit Card", "Bad Credit");
 
        isAnagram("School MASTER", "The ClassROOM");
 
        isAnagram("DORMITORY", "Dirty Room");
 
        isAnagram("ASTRONOMERS", "NO MORE STARS");
 
        isAnagram("Toss", "Shot");
 
        isAnagram("joy", "enjoy");
	}
	
	public static void checkArmstrongNumber(int num){
		
		int a,sum=0,temp;
		temp=num;
		while(num>0){
			a=num%10;
			num=num/10;
			sum=sum+(a*a*a);
		}
		if(temp==sum){
			System.out.println("this is armstrong number");
		}
		else{
			System.out.println("NOT");
		}
	}
	
	public static void printArmstrongNumber(){
		
		int a,sum=0,temp;
		
		for(int i = 1; i<= 1000; i++){
			temp=i;
			while(temp>0){
				a=temp%10;
				temp=temp/10;
				sum=sum+(a*a*a);
			}
			if(i==sum){
				System.out.print(i+" ");
			}
			sum=0;
		}		
	}
	
	public static void reverseNumber(){
		int num=237;
		int digit,rev=0;
		while(num!=0){
			digit=num%10;
			num=num/10;
			rev=rev*10+digit;
		}
		System.out.println(rev);
		
	}
	
	public static void sumOfNumber(){
		int num=6514,digit,sum=0;
		
		//sum of all digit
		while(num!=0){
			digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		System.out.println(sum);
		
	}
	
	/*What Is Anagram?

			Two strings are called anagrams if they contain same set of characters but in different order. For example, “Dormitory – Dirty Room”, “keep – peek”,  “School Master – The Classroom” are some anagrams.
			1) Anagram Program In Java Using sort() and equals() Methods

			First we clean the input by removing all white spaces from the given two strings and change the case of all characters of both the strings to lower case so that case of both input strings will be ignored. After cleaning the input strings, we convert them to character array and sort them using sort() method of java.util.Arrays class. After sorting, we compare both the arrays using equals() method of same Arrays class.This method will return true if both arrays have same set of characters. Below is the complete anagram program using sort() and equals() methods.
	*/
	static void isAnagram(String s1, String s2)
    {
        //Removing all white spaces from s1 and s2
		System.out.println();
 
        String copyOfs1 = s1.replaceAll("\\s", "");
 
        String copyOfs2 = s2.replaceAll("\\s", "");
 
        //Initially setting status as true
 
        boolean status = true;
 
        if(copyOfs1.length() != copyOfs2.length())
        {
            //Setting status as false if copyOfs1 and copyOfs2 doesn't have same length
 
            status = false;
        }
        else
        {
            //Changing the case of characters of both copyOfs1 and copyOfs2 and converting them to char array
 
            char[] s1Array = copyOfs1.toLowerCase().toCharArray();
 
            char[] s2Array = copyOfs2.toLowerCase().toCharArray();
 
            //Sorting both s1Array and s2Array
 
            Arrays.sort(s1Array);
 
            Arrays.sort(s2Array);
 
            //Checking whether s1Array and s2Array are equal
 
            status = Arrays.equals(s1Array, s2Array);
        }
 
        //Output
 
        if(status)
        {
            System.out.println(s1+" and "+s2+" are anagrams");
        }
        else
        {
            System.out.println(s1+" and "+s2+" are not anagrams");
        }
    }
}
