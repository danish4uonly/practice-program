package com;

class A{}

class B extends A{}
 
class C extends B{}

public class OverloadingConcept {
	
	public void test(B obj) {
		  System.out.println("B");
	}
		  
	public void test(C obj) {
		 System.out.println("C");
	}
		 
	void test(int a, float b){
		System.out.println("int and float");
	}
	
	void test(float a, int b){
		System.out.println("float and int");
	}
	
	void test(int a, double b){
		System.out.println("int and double");
	}
	
	void test(double a, int b){
		System.out.println("double and int");
	}
	
	void sum(int a,long b){System.out.println("a method invoked");}  
	void sum(long a,int b){System.out.println("b method invoked");} 
	
	public static void main(String[] args){
		OverloadingConcept a = new OverloadingConcept();
		a.test(1000f, 1);
		a.test(1000d, 1);
		B b = new B();
		a.test(b);
		a.test(null);  
		//Output is "C" because test(null) method call maps to method which contains parameter as class which is lowest in class hierarchy.
		
		//a.sum(20,20);//now ambiguity  
		a.sum(20,20l);
	}

}
