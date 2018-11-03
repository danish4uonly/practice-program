package New;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Manager {
	
	//	LinkedList and ArrayList :

	//As ArrayList using index based operation , so traversing is more faster in ArrayList i.e. get()
	//Array provides O(1) performance for get(index) method but remove is costly in ArrayList as you need to 
	//rearrange all elements.
	
	// In LinkedList --> This is to access any element, you need to navigate through the elements one by one, which will take more time.
	// LinkedList doesn't provide Random or index based access and you need to iterate over linked list to retrieve any element which is of order O(n).
	
/*	From the hierarchy diagram, they all implement List interface. They are very similar to use. 
 * Their main difference is their implementation which causes different performance for different operations.

	ArrayList is implemented as a resizable array. As more elements are added to ArrayList, 
	its size is increased dynamically. It's elements can be accessed directly by using the get and set methods, 
	since ArrayList is essentially an array.

	LinkedList is implemented as a double linked list. Its performance on add and remove is better than Arraylist,
	 but worse on get and set methods.

	Vector is similar with ArrayList, but it is synchronized.

	ArrayList is a better choice if your program is thread-safe.
	Vector and ArrayList require more space as more elements are added. 
	Vector each time doubles its array size, while ArrayList grow 50% of its size each time. 
	LinkedList, however, also implements Queue interface which adds more methods than ArrayList and Vector, 
	such as offer(), peek(), poll(), etc. */
	
	/*
	 *  1) Since Array is an index based data-structure searching or getting element from Array with index is pretty fast. 
	 *  Array provides O(1) performance for get(index) method but remove is costly in ArrayList as you need to rearrange 
	 *  all elements. On the Other hand LinkedList doesn't provide Random or index based access and you need to iterate
	 *   over linked list to retrieve any element which is of order O(n).

2) Insertions  are easy and fast in LinkedList as compared to ArrayList because there is no risk of resizing array
and copying content to new array if array gets full which makes adding into ArrayList of O(n) in worst case, while 
adding is O(1) operation in LinkedList in Java. ArrayList also needs to update its index if you insert something 
anywhere except at the end of array.

3) Removal is like insertions better in LinkedList than ArrayList.

4) LinkedList has more memory overhead than ArrayList because in ArrayList each index only holds actual object (data)
 but in case of LinkedList each node holds both data and address of next  and previous node.


G:\Study Material\Java\Interview Prep\Collection.jpg
	 */
	
	
	/* When to use LinkedList and ArrayList in Java
	 As I said LinkedList is not as popular as ArrayList but still there are situation where a LinkedList is better 
	 choice than ArrayList in Java. Use LinkedList in Java if:

	 1) Your application can live without Random access. Because if you need nth element in LinkedList you need to 
	 first traverse up to nth element O(n) and than you get data from that node.

	 2) Your application is more insertion and deletion driver and you insert or remove more than retrieval. 
	 Since insertion or	 removal doesn't involve resizing its much faster than ArrayList.
*/

	private static final int NUMBER = 100000;
	
	
	public static void main(String[] args) throws Exception{
		
		testAddEnd(new ArrayList());
		testAddEnd(new LinkedList());
		testAddEnd(new Vector());
		testAddMiddle(new ArrayList());
		testAddMiddle2( new LinkedList());
		testAddMiddle(new Vector());
		testAddStart(new ArrayList());
		testAddStart(new LinkedList());
		testAddStart(new Vector());
	}
	
	private static final void testAddEnd(List list) throws Exception {
		long time = System.currentTimeMillis();
		for (int i = 0; i < NUMBER; i++) {
			list.add(Integer.valueOf(i));
		}
		System.out.println("Add End (" + list.getClass().getName() + "): " + (System.currentTimeMillis() - time));
		Thread.sleep(2000);
	}

	private static final void testAddMiddle(List list) throws Exception {
		long time = System.currentTimeMillis();
		for (int i = 0; i < NUMBER; i++) {
			if (list.size() > 0) {
				list.add(i / 2, Integer.valueOf(i));
			} else {
				list.add(Integer.valueOf(i));
			  }
		}
		System.out.println("Add Middle (" + list.getClass().getName() + "): " + (System.currentTimeMillis() - time));
		Thread.sleep(2000);
	}
		
	private static final void testAddMiddle2(LinkedList list) throws Exception {
		long time = System.currentTimeMillis();
		for (int i = 0; i < NUMBER; i++) {
			if (list.size() > 0) {
				list.add(i / 2, Integer.valueOf(i));
			} else {
				list.add(Integer.valueOf(i));
				}
		}
		System.out.println("Add Middle (" + list.getClass().getName() + "): " + (System.currentTimeMillis() - time));
		Thread.sleep(2000);
	}

	private static final void testAddStart(List list) throws Exception {
		long time = System.currentTimeMillis();
		for (int i = 0; i < NUMBER; i++) {
			if (list.size() > 0) {
				list.add(0, Integer.valueOf(i));
			} else {
				list.add(Integer.valueOf(i));
			}
		}
		System.out.println("Add Start (" + list.getClass().getName() + "): " + (System.currentTimeMillis() - time));
		Thread.sleep(2000);
	}
}