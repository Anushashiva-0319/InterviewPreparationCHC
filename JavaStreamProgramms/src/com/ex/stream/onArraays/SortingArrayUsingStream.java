package com.ex.stream.onArraays;

import java.util.Arrays;

public class SortingArrayUsingStream {

	public static void main(String[] args) {
		int a[] = { 12, 13, 45, 2, 3, 10 };
		// normal way
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		// usingStreams
		
		Arrays.stream(a).sorted().forEach((x)-> System.out.println(x));

	}
}
