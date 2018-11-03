package New;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastAndFailSafe {
	
	public static void main(String[] args){
		
		//Fail Fast Iterator example :
		
		/*As name suggest fail-fast Iterators fail as soon as they realized that structure of Collection has been changed 
		
		since iteration has begun. Structural changes means adding, removing or updating any element from collection 
		while one thread is Iterating over that collection. fail-fast behavior is implemented by keeping a modification 
		count and if iteration thread realizes the change in modification count it throws ConcurrentModificationException.*/


		
		
		/*Map<String,String> premiumPhone = new HashMap<String,String>();
        premiumPhone.put("Apple", "iPhone");
        premiumPhone.put("HTC", "HTC one");
        premiumPhone.put("Samsung","S5");
        
        Iterator iterator = premiumPhone.keySet().iterator();
        
        while (iterator.hasNext())
        {
            System.out.println(premiumPhone.get(iterator.next()));
            premiumPhone.put("Sony", "Xperia Z");
        }*/
        
        //Fail Safe iterator.
        ConcurrentHashMap<String,String> premiumPhone = new ConcurrentHashMap<String,String>();
		premiumPhone.put("Apple", "iPhone");
		premiumPhone.put("HTC", "HTC one");
		premiumPhone.put("Samsung","S5");
		
		Iterator iterator = premiumPhone.keySet().iterator();
		
		while (iterator.hasNext())
		{
			System.out.println(premiumPhone.get(iterator.next()));
			premiumPhone.put("Sony", "Xperia Z");
		}
		
		for(Map.Entry abc : premiumPhone.entrySet()){
			System.out.println("key : "+abc.getKey() + " || value :"+ abc.getValue());
		}
		        
	}

}


/*fail-safe Iterator in java
Contrary to fail-fast Iterator, fail-safe iterator doesn't throw any Exception if Collection is modified structurally
while one thread is Iterating over it because they work on clone of Collection instead of original collection 
and that’s why they are called as fail-safe iterator. Iterator of CopyOnWriteArrayList is an example of fail-safe Iterator 
also iterator written by ConcurrentHashMap keySet is also fail-safe iterator and never throw ConcurrentModificationException 
in Java.
*/
