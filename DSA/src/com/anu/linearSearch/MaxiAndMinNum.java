package com.anu.linearSearch;

public class MaxiAndMinNum {
	public static void main(String[] args) {
		
	int arr[]= {1,2,3,45,67,89,110,11,23,-1,-9};
	int max=arr[0];
	int min=arr[0];
	search(arr,max,min);
	}
	
	static void search(int arr[],int max,int min) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				
			}
			else if(arr[i]<min) {
				min=arr[i];
				
			}
		}
		System.out.println("the maximum num " +max);
		System.out.println("the minimum num " +min);
	}

}
