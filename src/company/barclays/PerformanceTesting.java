package company.barclays;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

//* The test is not precise, but can reflect the basic idea that TreeSet is much slower because it is sorted. 

public class PerformanceTesting {
	
	public static void main(String[] args) {
		 
		Random r = new Random();
	 
		HashSet<Dog3> hashSet = new HashSet<>();
		TreeSet<Dog3> treeSet = new TreeSet<>();
		LinkedHashSet<Dog3> linkedSet = new LinkedHashSet<>();
	 
		// start time
		long startTime = System.nanoTime();
	 
		for (int i = 0; i < 1000; i++) {
			int x = r.nextInt(1000 - 10) + 10;
			hashSet.add(new Dog3(x));
		}
		// end time
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		System.out.println("HashSet: " + duration);
	 
		// start time
		startTime = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			int x = r.nextInt(1000 - 10) + 10;
			treeSet.add(new Dog3(x));
		}
		// end time
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("TreeSet: " + duration);
	 
		// start time
		startTime = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			int x = r.nextInt(1000 - 10) + 10;
			linkedSet.add(new Dog3(x));
		}
		// end time
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("LinkedHashSet: " + duration);
	 
	}

}


class Dog3 implements Comparable<Dog3>{
	int size;
 
	public Dog3(int s) {
		size = s;
	}
 
	public String toString() {
		return size + "";
	}
 
	@Override
	public int compareTo(Dog3 o) {
	        return size - o.size;
	}
}
