package com.anu.linearSearch;

public class SearchInrange {
	
		
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,5,7,8};
		int target=3;
		search(arr,0,4,target);
	}

	private static void search(int[] arr, int start, int end, int target) {
		start =0;
		end=arr.length-1;
		for(start=0;start<end;start++) {
			if(arr[start]==target)
			System.out.println(arr[start]);
		}
		
	}

}
