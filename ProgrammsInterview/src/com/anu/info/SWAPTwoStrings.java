package com.anu.info;

public class SWAPTwoStrings {

	public static void main(String[] args) {
		
		
		
		String a="anusha";
		
		String b="abburi";
		System.out.println(" before Swapping the Strings" +" " + a + " " +" " + b);
		a=a+b;
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		System.out.println(" after Swapping the Strings" +" " + a + " " +" " + b);
		
		
		
	}
}
