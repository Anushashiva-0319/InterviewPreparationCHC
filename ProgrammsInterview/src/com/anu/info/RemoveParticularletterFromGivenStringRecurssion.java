package com.anu.info;

public class RemoveParticularletterFromGivenStringRecurssion {

	// using recursion

	static String recursiveRemoveLetter(String str) {
		// Base case: if the string is empty, return it
		if (str.isEmpty()) {
			return str;
		}

		// Check the first character
		char ch = str.charAt(0);
		if (ch == 'a') {
			return recursiveRemoveLetter(str.substring(1));
		} else {
			return ch + recursiveRemoveLetter(str.substring(1));
		}

	}

	public static void main(String[] args) {

	System.out.println(recursiveRemoveLetter("baccadx"));

	}
}
