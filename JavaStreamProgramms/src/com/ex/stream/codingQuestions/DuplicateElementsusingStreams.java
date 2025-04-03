package com.ex.stream.codingQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElementsusingStreams {

	public static void main(String[] args) {

		List<String> fruitList = new ArrayList<>(Arrays.asList("AA", "BB", "AA", "CC"));
		Set<String>	 hs=new HashSet<>();
		//Set<String> hsList = fruitList.stream().collect(Collectors.toSet());
		fruitList.stream().filter(x->!hs.add(x)).forEach(x->System.out.println(x));
		//System.out.println(hsList);
		//
		
		//***************duplicateElements how many Times Occured
	Map<String, Long>	 duplicateOccurence= fruitList.stream().collect(Collectors.groupingBy(x->x,Collectors.counting()));
		System.out.println(duplicateOccurence);
		
		for(Entry<String,Long> duplicate:duplicateOccurence.entrySet()) {
			if(duplicate.getValue()==1) {
				System.out.println(duplicate);
				return;
			}
		}
		
	}
}
