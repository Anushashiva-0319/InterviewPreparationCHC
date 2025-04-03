package com.an.array;

import java.util.Arrays;

public class DuplicateElementsInArray {
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 3, 5, 2,5,6 };
		
		Arrays.stream(a).sorted().distinct().forEach(x -> {

			System.out.println(x);

		});
	
	System.out.println("__________________________________");

	for (int i = 0; i < a.length; i++) {
		for (int j = i + 1; j < a.length; j++) {
			if (a[i] == a[j]) {
				System.out.println(a[i]);
			}
		}
	}
	
	
}
}