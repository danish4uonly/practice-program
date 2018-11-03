package com;

import java.util.ArrayList;
import java.util.List;

public class ReverseArrayList {
	
	public static void main(String[] srgs){
		
		List<String> al = new ArrayList<String>();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("d");
		al.add("e");
		al.add("f");
		
		/*System.out.println(ar);
		System.out.println(ar.size());
		for(int i=ar.size()-1,j=0; i>=0; i--,j++){
			
			ar.set(j, ar.get(i));
			
		}
		System.out.println(ar);*/
		
		
		System.out.println(al);
		for (int i = 0; i < al.size()/2; i++) {
		    String left = al.get(i);
		    String right = al.get(al.size()-1-i);
		    al.set(i, right);
		    al.set(al.size()-1-i, left);
		}
		System.out.println(al);
		
		
	}
	
	

}
