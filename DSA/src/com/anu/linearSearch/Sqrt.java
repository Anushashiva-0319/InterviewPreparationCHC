package com.anu.linearSearch;

public class Sqrt {

	int ans ;
	public int mySqrt(int x) {
		ans=(int) Math.sqrt(x);
		return ans;
	}
	public static void main(String[] args) {
		Sqrt s =new Sqrt();
		System.out.println(s.mySqrt(25));
	}
}
