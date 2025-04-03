package com.anu.string;

public class ReverseOfString {
	
	public static void main(String[] args) {
		reverseMethod("javaDeveloper");
		
		/*
		 * String str ="ANUSHAABBURI";
		 * 
		 * char[] c= str.toCharArray();
		 * 
		 * for (int i=c.length-1;i>=0;i--) { System.out.print(c[i]); }
		 */
	}
		static void reverseMethod(String str) {
			String rev="";
			char[] ch =str.toCharArray();
			
			for(int i=ch.length-1;i>=0;i--) {
				System.out.print(ch[i]);
			}
		}
		
		
	}


