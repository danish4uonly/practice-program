package com;

public class StartPattern {
	
	public static void main(String[] args){
		removeVowels();
		pyramidNumber();
		pyramidAsterisk();
		pyramidAsterisk1();
		pyramidAsterisk12();
	}
	
	public static void pyramidNumber(){
		int num=8;
		for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i+1; k++) {
                System.out.print(k*5 + " ");
            }
            System.out.println();
        }
	}
	
	public static void pyramidAsterisk(){
		int num=5;
		for (int i = 0; i < num; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print(k+1 + " ");
            }
            System.out.println();
        }
	}
	
	public static void pyramidAsterisk1(){
		int num=5,num1=1;
		for (int i = 0; i < num; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print(num1++ + " ");
            }
            System.out.println();
        }
	}
	
	
	public static void pyramidAsterisk12(){
		int num=5,space=16,ast=1;
		for (int i = 0; i < num; i++) {
			for(int j=0; j<space;j++){
				System.out.print(" ");
			}
			space=space-4;
            for (int k = 0; k < ast; k++) {
                System.out.print("* ");
            }
            ast=ast+2;
            System.out.println();
        }
	}
	
	public static void removeVowels(){
		String s1="danish";
		StringBuilder sb = new StringBuilder();
		char[] arr = {'a', 'e', 'i', 'o', 'u'};
		for(int i=0;i<s1.length();i++){
			int count=0;
			for(int j=0; j<arr.length;j++){
				if(s1.charAt(i)==arr[j]){
					count++;
					break;
				}
			}
			if(count==0){
				sb.append(s1.charAt(i));
			}
		}
		System.out.println(sb);
	}
	
	public static void sortString(){
		String s1="danish";
		char c1 = s1.charAt(s1.length()-1);
		System.out.println(c1);
		int ascii = (int) c1;
		System.out.println(ascii);
	}
}
