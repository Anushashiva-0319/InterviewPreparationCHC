package com.an.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedArrayListusingSynchronizedMethod {

	public static void main(String[] args) {

		List<String> str = new ArrayList<>();
		str.add("Java");
		str.add("PHP");
		str.add("python");
		str.add("c");

		// add and remove we dont need synchronization

		Collections.synchronizedList(str);

		// while traversing or fetching the elements we need synchronized() method
		synchronized (str) {

			 // must be in synchronized block
			
			Iterator<String> itr = str.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
		}

	}
}
