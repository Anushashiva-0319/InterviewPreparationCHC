package com.anu.linearSearch;

public class Binarysearch {

	static int binarySearch(int a[], int target) {

		int start = 0;
		int end = a.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target < a[mid]) {
				end = mid - 1;

			} else if (target > a[mid]) {
				start = mid + 1;

			}
			else {
				return a[mid];
			}
			
		}
		return -1;

	}

	public static void main(String[] args) {
		int a[] = { -20, -10, 1, 3, 12, 14, 18, 191, 300 };
		int target = -10;
		int ans = binarySearch(a, target);
		System.out.println(ans);
	}
}
