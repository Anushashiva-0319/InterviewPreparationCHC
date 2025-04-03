package com.anu.linearSearch;

public class BinarySearchdescending {

	public static void main(String[] args) {
		int a[]= {18,10,7,5,3,2,1,-5,-4,-2};
		int target =-5;
		int z=search(a,target);
		System.out.println(z);
	}
static int search(int a[], int target) {
	int start=0,end=a.length-1;
	while(start<=end) {
		int mid=start+(end-start)/2;
		if(target<a[mid]) {
			start=mid+1;
		}
		else if(target>a[mid]) {
			end=mid-1;
		}
		else {
			return mid;
		}
	}
	
	
	return -1;
}
}
