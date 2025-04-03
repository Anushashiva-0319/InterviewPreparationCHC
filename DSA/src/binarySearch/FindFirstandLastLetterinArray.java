package binarySearch;

public class FindFirstandLastLetterinArray {
	

	public static void main(String[] args) {

			int[] arr = { 1, 2,  6, 6, 7, 8 };
			int target = 6;
			searchRange(arr,target);
			
}
			public static  int[]   searchRange( int[] arr, int  target) {
			int[] ans= {-1,-1};
			int start=findFirstandLast(arr, target, true);
			int end=findFirstandLast(arr, target, false);
			arr[0]=start;
			arr[1]=end;
			
			System.out.println(start);
			System.out.println(end);
			return ans;
			
		}
		
	
	// this function returns the index value of target
	static int findFirstandLast(int[] arr, int target, boolean findStartIndex) {
		int ans = -1;
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else
				ans = mid;
			if (findStartIndex) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}

		}

		return ans;

	}

}

