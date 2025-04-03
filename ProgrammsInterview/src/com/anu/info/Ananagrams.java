package com.anu.info;

import java.util.Arrays;

public class Ananagrams {

	public static boolean areAnagrams(String str1, String str2) {
		// Remove whitespace and convert to lower case
		str1 = str1.replaceAll("\\s", "").toLowerCase();
		str2 = str2.replaceAll("\\s", "").toLowerCase();

		// If lengths are not the same, they cannot be anagrams
		if (str1.length() != str2.length()) {
			return false;
		}

		// Convert strings to character arrays and sort them
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();

		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		System.out.println(charArray1);
		System.out.println(charArray2);

		// Compare the sorted character arrays
		return Arrays.equals(charArray1, charArray2);
	}

	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent";

		if (areAnagrams(str1, str2)) {
			System.out.println(str1 + " and " + str2 + " are anagrams.");
		} else {
			System.out.println(str1 + " and " + str2 + " are not anagrams.");
		}
	}

}
