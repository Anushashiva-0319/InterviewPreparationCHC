package com.ex.stream.onArraays;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesUsingStream {

	public static void main(String[] args) {

		List<String> anuList = new ArrayList<>();
		List<String> list = new ArrayList<>();
		anuList.add("banana");
		anuList.add("mango");
		anuList.add("apple");
		anuList.add("banana");
		System.out.println("before" + anuList);
		
		// by using stream Api

				List<String> sai = anuList.stream().distinct().collect(Collectors.toList());

				System.out.println(sai + "using streams");

		// normal way to remove duplicates
		/*
		 * for (String st : anuList) {
		 * 
		 * if (!list.contains(st)) { list.add(st);
		 * 
		 * } } System.out.println(list);
		 */

		
	}
}
