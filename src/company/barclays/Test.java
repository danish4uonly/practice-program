package company.barclays;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		
		//
		HashSet<String> hs = new HashSet<>();
		hs.add("a");
		hs.add("b");
		hs.add("c");
		hs.add("a"); // what  will happen if I add duplicate value. how it internally works?
		
		for(String s : hs){
			System.out.println(s);
		}
		
		//
		HashSet<Integer> h = new HashSet<>();
		for(int i = 1; i < 100_0; i++){
			h.add(i);
		}
		
		for(Integer a : h){
			System.out.print(a+" ");
		}
		
		System.out.println();
		
		//
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		for(int i = 1; i < 100_0; i++){
			lhs.add(i);
		}
		
		for(Integer l : lhs){
			System.out.print(l+" ");
		}
		
		System.out.println();
		
		//
		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(12);
		tree.add(63);
		tree.add(34);
		tree.add(45);
		 
		Iterator<Integer> iterator = tree.iterator();
		System.out.print("Tree set data: ");
		while (iterator.hasNext()) {
		    System.out.print(iterator.next() + " ");
		}
		
		

	}

}
