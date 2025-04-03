package com.anu.string.sortingDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StringSortingDemo {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>(Arrays.asList("anusha", "shiva", "ruthviksai", "gnanasri"));

		//MyUtil.iterateList(list);
		Collections.sort(list);
		System.out.println("after sorting");
		System.out.println(list);
	}

}
