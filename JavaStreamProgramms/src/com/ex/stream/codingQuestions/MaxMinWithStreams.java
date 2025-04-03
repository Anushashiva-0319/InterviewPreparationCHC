package com.ex.stream.codingQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MaxMinWithStreams {
public static void main(String[] args) {
	
	
	
	List<Integer> numberList=new ArrayList<>();
	numberList.add(1100);
	numberList.add(101);
	numberList.add(90);
	numberList.add(40);
	numberList.add(20);
	int max=numberList.stream().mapToInt(x->x).max().getAsInt();
	Optional<Integer> min=numberList.stream().min((x1,x2)->x1.compareTo(x2));
	System.out.println(max+ " " + "maximum number in alist");
	System.out.println(min .get()+ " " + "minimum number in alist");
	
}
}
