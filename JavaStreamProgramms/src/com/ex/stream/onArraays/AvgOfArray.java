package com.ex.stream.onArraays;

import java.util.Arrays;
import java.util.OptionalDouble;

public class AvgOfArray {
public static void main(String[] args) {
	
	int a[]= { 12,10,20};
 OptionalDouble avg=	Arrays.stream(a).average();
 System.out.println(avg);
}
}
