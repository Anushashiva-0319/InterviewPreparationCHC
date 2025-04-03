package com.anu.info;

public class CountVowelsinGivenString {

	public static void main(String[] args) {

		countVowels("i am am java java developer");
	}

	private static void countVowels(String str) {

		str=str.replaceAll("\\s", "");
		char[] c=str.toCharArray();
		int count =0,sum=0;
		for(char ch: c) {
			
			if(ch == 'a' || ch =='e' || ch=='i' || ch =='o' || ch =='u') {
				
				sum=sum+1;
				
			}
			else  {
				count=count+1;
			}
		}
		System.out.println(str.length() + "total elements of given string is");
		System.out.println(sum + "total vowels count is ");
		System.out.println(count + "total consonant count is");
		
	}

}
