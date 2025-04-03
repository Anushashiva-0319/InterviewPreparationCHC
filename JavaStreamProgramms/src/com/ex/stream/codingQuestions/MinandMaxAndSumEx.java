package com.ex.stream.codingQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinandMaxAndSumEx {

	public static void main(String[] args) {

		List<Integer> numList = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 6, 7, 8));

		int max= numList.stream().mapToInt(x->x).max().getAsInt();
		
		int min= numList.stream().mapToInt(x->x).min().getAsInt();
		int sum=numList.stream().mapToInt(x->x).sum();
		
		System.out.println("max element in list" +max);
		System.out.println("min element in list" +min);
		System.out.println("sum element in list" +sum);
		
	}
}
