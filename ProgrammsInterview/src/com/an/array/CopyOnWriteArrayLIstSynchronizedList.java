package com.an.array;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayLIstSynchronizedList {
	
	//it will   create a thread-safe Arraylist.

	public static void main(String[] args) {

		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(1, 2, 13, 4, 25, 6));

		Iterator<Integer> numberList = list.iterator();
		while(numberList.hasNext()) {
			System.out.println(numberList.next());
			
		}

	}
}
