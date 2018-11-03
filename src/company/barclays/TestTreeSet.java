package company.barclays;

import java.util.Iterator;
import java.util.TreeSet;
 
public class TestTreeSet {
	public static void main(String[] args) {
		TreeSet<Dog> dset = new TreeSet<Dog>();
		dset.add(new Dog(2));
		dset.add(new Dog(1));
		dset.add(new Dog(3));
 
		Iterator<Dog> iterator = dset.iterator();
 
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}
}

//Compile ok, but run-time error occurs:

//Because TreeSet is sorted, the Dog object need to implement java.lang.Comparable's compareTo() method like the following:

/*class Dog implements Comparable<Dog>{
	int size;
 
	public Dog(int s) {
		size = s;
	}
 
	public String toString() {
		return size + "";
	}
 
	@Override
	public int compareTo(Dog o) {
	        return size - o.size;
	}
}*/


class Dog {
	int size;
 
	public Dog(int s) {
		size = s;
	}
 
	public String toString() {
		return size + "";
	}
}