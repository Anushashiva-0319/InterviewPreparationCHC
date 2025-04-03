package com.anu.info;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class NonRepetedknownWay {

	public static void main(String[] args) {
		findNonRepeted("axqzxnushas");
	}

	private static void findNonRepeted(String str) {
		LinkedHashMap<String, Integer> hm = new LinkedHashMap<>();
		String[] st = str.split("");
		for (String s : st) {
			if (hm.containsKey(s)) {
				hm.put(s, hm.get(s) + 1);
			} else {
				hm.put(s, 1);
			}
		}
		for (Entry<String, Integer> h : hm.entrySet()) {
			if (h.getValue() == 1) {
				System.out.println(h);
				break;
			}
		}
	}

}
