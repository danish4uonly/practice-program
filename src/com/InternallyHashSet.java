package com;

import java.util.HashSet;

public class InternallyHashSet {
	
	public static void main(String[] args)
	{
		HashSet<String> hs = new HashSet<String>();
		hs.add("A");
		hs.add("B");
		hs.add("B");
		System.out.println(hs);
	}

}
