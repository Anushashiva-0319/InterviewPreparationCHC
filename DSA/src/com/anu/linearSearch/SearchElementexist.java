package com.anu.linearSearch;


// element is exist or not 
public class SearchElementexist {

	
	public static void main(String[] args) {
		
		
		int a[]= {1,23,44,55,67,98};
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==67) {
				System.out.println("the index of 67 element is " +i);
			}
		}
	}
}
