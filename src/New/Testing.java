package New;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class Testing {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		System.out.println();
		
		/*
		 * What is the difference between creating String as new() and literal?
		 * 
When we create string with new() Operator, it’s created in heap(String non contant pool) and not added into string pool 
while String created using literal are created in String pool itself which exists in PermGen area of heap.


String s = new String("Test");
 
does not  put the object in String pool , we need to call String.intern() method which is used to put  
them into String pool explicitly. its only when you create String object as String literal e.g. String s = "Test" Java 
automatically put that into String pool.

		
		 */
		
		
		Vector v = new Vector();
		v.add(1);
		v.add(2);
		System.out.println(v);
		
		ArrayList ar = new ArrayList();
		ar.add(1);
		ar.add(2);
		System.out.println(ar);
			
			/*4. Set Increment Size
			 * ArrayList does not define the increment size . Vector defines the increment size .

You can find the following method in Vector Class

public synchronized void setSize(int i) { //some code  }

There is no setSize() method or any other method in ArrayList which can manually set the increment size.


 5. Enumerator

Other than Hashtable ,Vector is the only other class which uses both Enumeration and Iterator .
While ArrayList can only use Iterator for traversing an ArrayList .


3. Automatic Increase in Capacity

A Vector defaults to doubling size of its array . While when you insert an element into the ArrayList ,      
it increases its Array size by 50%  .

2.  Performance

Vector is slow as it is thread safe . In comparison ArrayList is fast as it is non synchronized . 
Thus  in ArrayList two or more threads  can access the code at the same time  , 
while Vector is limited to one thread at a time.
			 */
		
		
		
		Employee1 e1 = new Employee1(1);
		Employee1 e2 = new Employee1(1);
		
		Map<Employee1, Integer> map = new HashMap<>();
		map.put(e1, 1);
		map.put(e2, 1);
		
		System.out.println(map.size()); //2 so please implement equals hashcode in Employee1 class to avoid duplicate objects
		
		//All wrapper class by default implemented overridden equals and hashcode method
		
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);
	
		Map<Integer, Integer> map1 = new HashMap<>();
		map1.put(i1, 1);
		map1.put(i2, 1);
		
		System.out.println(map1.size()); //1
		
		
		String s = "dan";
		s.hashCode();
		String s1 = "dan";
		s1.hashCode();
		String s2 = "dani";
		s2.hashCode();
		
		
		/**Way to create an object in which constructor should not called*/
		
		/**Serializing*/
		FileOutputStream fos = new FileOutputStream("text.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Employee1 emp1 = new Employee1(); //constructor is called  
		oos.writeObject(emp1);
		
		/**De-serializing*/
		FileInputStream fis = new FileInputStream("text.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Employee1 emp2 = (Employee1) ois.readObject(); //constructor is not called  
		
		
	}
}


class Employee1 implements Serializable{
	
	private int id;
	
	public Employee1(){
		System.out.println("Const called!");
	}
	
	public Employee1(int id){
		super();
		this.id = id;
	}
	
}
