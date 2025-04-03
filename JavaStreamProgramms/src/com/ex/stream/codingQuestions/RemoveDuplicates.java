package com.ex.stream.codingQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
public static void main(String[] args) {
	
	
	List<String> fruitList = new ArrayList<>(Arrays.asList("banana", "apple", "mango", "apple"));
	fruitList.stream().distinct().forEach(System.out::println);
}
}
