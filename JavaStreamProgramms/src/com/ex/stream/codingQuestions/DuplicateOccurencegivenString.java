package com.ex.stream.codingQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateOccurencegivenString {
public static void main(String[] args) {
	
	
	
	String str="welcome Anusha Kolli AS Anusha";
	List<String> list= Arrays.asList(str.split(" "));
	Map<String, Long> dupWords=list.stream().collect(Collectors.groupingBy(x->x,Collectors.counting()));
	System.out.println(dupWords);
}
}
