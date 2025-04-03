package com.anu.linearSearch;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Practice {

	public static void main(String[] args) {

		String str = "anushakolli";

		char[] c = str.toCharArray();
		HashMap<Character, Integer> hs = new HashMap();

		for (Character cha : c) {
			if (hs.containsKey(cha)) {
				hs.put(cha, hs.get(cha) + 1);
			} else {
				hs.put(cha, 1);
			}

		}
		System.out.println(hs); // give all charecters how many times it came

		for (Entry<Character, Integer> anu : hs.entrySet()) {
			if (anu.getValue() > 1) {
				System.out.println(anu);
			}
		}

	}
}
