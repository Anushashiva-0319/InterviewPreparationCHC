package binarySearch;

//biggest num is smaller or equal to target
public class FloorOfNumber {

	
	public static void main(String[] args) {
		int arr[] = {12,15,18,19};
		int target= 17;
		int z=floor(arr,target);
		System.out.println(z);
	}
	static int floor(int[] arr, int target) {
		int start = arr[0];
		int end = arr.length - 1;
		while (start <= end) {
			// find mid element
			// int mid=(start+end)/2 if we reach the int length +127 so that case it will
			// not work.
			int mid = start + (end - start) / 2;
			if (target < arr[mid]) {
				end = mid - 1;
				// System.out.println(arr[mid]);
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}
		}
		return end;
	}

}
