package New;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;


public class Manager2 {
	
	//ConcurrentHashMap   CHM
	
	/*
	 * Must read below url otherwise u dont know anything about CHM :
	 */
	
	//http://javarevisited.blogspot.com/2013/02/concurrenthashmap-in-java-example-tutorial-working.html

	
	/*ConcurrentHashMap is thread-safe that is the code can be accessed by single thread at a time .    
    while HashMap is not thread-safe .
    
    HashMap can be synchronized by using    
    synchronizedMap(HashMap)  method .  By using this method we get a HashMap object which is equivalent 
    to the HashTable object . So every modification  is performed    
    on  Map is locked on Map object. 
    
    	Map<String,String> map = new HashMap<String,String>();
        
        // populate the map
        map.put("1","ALIVE ");
        map.put("2","IS");
        map.put("3","AWESOME");
        
        // create a synchronized map
        Map<String,String> syncMap = Collections.synchronizedMap(map);
        
        System.out.println("Synchronized map :"+syncMap);
    *
    */
	
	/*ConcurrentHashMap does not allow NULL values . So the key can not be null in
    ConcurrentHashMap .While In HashMap there can only be one null key .
    
    In multiple threaded environment HashMap is usually faster than ConcurrentHashMap . As   
     only single thread can access the certain portion of the Map and thus reducing the performance .
     While in HashMap any number of threads can access the code at the same time .
    
    *
    */
	
	/*CurrentHashMap and HashTable are synchronized.
	HashMap is not synchronized but we can make it synchronized using synchronizedMap :
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
	Collections.synchronizedMap(hm);
	We can make any map as sychronized using above condition and known as : Synchronized Map
	*
	*/
	/*
	All methods of Hashtable are synchronized which makes them quite slow due to contention if a number of thread increases.

	Unlike Hashtable and Synchronized Map, it never locks whole Map, instead, it divides 
	the map into segments and locking is done on those. Though it performs better if a number of reader 
	threads are greater than the number of writer threads.


	*/
	/*
	 Difference between ConcurrentHashMap and Hashtable
	 So what is the difference between Hashtable and ConcurrentHashMap, both can be used in the 
	 multithreaded environment but once the size of Hashtable becomes considerable large performance 
	 degrade because for iteration it has to be locked for a longer duration.

	 Since ConcurrentHashMap introduced the concept of segmentation, how large it becomes only certain 
	 part of it get locked to provide thread safety so many other readers can still access map without
	  waiting for iteration to complete. 

	 In Summary, ConcurrentHashMap only locked certain portion of Map while Hashtable locks full map while
	  doing iteration. This will be clearer by looking at this diagram which explains the internal working of 
	  ConcurrentHashMap in Java
*/
	/*ConcurrentHashMap does not allow null keys or null values while synchronized HashMap allows one null key.

*/
	
	/*
	ConcurrentHashMap

    You should use ConcurrentHashMap when you need very high concurrency in your project.
    It is thread safe without synchronizing the whole map.
    Reads can happen very fast while write is done with a lock.
    There is no locking at the object level.
    The locking is at a much finer granularity at a hashmap bucket level.
    ConcurrentHashMap doesn’t throw a ConcurrentModificationException if one thread tries to modify it while another
     is iterating over it.
    ConcurrentHashMap uses multitude of locks.

SynchronizedHashMap

    Synchronization at Object level.
    Every read/write operation needs to acquire lock.
    Locking the entire collection is a performance overhead.
    This essentially gives access to only one thread to the entire map & blocks all the other threads.
    It may cause contention.
    SynchronizedHashMap returns Iterator, which fails-fast on concurrent modification.
*/
/*
Better to use concurrentHahsMap rather than HashTable or SynchronizedMap
beacuse it could not lock whole map.High concurrency level

*3) ConcurrentHashMap is more scalable and performs better than Synchronized HashMap in the multi-threaded 
*environment while in Single threaded environment both HashMap and ConcurrentHashMap gives comparable performance, 
*where HashMap only slightly better.


In Summary Main difference between ConcurrentHashMap and HashMap in Java Collection turns 
out to be thread-safety, Scalability, and Synchronization. ConcurrentHashMap is a better choice 
than synchronized HashMap if you are using them as cache, which is the most popular use case of a
 Map in Java application. ConcurrentHashMap is more scalable and outperforms when a number of reader
  threads outnumber the number of writer threads.



*
*/

/*
 * VVV IMP
 * public ConcurrentHashMap()

Creates a new, empty map with a default initial capacity (16), load factor (0.75) and concurrencyLevel (16).

 * 1. concurrency level 
 * 2. segment
 * It doesn't lock whole map segment wise lock, if it lock particular segment then it allows read operation (get())
 * but does not allow write operation (put() or remove()).
 * 
 *  ConcurrentHashMap is introduced as an alternative of Hashtable and provided all functions supported by Hashtable 
 *  with an additional feature called "concurrency level", which allows ConcurrentHashMap to partition Map. 
 *  ConcurrentHashMap allows multiple readers to read concurrently without any blocking. This is achieved by
 *   partitioning Map into different parts based on concurrency level and locking only a portion of Map during updates.
 *    Default concurrency level is 16, and accordingly Map is divided into 16 part and each part is governed with a 
 *    different lock. This means, 16 thread can operate on Map simultaneously until they are operating on different 
 *    part of Map. This makes ConcurrentHashMap high performance despite keeping thread-safety intact.  Though, it 
 *    comes with a caveat. Since update operations like put(), remove(), putAll() or clear() is not synchronized, 
 *    concurrent retrieval may not reflect most recent change on Map.



 * 
 */
	
	
		
	
	public static void main(String[] args){
		
		ConcurrentHashMap chm = new ConcurrentHashMap();
		chm.put("a", "");
		//chm.put("a", null); //null pointer exception.
		
	}
	
	//Java 8
	ConcurrentHashMap certificationCosts = new ConcurrentHashMap<>();
	Set concurrentHashSet = certificationCosts.newKeySet();



}
