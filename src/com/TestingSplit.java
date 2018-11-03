package com;

public class TestingSplit {
	
	public static void main(String[] args)
	{
		String str="200004388557~12/12/2012~13/12/2013";
		String[] arr = str.split("~");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		String a[] =arr[2].split("/");
		System.out.println("sadasdasd:"+a[2]+a[1]+a[0]);
		
		System.out.println(arr[2]);
	}

}
