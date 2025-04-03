package com.anu.info;

public class ContainDigitsandLetters {
	public static void main(String[] args) {
		
	
	String str ="anusha123";
	char[] st =str.toCharArray();
	for(char c:st) {
		if(Character.isAlphabetic(c) || (Character.isDigit(c))) {
			System.out.println(c);
		}
	}
	
}
}
