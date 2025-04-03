package com.anu.linearSearch;

public class Searchin2DArray {

	
	public static void main(String[] args) {
		
		int a[][]= {{1,2,3}, {4,5,3},{7,8,9}};
		int target=8;
		
		search( a,target);
	}

	private static void search(int[][] a, int target) {
		for(int rows=0;rows<a.length;rows++) {
			for(int col=0;col<a[rows].length;col++) {
				if(a[rows][col]==target) {
					System.out.print(new int[] {rows,col} + " the element is  " + target);
				}
				//System.out.print(a[rows][col]);
				
			}
			System.out.println();
		}
		
	}
}
