package com.ex.stream.onArraays;

import java.util.Arrays;

public class EvenNumbersUsingStreams {
	
	public static void main(String[] args) {
		
		
		int a[] = {10 ,20,13,15,12};
	Arrays.stream(a).filter(n->n%2==0).forEach((x)->{
		System.out.println(x);
	});
	
	}
	}


