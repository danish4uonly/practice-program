package company.barclays;

import java.util.HashSet;
import java.util.Iterator;

//Note the order is not certain. 
public class HashSetTest {
	
	public static void main(String[] args) {
		
		HashSet<Dog2> dset = new HashSet<>();
		dset.add(new Dog2(2));
		dset.add(new Dog2(1));
		dset.add(new Dog2(3));
		dset.add(new Dog2(5));
		dset.add(new Dog2(4));
		dset.add(null);
		dset.add(null);
		Iterator<Dog2> iterator = dset.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}

}


class Dog2 {
	int size;
 
	public Dog2(int s) {
		size = s;
	}
 
	public String toString() {
		return size + "";
	}
}
