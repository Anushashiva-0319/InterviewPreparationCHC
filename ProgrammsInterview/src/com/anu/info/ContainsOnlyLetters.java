package com.anu.info;

public class ContainsOnlyLetters {
	
public static void main(String[] args) {
		
		String str ="anusha123";
		char[] st =str.toCharArray();
		for(char c:st) {
			if(Character.isAlphabetic(c)) {
				System.out.println(c);
			}
		}
		
	}

}
