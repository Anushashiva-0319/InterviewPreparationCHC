package com.anu.linearSearch;

// int arr[] = { 11, 1111, 134, 124, 121, 100,12,1,16 };
// 134 have 3 digits so it odd
//1111 have 4 digits so it is even
public class CountNoofEvenNoInDigit {

	static int findNumbers(int[] nums) {
		int count=0;
		for(int n:nums) {
			if(even(n)) {
				count++;
			}
		}
		return count;
	}
	
	// function to check the digit is even or not
	static boolean even(int n) {
		int noofdigits=digits(n);
		if(noofdigits%2==0) {
			return true;
		}
		return false;
	}
	
	// function to check the digits
	static int digits(int n) {
		int count=0;
		while(n>0) {
			count++;
			n=n/10;
		}
		return count;
	}
	public static void main(String[] args) {
		int[] arr = { 11, 1111, 134, 124, 121, 100,12,1,16 };
		findNumbers(arr);

	
			
		}

	}


