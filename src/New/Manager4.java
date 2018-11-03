package New;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Manager4 {
	
	//LinkedHashSet :
	/*This class extends HashSet, but adds no members of its own.

	LinkedHashSet maintains a linked list of the entries in the set, in the order in which they were inserted. 
	This allows insertion-order iteration over the set.

	That is, when cycling through a LinkedHashSet using an iterator, the elements will be returned in the order in 
	which they were inserted.

	The hash code is then used as the index at which the data associated with the key is stored. 
	The transformation of the key into its hash code is performed automatically.*/
	/*
	TreeSet, LinkedHashSet and HashSet in Java are three Set implementation in collection framework and like 
	many others they are also used to store objects. Main feature of TreeSet is sorting,  LinkedHashSet is 
	insertion order and HashSet is just general purpose collection for storing object. HashSet is implemented 
	using HashMap in Java while TreeSet is implemented using TreeMap.  TreeSet is a SortedSet implementation 
	which allows it to keep elements in the sorted order defined by either Comparable or Comparator interface. 
	Comparable is used for natural order sorting and Comparator for custom order sorting of objects, which can 
	be provided while creating instance of TreeSet.

	*/
	/* 1) Duplicates : All three implements Set interface means they are not allowed to store duplicates.

	 2) Thread safety : HashSet, TreeSet and LinkedHashSet are not thread-safe, if you use them in multi-threading environment where at least one Thread  modifies Set you need to externally synchronize them.

	 3) Fail-Fast Iterator : Iterator returned by TreeSet, LinkedHashSet and HashSet are fail-fast Iterator. i.e. If Iterator is modified after its creation by any way other than Iterators remove() method, it will throw ConcurrentModificationException with best of effort. read more about fail-fast vs fail-safe Iterator here

	*/
	
	 /*First difference between them comes in terms of  speed.  HashSet is fastest, LinkedHashSet is 
	 second on performance or almost similar to HashSet but TreeSet is bit slower because of sorting 
	 operation it needs to perform on each insertion.
	 
	 HashSet does not maintain any order while LinkedHashSet maintains insertion order 
	 of elements much like List interface and TreeSet maintains sorting order or elements.
	 
	 Internal Implementation : HashSet is backed by an HashMap instance, 
	 LinkedHashSet is implemented using HashSet and LinkedList while TreeSet is 
	 backed up by NavigableMap in Java and by default it uses TreeMap.
	 
	 
	 null : Both HashSet and LinkedHashSet allows null but TreeSet doesn't allow null but 
	 TreeSet doesn't allow null and throw java.lang.NullPointerException when you will insert null 
	 into TreeSet. Since TreeSet uses compareTo() method of respective elements to compare them  which 
	 throws NullPointerException while comparing with null
	 
	  Comparison : HashSet and LinkedHashSet uses equals() method in Java for comparison 
	  but TreeSet uses compareTo() method for maintaining ordering. That's why compareTo() 
	  should be consistent to equals in Java. failing to do so break general contact of Set 
	  interface i.e. it can permit duplicates.
	 
	 */
	/* When to use HashSet, TreeSet and LinkedHashSet in Java
	 Since all three implements Set interface they can be used for common Set operations 
	 like not allowing duplicates but since HashSet, TreeSet and LinkedHashSet has there 
	 special feature which makes them appropriate in certain scenario. Because of sorting order 
	 provided by TreeSet, use TreeSet when you need a collection where elements are sorted without 
	 duplicates. HashSet are rather general purpose Set implementation, Use it as default Set implementation 
	 if you need a fast, duplicate free collection. LinkedHashSet is extension of HashSet and its more suitable 
	 where you need to maintain insertion order of elements, similar to List without compromising performance
	 for costly TreeSet. Another use of LinkedHashSet is for creating copies of existing Set, Since 
	 LinkedHashSet preservers insertion order, it returns Set which contains same elements in same order 
	 like exact copy. In short,  although all three are Set interface implementation they offer 
	 distinctive feature, HashSet is a general purpose Set while LinkedHashSet provides insertion 
	 order guarantee and TreeSet is a SortedSet which stores elements in sorted order specified by 
	 Comparator or Comparable in Java.*/

	/*Always code for interface than implementation so that you can replace HashSet 
	to LinkedHashSet or TreeSet when your requirement changes. That’s all on difference 
	between HashSet, LinkedHashSet and TreeSet in Java. 
	eg Set a= new HashSet();
	*/

	

	
	public static void main(String args[]) {
		
	      // create a hash set
	      LinkedHashSet hs = new LinkedHashSet();
	      // add elements to the hash set
	      hs.add("B");
	      hs.add("A");
	      hs.add(null);
	      hs.add("E");
	      hs.add("C");
	      hs.add("F");
	      System.out.println(hs);
	      
	      TreeSet<String> ts = new TreeSet<String>();
	  	  ts.add("B");
	      ts.add("A");
	      //ts.add(null); null pointer exception as it is using compareTo method.
	      ts.add("E");
	      ts.add("C");
	      ts.add("F");
	      System.out.println(ts);
	      
	      HashSet<String> source = new HashSet<String>(Arrays.asList("Set, List, Map"));
	        System.out.println("source : " + source);
	        Set<String> copy = Manager4.copy(source);
	        System.out.println("copy of HashSet using LinkedHashSet: " + copy);
	        
	        
	        TreeMap<String,String> tm = new TreeMap<>();
	        tm.put("a", "a");
	        tm.put("d", "d");
	        tm.put("b", null);
	        //tm.put(null, null); null pointer exception
	        System.out.println(tm);
	   }
	
	 /*
     * Static utility method to copy Set in Java
     */
    public static <T> Set<T> copy(Set<T> source){
           return new LinkedHashSet<T>(source);
    }
    
    
    //HashSet Internally works as :
    
    /*
     * Now let add duplicate element in the above code


public class JavaHungry {
    
    public static void main(String[] args)
    {
        HashSet<Object> hashset = new HashSet<Object>();
        hashset.add(3);
        hashset.add("Java Hungry");
        hashset.add("Blogspot");
        hashset.add(3);                     // duplicate elements
        hashset.add("Java Hungry");              // duplicate elements
        System.out.println("Set is "+hashset);
    }
}



It will print the result :       Set is [3, Java Hungry, Blogspot]

Now , what happens internally when you pass duplicate elements in the  add() method of the Set object , 
It will return false and do not add to the HashSet , as the element is already present .So far so good .

But the main problem arises that how it returns false . So here is the answer

When you open the HashSet implementation of the add() method in Java Apis that is rt.jar ,
 you will find the following code in it

public class HashSet<E>
extends AbstractSet<E>
implements Set<E>, Cloneable, java.io.Serializable

{
    private transient HashMap<E,Object> map;
    
    // Dummy value to associate with an Object in the backing Map
    
    private static final Object PRESENT = new Object();
    
    
    
    public HashSet() {
        map = new HashMap<>();
    }
    
    // SOME CODE ,i.e Other methods in Hash Set
    
    
    public boolean add(E e) {
        return map.put(e, PRESENT)==null;
    }
    
    
    
    // SOME CODE ,i.e Other methods in Hash Set
}

So , we are achieving uniqueness in Set,internally in java  through HashMap . Whenever you create an object of HashSet 
it will create an object of HashMap as you can see in the italic lines in the above code .
We already discussed   How HashMap works internally  in java .

As we know in HashMap each key is unique . So what we do in the set is that we pass the argument in the 
add(Elemene E) that is E as a key in the HashMap . Now we need to associate some value to the key , so what 
Java apis developer did is to pass the Dummy  value that is ( new Object () ) which is referred by Object reference PRESENT .

So , actually when you are adding a line in HashSet like  hashset.add(3)   what java does internally is that 
it will put that element E here 3 as a key in the HashMap(created during HashSet object creation) and some dummy 
value that is Object's object is passed as a value to the key .

Now if you see the code of the HashMap put(Key k,Value V) method , you will find something like this

 public V put(K key, V value) {
//Some code
}

The main point to notice in above code is that put (key,value) will return

1.  null , if key is unique and added to the map
2.  Old Value of the key , if key is duplicate

So , in HashSet add() method ,  we check the return value of map.put(key,value) method with null value
i.e.

   public boolean add(E e) {
            return map.put(e, PRESENT)==null;
       }

So , if map.put(key,value) returns null ,then
map.put(e, PRESENT)==null      will return true and element is added to the HashSet.



So , if map.put(key,value) returns old value of the key ,then
map.put(e, PRESENT)==null      will return false and element is  not added to the HashSet .

     
     */
    
}
