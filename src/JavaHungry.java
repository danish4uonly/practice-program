import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class JavaHungry {
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
    	
    	//Each and every element in the set is unique .  So that there is no duplicate element in set .
    	    	
        //uniqueness
        HashSet<Object> hashset = new HashSet<Object>();
        hashset.add(3);
        hashset.add(3);
        hashset.add("Blogspot");
        System.out.println("Set is "+hashset);
        
        //uniqueness maintains ascending order
        TreeSet<Object> treeset = new TreeSet<Object>();
        treeset.add(3);
        treeset.add(0);
        treeset.add(1);
        treeset.add(7);
        treeset.add(7);
        System.out.println("Tree Set is "+treeset);
        
      //How Set Ensures Uniqueness??
        
        /*
         * 
         * Now , what happens internally when you pass duplicate elements in the  add() 
         * method of the Set object , It will return false and do not add to the HashSet , as the 
         * element is already present .So far so good .
         * 
			But the main problem arises that how it returns false . So here is the answer
			
			public class HashSet<E> extends AbstractSet<E> implements Set<E>, Cloneable, java.io.Serializable

			{
    			private transient HashMap<E,Object> map;
    
    			public HashSet() {
        			map = new HashMap<>();
    			}
    
    			// SOME CODE ,i.e Other methods in Hash Set
    
    
			    public boolean add(E e) {
			        return map.put(e, PRESENT)==null;
			    }
			    
			    So , we are achieving uniqueness in Set,internally in java  through HashMap . 
			    Whenever you create an object of HashSet it will create an object of HashMap.
			    As we know in HashMap each key is unique . So what we do in the set is that
			     we pass the argument in the add(Elemene E) that is E as a key in the HashMap .
			     
			     The main point to notice in above code is that put (key,value) will return :

					1.  null , if key is unique and added to the map
					2.  Old Value of the key , if key is duplicate
					
					
					How Hash Map Works In Java Or How Get() Method Works Internally???
					
					Map : allow duplicacy in values but not in key.
					HashMap : allow one null key and multiple null values.
					HashTable: doset not allow any null key nor values.
					
					HashMap works on the principle of Hashing .  
					To understand Hashing , we should understand the three terms 
					first   i.e  Hash Function , Hash Value and Bucket .
					
					hashCode() method  which returns an integer value is the Hash function.
					
					hashCode method return  int value .
					So the Hash value is the int value returned by the hash function .
					
					A bucket is used to store key value pairs . 
					A bucket can have multiple key-value pairs . 
					In hash map, bucket used simple linked list to store objects .
					
					HashMap get(Key k) method calls hashCode method on the key object and 
					applies returned hashValue to its own static hash function to find a bucket location
					
					
					
					
         */
        
        
Map<String,String> map = new HashMap<String,String>();
        
        // populate the map
        map.put("1","ALIVE ");
        map.put("2","IS");
        map.put("3","AWESOME");
        map.put("4","AWESOME");
        
        // create a synchronized map
        Map<String,String> syncMap = Collections.synchronizedMap(map);
        
        System.out.println("Synchronized map :"+syncMap);
        System.out.println(map);
        
        
        
        
        
        /*
        Q15 How to convert the array of strings into the list ?

        		Arrays class of java.util package contains the method asList() which accepts the array as parameter.
        		So,*/
        
        String[]  wordArray =  {"Love Yourself"  , "Alive is Awesome" , "Be in present"};
        System.out.println(wordArray);
        List wordList =  Arrays.asList(wordArray);
        
        System.out.println(wordList);
        
     // iterate via "for loop"
     		System.out.println("==> For Loop Example.");
     		for (int i = 0; i < wordList.size(); i++) {
     			System.out.println(wordList.get(i));
     		}
      
     		/*// iterate via "New way to loop"
     		System.out.println("\n==> Advance For Loop Example..");
     		for (String temp : wordList) {
     			System.out.println(temp);
     		}*/
     		
     		
     	// iterate via "iterator loop"
    		System.out.println("\n==> Iterator Example...");
    		Iterator<String> crunchifyIterator = wordList.iterator();
    		while (crunchifyIterator.hasNext()) {
    			System.out.println(crunchifyIterator.next());
    		}
    		
    		
    		// iterate via "while loop"
    		System.out.println("\n==> While Loop Example....");
    		int i = 0;
    		while (i < wordList.size()) {
    			System.out.println(wordList.get(i));
    			i++;
    		}
    		
    	
    		
    		//reverse list in coolection 
    		Collections.reverse(wordList);
    		System.out.println("The Reverse List is :"+wordList);
    		
    		
    		/*
    		 * Q12 Which methods you need to override to use any object as key in HashMap ?

To use any object as key in HashMap , it needs to implement equals() and hashCode() method 
    		 */
    		
    		//cannot contain any null key nor vaues.
    		Hashtable<String,String> hashtableobj = new Hashtable<String, String>();
            hashtableobj.put("","");
            hashtableobj.put("a","");
            System.out.println("Hashtable object output :"+ hashtableobj);
            
            //contains one null key and multiple null values
            HashMap<String,String> hashmapobj = new HashMap<String,String>();
            hashmapobj.put(null, null);  
            hashmapobj.put("s", null); 
            System.out.println("HashMap object output :"+hashmapobj);   
      
            //cannot contain null object and maintains ascending order.
            TreeSet<String>  obj1= new TreeSet<String>();
            obj1.add("Alive");
            obj1.add("is");
            obj1.add("Awesome");
            System.out.println("Tree Set:"+obj1);
            
            //contains null object and no order maintains
            HashSet<String>  obj2= new HashSet<String>();
            obj2.add(null);
            obj2.add(null);
            obj2.add("Awesome");
            System.out.println("HashSet:"+obj2);
            
            //Map<String,String> map = new HashMap<String,String>();
            //HashMap<String,String> hashmapobj = new HashMap<String,String>();
            
            //List li = new ArrayList();
            //ArrayList ar1 = new ArrayList();
            
            //insertion
            HashMap<Integer, String> source = new HashMap<Integer,String>();
            source.put(21, "Twenty One"); 
            source.put(31, "Thirty One"); 
            source.put(41, "Fourty One");

            System.out.println("Unsorted HashMap: " + source); 
            TreeMap sortedHashMap = new TreeMap(source); 
            System.out.println("Sorted HashMap: " + sortedHashMap);
            
            //Remove the vaue
            Integer key = 21; 
            Object value = source.remove(key); 
            System.out.println("Following value is removed from Map: " + value);
            
            //retrieval
            String value12 = source.get(21); 
            System.out.println("Key: " + 21 +" value: "+ value12);

           //iiimmmmpppppp..
         // iterate via "iterator loop"
    		System.out.println("\n==> Iterator Example...");
    		Iterator<Integer> ret = source.keySet().iterator();
    		while (ret.hasNext()) {
    			//System.out.println(ret.next());
    			Integer key12 = ret.next();
    			System.out.println("key: " + key12 + " value: " + source.get(key12));
    		}
    		
    		/*//iterate via ListIterator loop
    		ListIterator<Integer> li = (ListIterator<Integer>) source.keySet().iterator();
    		while (li.hasNext()) {
    		    if (li.hasPrevious()) {
    		                 li.previous();
    		    } else {
    		               // prev = null;
    		    }
    		
    		}*/

    		System.out.println("Does HashMap contains 21 as key: " + source.containsKey(21)); 
    		System.out.println("Does HashMap contains 21 as value: " + source.containsValue(21)); 
    		System.out.println("Does HashMap contains Fourty One as value: " + source.containsValue("Fourty One")); 
    		
    		System.out.println("Size of Map: " + source.size()); 
    		source.clear(); //clears hashmap , removes all element 
    		System.out.println("Size of Map: " + source.size()); 

    		
    		System.out.println("Does HashMap contains Fourty One as value: " + source.containsValue("Fourty One")); 
    		
    		
    		List<Integer> myList = new ArrayList<Integer>();
    		myList.add(10);
    		myList.add(20);
    		myList.add(30);
    		myList.add(40);
    		
    		ListIterator<Integer> iter = myList.listIterator();
    		while(iter.hasNext()) {
    			if(iter.hasPrevious()) {
    				System.out.println("Previous Element "+iter.previous());
    				iter.next();
    			} else {
    				System.out.println("Does not have Previous Element ");
    			}
    			
    			Integer currentElement = iter.next();
    			System.out.println("Current Element "+currentElement);
    		}
    		
    		// iterate via "New way to loop"
     		System.out.println("\n==> Advance For Loop Example..");
     		for (Integer temp : myList) {
     			System.out.println(temp);
     		}
     		
     		
     		/*
     		 * 
     		 * Q48 How will you make Collections readOnly ?

We can make the Collection readOnly by using the following lines code:

General : Collections.unmodifiableCollection(Collection c)

Collections.unmodifiableMap(Map m)
Collections.unmodifiableList(List l)
Collections.unmodifiableSet(Set s)

Q49  What is UnsupportedOperationException?

This exception is thrown to indicate that the requested operation is not supported.
Example of UnsupportedOperationException:
In other words, if you call add() or remove() method on the readOnly collection . 
We know readOnly collection can not be modified . Hence , UnsupportedOperationException will be thrown.
     		 */
     		
     		
     		
    }
}