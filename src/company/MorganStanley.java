package company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MorganStanley {

	public static void main(String[] args) {
		
		String s1 = new String("ABC"); // new is runtime operation. first "ABC" is constant which creates in String constant pool and other object creates in heap , s1 points to heap 
		String s3 = new String("ABC");
		String s2 = "ABC";
		String s4 = "ABC";
		
		System.out.println("=========== new =====================");
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
		
		System.out.println("========== literals ===================");
		System.out.println(s2 == s4);
		System.out.println(s2.equals(s4));
		
		System.out.println("========= combine ================");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		System.out.println("========== concat =============");
		s2.concat("DEF"); //concat() is runtime operation, so, creates in heap with ABCDEF new object in heap, but s2 points to same SCP object, so ABCDEF is not pointed by any reference so it is eligible for garbage collection
		System.out.println(s2);
		
		s1.concat("DEF");//concat() is runtime operation, so, creates in heap with ABCDEF new object in heap, but s1 points to same object ABC in heap, so ABCDEF is not pointed by any reference so it is eligible for garbage collection
		System.out.println(s1);
		
		s2 = s1.concat("DEF");
		System.out.println(s2);
		
		String s5 = "abc";
		String s6 = "def";
		s5 = s5+s6;
		System.out.println(s5);
		
		
		//Find the count of character and their index:
		String ss = "abvabcabca";
		
		Map<Frequency, Integer> hm = new HashMap<>();
		for(int i = 0; i<ss.length(); i++){
			List<Integer> list = new ArrayList<>();
			list.add(i);
			Frequency freq = new Frequency(ss.charAt(i), list);
			if(hm.containsKey(freq)){	// it will go inside Frequency class and checks for equals and hashcode method whether object key is duplicate or not.			
				for (Map.Entry<Frequency, Integer> entry : hm.entrySet()) {
					Frequency f = entry.getKey();
					if(freq.equals(f)){ //checks only equals method in Frequency class
						f.getList().add(i);
						hm.put(f, hm.get(f) + 1);//get and put checks only hashcode method in Frequency class
					}
				}				
			}
			else{
				hm.put(freq, 1);
			}
		}
		
		hm.forEach((k,v)->{
			System.out.println("Item : " + k.getName() + " Count : " + v);
			System.out.println(" index : "+k.getList());
		});
	}
}
