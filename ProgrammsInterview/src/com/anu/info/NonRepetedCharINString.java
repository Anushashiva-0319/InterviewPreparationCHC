package com.anu.info;

import java.util.HashMap;

public class NonRepetedCharINString {

	static void findNonRepeted(String str) {

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		char[] c = str.toCharArray();

		// Count the occurrences of each character
		//In this case, if ch is not found in the hashmap hm, it will start the count at 0, and then add 1.
		for (char ch : c) {
			hm.put(ch, hm.getOrDefault(ch, 0) + 1);
		}

		// Find the first non-repeated character
		for (char chs : c) {
			if (hm.get(chs) == 1) {
				System.out.println("First non-repeated character: " + chs);
				return; // Exit after finding the first non-repeated character
			}
		}
		
		//find repeted firstcharacter we have to change if condition >1
		
		

		System.out.println("No non-repeated character found.");
	}

	public static void main(String[] args) {
		findNonRepeted("axqwzxnushas");
	}
}
