package com.anu.linearSearch;

public class LinearSearch {

	
	public static void main(String[] args) {
		
		
		int a[]= {1,23,45,6,1};
		
		int target=45;
		
		for(int i=0;i<a.length;i++) {
			if(target==a[i]) {
				
				System.out.println("the searching element is + a[i] +" +a[i]+ " = "+target);
				break;
			}
		}
	}
}
