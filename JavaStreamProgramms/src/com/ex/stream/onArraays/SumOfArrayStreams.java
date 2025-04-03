package com.ex.stream.onArraays;

import java.util.Arrays;

public class SumOfArrayStreams {
public static void main(String[] args) {
	
	int a[] = { 12,13,14,16};
	int sum=Arrays.stream(a).sum();
	System.out.println(sum);
}
}
