package New;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Manager1 {
	
	//LinkedHashMap:
	
	/*This class extends HashMap and maintains a linked list of the entries in the map, 
	in the order in which they were inserted.

	This allows insertion-order iteration over the map. That is, when iterating a LinkedHashMap, 
	the elements will be returned in the order in which they were inserted.

	You can also create a LinkedHashMap that returns its elements in the order in which they were last accessed.*/
	
		/*Scenarios of using each implementation :

		If performance is critical but ordering is not, go for HashMap. 
		If sorting is important, for example showing values in a table, sorted in alphabetical order then go for TreeMap. 
		If a value is added in the TreeMap or removed from the TreeMap, TreeMap will make sure the table is still sorted 
		alphabetically. 
		If the order of insertion is important, for example showing values in a shopping cart, go for LinkedHashMap.
		*/
	
	
	/*Java Map – containsKey(Object key) and containsValue(Object value) – Check if Key/Value Exists in Map 
	 * return true/false
	 * */
	
	public static void main(String[] args){
		
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();
		lhm.put(null, 17);
		lhm.put("A", 12);
		lhm.put("A", 14);
		lhm.put("D", 16);
		lhm.put("F", 15);
		lhm.put("B", 13);
		lhm.put("C", 11);
		
		
		System.out.println("lhm : "+lhm);
		Set<String> slhm = lhm.keySet();
		for(String abc: slhm){
	        System.out.println("Linked Hash Map Value of "+abc+" is: "+lhm.get(abc));
	    }
		
		/*for (Map.Entry<String, Integer> entry : lhm.entrySet())
		{
			System.out.println(entry.getKey() + "/" + entry.getValue());
		}*/
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("X", 12);
		hm.put("Ab", 14);
		hm.put("Ac", 16);
		hm.put("F", 15);
		hm.put("Ad", 13);
		hm.put("C", 11);
		hm.put(null, 17);
		hm.put(null, 189);
		
		System.out.println("hm : "+hm);
		Set<String> keys1 = hm.keySet();
		Iterator<String> itr = keys1.iterator();
	    for(String key: keys1){
	        System.out.println("Hash Map Value of "+key+" is: "+hm.get(key));
	    }
	    while(itr.hasNext()){
			   System.out.println(itr.next());
		}
	    
	    
	    TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		tm.put("X", 12);
		tm.put("Ab", 14);
		tm.put("Ac", 16);
		tm.put("F", 15);
		tm.put("Ad", 13);
		tm.put("C", 11);
		tm.put("E", null);
		//tm.put(null, 11); error
		
		System.out.println("tm : "+tm);
	}
}
