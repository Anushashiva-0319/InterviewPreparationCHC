package com.ex.stream.codingQuestions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondLargestNumber {
	public static void main(String[] args) {

		List<Integer> numberList = new ArrayList<>();
		numberList.add(1);
		numberList.add(181);
		numberList.add(190);
		numberList.add(100);
		numberList.add(20);
		
	// this is one way	 using the mapToINt(x->x) finding the THIRD Largest Element in list
	//	first sorted above list in ascending order {1,20,100,181,191} now discard the Three elements and give the first element

	int num=  numberList.stream().distinct().sorted().mapToInt(x -> x)
				.skip(numberList.size() - 3).findFirst().getAsInt();
	System.out.println("the third largest num is  " +num);
	
	
	// this is another way using comparator in sortmethod using the second Largest Element
	//soreted in reverseorder  {190,181,100,20,1}and skip the one element 
	 Optional<Integer> optional=numberList.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
	 int secondLargest  = optional.get();
	
		System.out.println("the secondLargest num is  " +secondLargest);
	
	
	// this another way  secondLargetst element
		//sorted the list in reverseorder without using the comparator
	Optional<Integer> anotherway=numberList.stream().distinct().sorted((a,b)-> b-a).skip(1).findFirst();
	
	int c=anotherway.get();
	System.out.println("another way  secondLargetst element" +c);
}

	
}