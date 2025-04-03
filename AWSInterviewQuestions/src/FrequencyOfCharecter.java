//Write a program to find the frequency of characters

import java.util.HashMap;

public class FrequencyOfCharecter {

	public static void occurence(String str) {
		char[] temp = str.toCharArray();

		HashMap<Character, Integer> hm = new HashMap<>();

		for (char charectervalue : temp) {
			if (hm.get(charectervalue) != null) {
				hm.put(charectervalue, hm.get(charectervalue) + 1);
			} else {
				hm.put(charectervalue, 1);
			}
		}
		System.out.println(hm);

		
	}
	
	public static void main(String[] args) {
		occurence("HEY ANUSHA KOLLI");
	}

}
