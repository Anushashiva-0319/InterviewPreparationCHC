package com.an.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateNumbersInArrayList {

	public static void main(String[] args) {

		// we have to see list is sorted or not ->after sort

		ArrayList<Integer> as = new ArrayList<Integer>(Arrays.asList(1, 2, 6, 5, 4, 8, 2, 9, 1));

		as.sort((o1, o2) -> o1 - o2);
		System.out.println(" sorting list using normal sort method" + as);

		as.sort(Comparator.reverseOrder());
		System.out.println(" sorting list using the  Comparator.reverseOrder()  " + as);

		HashSet<Integer> hs = new HashSet<Integer>(as);
		System.out.println("removed the duplicates using the sets" + hs);
		
		
		//using java 8
		
		List<Integer> numList =as.stream().distinct().collect(Collectors.toList());
		System.out.println(numList + "using java 8");
		
		
		
				
			
		

	}
}
