package com;

public class Testing {
	

	
	public static void main(String[] args){
		
		int rev=0,num=127;
		int numCheck=num;
		while(num!=0){
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
		if(rev==numCheck){
			System.out.println("palindrome");
		}
		else{
			System.out.println("not palindrome");
		}
		
		//sum of number :
		int num1=1234,sum=0;
		while(num1!=0){
			sum=sum+num1%10;
			num1=num1/10;
		}
		System.out.println(sum);
		
	}
}

/*class B extends Testing{
	
	public static void main(String[] args){
		
		System.out.println("B String");
		
		Testing a = new B();
		Testing b = (B) a;
	}
}*/
