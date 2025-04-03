package com.anu.info;

public class RemoveWordusingRecursion {

	static String removeWord(String str) {
		if (str.isEmpty()) {
			return str;
		}

		if (str.startsWith("apple")) {
			return removeWord(str.substring(5));
		} else {
			return str.charAt(0) + removeWord(str.substring(1));
		}

	}

	public static void main(String[] args) {
		System.out.println(removeWord("Anusha is love apple is appl"));
	}
}
