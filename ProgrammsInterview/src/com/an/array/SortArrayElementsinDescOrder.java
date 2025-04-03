package com.an.array;

public class SortArrayElementsinDescOrder {

	
	public static void main(String[] args) {
		
		
		int a[] = {1,4,5,3,7,8,2,9};
		for(int i=0;i<a.length;i++) {
			int temp=0;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
			System.out.println(a[i]);
		}
		
	}
}
