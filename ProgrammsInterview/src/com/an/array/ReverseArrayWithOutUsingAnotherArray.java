package com.an.array;

import java.util.Arrays;

public class ReverseArrayWithOutUsingAnotherArray {

	public static void main(String[] args) {

		int[] a = { 1, 2, 4, 2, 6, 7 };
		reverse(a);

		System.out.println(Arrays.toString(a));
	}

	static void reverse(int[] a) {
		int start = 0, end = a.length - 1;
		while (start < end) {
			swap(a, start, end);
			start++;
			end--;
		}
	}

	private static void swap(int[] a, int start, int end) {
		int temp = 0;
		temp = a[start];
		a[start] = a[end];
		a[end] = temp;

	}
}
