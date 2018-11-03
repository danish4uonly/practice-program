package company.barclays;

import java.util.Iterator;
import java.util.LinkedHashSet;

//The order of the output is certain and it is the insertion order:
public class LinkedHashSetTest {

	public static void main(String[] args) {
		
		
		LinkedHashSet<Dog1> dset = new LinkedHashSet<>();
		dset.add(new Dog1(2));
		dset.add(new Dog1(1));
		dset.add(new Dog1(3));
		dset.add(new Dog1(5));
		dset.add(new Dog1(4));
		Iterator<Dog1> iterator = dset.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}

	}
}


class Dog1 {
	int size;
 
	public Dog1(int s) {
		size = s;
	}
 
	public String toString() {
		return size + "";
	}
}
