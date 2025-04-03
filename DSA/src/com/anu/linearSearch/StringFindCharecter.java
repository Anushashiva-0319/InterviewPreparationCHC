package com.anu.linearSearch;

import java.util.Arrays;

public class StringFindCharecter {

	static void find(String str, char target) {
		char[] c = str.toCharArray();
		for (char c1 : c) {

			if (c1 == target) {
				System.out.println("the target is matched" + " " + c1 + " " + target);
			}
			
		}
		System.out.println("the target not  found" + " " + Arrays.toString(c));
		
	}

	/*
	 * for(int i=0;i<c.length;i++) { if(c[i]==target) {
	 * System.out.println("the target is matched"+ " " +c[i] + " "+ target); }
	 * 
	 * } System.out.println("the target not  found"+ " " + target); }
	 */

	public static void main(String[] args) {

		String str = "Anusha";
		char target = 's';
		find(str, target);
	}
}
