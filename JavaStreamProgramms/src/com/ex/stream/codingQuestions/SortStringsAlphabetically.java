package com.ex.stream.codingQuestions;

import java.util.ArrayList;
import java.util.List;

public class SortStringsAlphabetically {
public static void main(String[] args) {
	
	
	List<String> fruitList=new ArrayList<>();
	fruitList.add("Mango");
	fruitList.add("Banana");
	fruitList.add("Avacado");
	fruitList.add("SApota");
	fruitList.add("Zucchini");
	
	fruitList.stream().sorted().forEach(System.out::println);
	
	
	
 }
}
