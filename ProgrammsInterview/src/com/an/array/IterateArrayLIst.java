package com.an.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class IterateArrayLIst {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 13, 4, 25, 6));

		// using for loop
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("-----------------------");

		// using forEach loop
		ArrayList<String> strLIst = new ArrayList<>(Arrays.asList("anu", "zaki", "aji", "satish"));
		for (String s : strLIst) {
			System.out.println(s);
		}

		System.out.println("-----------------------");

		// using java8 stream and lambda
		ArrayList<Integer> listStream = new ArrayList<>(Arrays.asList(1, 2, 13, 4, 25, 6));
		listStream.stream().forEach(x -> System.out.println(x));

		System.out.println("-----------------------");

		// using Iterator
		ArrayList<String> strIterator = new ArrayList<>(Arrays.asList("anu", "zaki", "aji", "satish"));
		Iterator<String> itr = strIterator.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("-----------------------");

		// using ListIterator we can print prevous and reverse order
		ListIterator<Integer> li = list.listIterator();

		System.out.println(" printing the noramal order using listIterator");

		while (li.hasNext()) {
			System.out.println(li.next());
		}

		System.out.println(" printing the reverse order using listIterator");
		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}

	}
}