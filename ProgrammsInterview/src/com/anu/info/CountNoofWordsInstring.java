package com.anu.info;

public class CountNoofWordsInstring {

	static void countNoofWords(String str) {
		int sum=0;
		String[] st =str.split(" ");
		for(String s:st) {
			sum=sum+1;
		}
		
		System.out.println(sum +  " " +  " no of words in given string ");
	}
	
	
	public static void main(String[] args) {
		 countNoofWords("anusha is good girl");
	}
}
