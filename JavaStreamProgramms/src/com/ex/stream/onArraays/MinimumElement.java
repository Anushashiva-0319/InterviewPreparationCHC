package com.ex.stream.onArraays;

import java.util.Arrays;

public class MinimumElement {
	public static void main(String[] args) {

		int a[] = { 1, 3, 4, 5 };
		int min = Arrays.stream(a).min().getAsInt();
;
		int max = Arrays.stream(a).max().getAsInt();

		System.out.println(min + " "+ "minimun element in list");
		System.out.println(max + "maximum element in list");
	}
}
