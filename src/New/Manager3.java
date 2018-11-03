package New;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;


/*
 1. Hashtable
 2. HashMap    //http://javabypatel.blogspot.com/2015/10/what-is-load-factor-and-rehashing-in-hashmap.html
 3. HashSet
 */

public class Manager3 {
	
	public static void main(String[] args)
	{
		/*Hashtable is synchronized and allows duplicate keys, it does not allow null keys nor values.
		Hashtable is basically a datastructure to retain values of key-value pair.
	    It didn’t allow null for both key and value. You will get NullPointerException if you add null value.
	    It is synchronized. So it comes with its cost. Only one thread can access in one time*/

		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(1, "first");
		ht.put(2, "second");
		ht.put(2, "third");
		//ht.put(null, "third"); //null pointer exception
		//ht.put(3, null); //null pointer exception
		System.out.println("Hash Table :"+ht);
	    Set<Integer> keys = ht.keySet();
	    for(Integer key: keys){
	        System.out.println("Hash Table Value of "+key+" is: "+ht.get(key));
	    }	
	    
	    /*
	     HashMap is not synchronized but allows duplicate keys, it allows one null key and as many null values as you like.
	     Like Hashtable it also accepts key value pair.
    	 It allows null for both key and value.
    	 It is unsynchronized. So come up with better performance.
	     */
	    
	    HashMap<Integer, String> hm = new HashMap<Integer, String>();
	    hm.put(1, "first");
	    hm.put(2, "second");
	    hm.put(2, "third");
	    hm.put(3, null);
	    hm.put(4, null);
	    hm.put(null, null);
	    hm.put(null, "fourth");
	    hm.put(null, null);
	    
	    System.out.println("Hash Map : "+hm);
	    Set<Integer> keys1 = hm.keySet();
	    for(Integer key: keys1){
	        System.out.println("Hash Map Value of "+key+" is: "+hm.get(key));
	    }
	    
	    /*
	     HashSet does not allow duplicate keys and is not synchronized, allows a null key.
	     HashSet does not allow duplicate values. 
	     It provides add method rather put method. 
	     You also use its contain method to check whether the object is already available in HashSet. 
	     HashSet can be used where you want to maintain a unique list.
	     */
	    
	    HashSet<String> hs = new HashSet<String>();
	    hs.add ("CA");
	    hs.add ("WI");
	    hs.add ("NY");
	    hs.add ("NY");
	    hs.add (null);
	    hs.add (null);
	    
	    System.out.println("Hash Set : "+hs);
	    
	    if (hs.contains("CA")) /* if CA, it will not add but shows following message*/
	    	System.out.println("Already found");
	    	else
	    	hs.add("PB");
	    
	     Iterator<String> itr = hs.iterator();
		 // traversing over HashSet
		 System.out.println("Traversing over Set using Iterator 1");
		 while(itr.hasNext()){
		   System.out.println(itr.next());
		 }
	 
		 System.out.println("Traversing over Set using Iterator 2");
		 for(String stock : hs){
			   System.out.println(stock);
		 }
		 
		 ArrayList ar = new ArrayList();
		 ar.add(null);
	}
}
