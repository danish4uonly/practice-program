package DS;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatedCharacters {
	
	public static void main(String[] args) {
		
		printDuplicate("I am am learing java java");
	}

	/**This Hashing principle which is best complexity time. */
	public static void printDuplicate(String str){
		
		String[] strArray = str.split(" ");
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		/*for(String tempString : strArray){
			if(hm.containsKey(strArray[i])){
				
				hm.put(strArray[i], hm.get(strArray[i])+1);
			}else{
				hm.put(strArray[i], 1);
			}
		}*/
		
		//or
		
		for(int i=0; i<strArray.length; i++){
			
			if(hm.containsKey(strArray[i])){
				
				hm.put(strArray[i], hm.get(strArray[i])+1);
			}else{
				hm.put(strArray[i], 1);
			}
			
		}
		System.out.println(hm);
		
		for (Map.Entry<String, Integer> entry : hm.entrySet()) {
			if(entry.getValue()>1){
				System.out.print("Item : " + entry.getKey() + " Count : " + entry.getValue());
			}
		}
		
		System.out.println();
		//java 8 iteration
		hm.forEach((k,v)->{
			//System.out.println("Item : " + k + " Count : " + v);
			
			if(v > 1){
				
				System.out.println(k +"   " + v);
			}
		});
		
	}
	
}
