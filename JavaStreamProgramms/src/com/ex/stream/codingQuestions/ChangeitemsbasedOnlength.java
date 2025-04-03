package com.ex.stream.codingQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

// we have to count items based upon length  below output 
//String length 3 4
// String length 4 2
//String length 5 4 
public class ChangeitemsbasedOnlength {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>(
				Arrays.asList("dog", "eat", "cat", "mat", "horse", "nurse", "purse", "sause", "four", "five"));
		// map is used to store length and count of items in list
		Map<Integer, Integer> map = new HashMap<>();
		for (String s : list) {
			int length = s.length();
			map.put(length, map.getOrDefault(length, 0) + 1);
		}

		for (Entry<Integer, Integer> hm : map.entrySet()) {
			System.out.println("String length " + hm.getKey() + " " + hm.getValue());
		}

		// using java 8

		Map<Object, Long> ls = list.stream().collect(Collectors.groupingBy(x -> x.length(), Collectors.counting()));
		for (Entry<Object, Long> hm : ls.entrySet()) {

			System.out.println(" length of  Strings  " + hm.getKey() + " " + "and count of strings" +  "  "+hm.getValue());
		}

	}
}
