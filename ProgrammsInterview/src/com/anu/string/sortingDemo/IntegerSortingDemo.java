package com.anu.string.sortingDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class IntegerSortingDemo {

	public static void main(String[] args) {

		ArrayList<Integer> intlist = new ArrayList<Integer>(Arrays.asList(13, 2, 5, 7, 89, 12, 231));
		
		MyUtil.iterateList(intlist);
		
		System.out.println("after sorted");

		Collections.sort(intlist);

		System.out.println(intlist);

	}

}
