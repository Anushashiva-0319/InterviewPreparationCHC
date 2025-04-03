package com.ex.stream.codingQuestions;

import java.util.ArrayList;
import java.util.List;

public class PrintEvenNumbers {
public static void main(String[] args) {
	
	
	List<Integer> numberList=new ArrayList<>();
	numberList.add(1);
	numberList.add(101);
	numberList.add(80);
	numberList.add(40);
	numberList.add(20);
	numberList.stream().filter(x->x%2==0).forEach(x->{
		System.out.println("even numbers are :" + " " +x);
	});
}
}
