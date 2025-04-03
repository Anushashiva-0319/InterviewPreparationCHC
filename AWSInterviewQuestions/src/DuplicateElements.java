//Write a program to find duplicate elements in an array

import java.util.HashMap;

public class DuplicateElements {
	public static void main(String[] args) {

		String[] str = { "anusha", "anusha", "anu", "kavi", "kavi" };

		
		/*
		 * for (int i = 0; i < str.length; i++) { for (int j = i + 1; j < str.length;
		 * j++) { if (str[i].equals(str[j])) { System.out.println(str[i]);
		 * 
		 * }
		 * 
		 * } }
		 * 
		 * 
		 * // -------------------using hashSet--------------
		 * 
		 * HashSet<String> hs = new HashSet<String>(); for (String s : str) { if
		 * (!hs.contains(s)) { hs.add(s);
		 * 
		 * } } System.out.println(hs);
		 * 
		 */	//----------------------------------//usingHashMap-------------------
	HashMap<String , Integer>   map = new HashMap<String, Integer>();
	for(String s1:str) {
		if(map.containsKey(s1)) {
			map.put(s1, map.get(s1)+1);
			 System.out.println(map);
		}
		else {
			map.put(s1, 1);
			//System.out.println(map);
		}
		
	}
	
	
}
}
