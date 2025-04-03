package com.anu.info;

public class PermutationofGivenString {

	static void permutations(String p, String str) {
        if (str.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = str.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutations(f + ch + s, str.substring(1));
        }
    }

	public static void main(String[] args) {
		permutations("","AAG");
		
	}
}
