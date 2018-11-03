package company.uhg;

import java.util.HashMap;

public class FrequencyOfEachCharacterInString {

	//asked in Software AG
	// and write the unit test cases for this very important.
	public static void main(String[] args) {
		
		String s1 = "Software AGG";
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i = 0; i < s1.length(); i++){
			if(map.containsKey(s1.charAt(i))){
				map.put(s1.charAt(i), map.get(s1.charAt(i)) + 1);
			}
			else{
				map.put(s1.charAt(i), 1);
			}
		}
		System.out.println(map);
	}

}
