package com.anu.info;

public class ReverseEachWordOfString {

	public static void main(String[] args) {

		String str = "i am anusha kolli";
		String[] st = str.split(" ");
		String rev = "";
		for (String s : st) {
			String revWord = "";

			for (int i = s.length() - 1; i >= 0; i--) {
				revWord = revWord + s.charAt(i);
			}
			rev = rev + revWord;

		}
		System.out.println("reverse of each word in astring" + "  " + rev);

	}
}
