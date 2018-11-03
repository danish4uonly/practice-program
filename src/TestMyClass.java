import java.util.HashMap;


public class TestMyClass {
	
	/*
	 * 1) If two objects are equal according to equals(object) method, then calling hashcode method on each
	 * of the two objects must produce the same integer result.
	 * 
	 * 2)If two objects having the same hashcode then two objects may or may not be equal.
	 */
	
	public static void main(String[] args)
	{
		/*Override only equals :

		If only equals is overriden, then when you call myMap.put(first,someValue) 
		first will hash to some bucket and when you call myMap.put(second,someOtherValue) 
		it will hash to some other bucket (as they have a different hashCode). 
		So, although they are equal, as they don't hash to the same bucket, the map can't 
		realize it and both of them stay in the map.*/
		
		/*
		 * Override only hashCode : 
		 * 
		 * If you only override hashCode then when you call myMap.put(first,someValue) it takes first, 
		 * calculates its hashCode and stores it in a given bucket. Then when you call myMap.put(second,someOtherValue) 
		 * it should replace first with second as per the Map Documentation because they are equal (according to the 
		 * business requirement).
			
			//very important line :
			 * 
			But the problem is that equals was not redefined, so when the map hashes second and iterates 
			through the bucket looking if there is an object k such that second.equals(k) is true it won't 
			find any as second.equals(first) will be false.
		 */
		
		//My business requirement is i dont want duplicate objects based on importantField
		//so if it is equal then i want to replace it. which i have written in hascode overidden method as logic.
		MyClass first = new MyClass("a","first");
		MyClass second = new MyClass("a","second");
		
		HashMap<MyClass, String> myMap = new HashMap<MyClass, String>();
		
		myMap.put(first,"abc");
		myMap.put(second,"def");
		
		 // Iterate over HashMap
        for (MyClass mm : myMap.keySet()) {
            System.out.println(myMap.get(mm).toString());
        }
	}
}
 