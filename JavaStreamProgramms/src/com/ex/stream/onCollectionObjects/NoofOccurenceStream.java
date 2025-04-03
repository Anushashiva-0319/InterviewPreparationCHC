package com.ex.stream.onCollectionObjects;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NoofOccurenceStream {

	public static void main(String[] args) {
		
		String str="anusha aji kavi anusha pesi pesi banana banana";
		
		//first converting string to list
		List<String> list=Arrays.asList(str.split(" "));
		
		Map<String,Long> ms=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(ms);
	//count total elements in a list
	long z=list.stream().count();
	System.out.println(z);
	
	
	String st="anushakolli";
	List<String> it =Arrays.asList(st.split(""));
	Map<String,Long> duplicateCharecters=it.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	System.out.println(st.length());
	System.out.println(duplicateCharecters);
	}
}
