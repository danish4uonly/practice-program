package com;

interface Test1{
	public void test1();
}

public abstract class Test implements Test1{

	public static void test(){
		System.out.println("asdas");
	}
}

class Abc extends Test{

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		
	}
	
}
