package binarySearch;

public class FindSmallestchargreaterthanTarget {

	public static void main(String[] args) {
		char[] arr = { 'q', 'r', 'b', 'c', 'd', 'h', 'j' };
		char target = 'k';
		char z = find(arr, target);
		System.out.println(z);
	}

	static Character find(char[] arr, char target) {
		int start = 0, end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}

		}

		return arr[start % arr.length];

	}
}
