package com.an.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareToArrayLists {

	public static void main(String[] args) {
		
		// first sort and check list is equal or not with other
		
		List<Character>  list1=new ArrayList<>(Arrays.asList('A','B','C','D','E'));
		List<Character>  list2=new ArrayList<>(Arrays.asList('A','B','C','D','F'));
		System.out.println(list1.equals(list2)); // give false
		
		
		List<Character>  list3=new ArrayList<>(Arrays.asList('A','B','C','D','E'));
		List<Character>  list4=new ArrayList<>(Arrays.asList('A','B','C','D','E'));
		System.out.println(list3.equals(list4)); // true
		
		List<Integer>  li1=new ArrayList<>(Arrays.asList(1,2,3,4,5));
		List<Integer>  li2=new ArrayList<>(Arrays.asList(1,2,3,4,6));
		System.out.println(li1.equals(li2)); //true
		
		//compare two lists find out different element
		//below remove the  only list1  different element compare to list2
		list1.removeAll(list2);
		System.out.println(list1);
		
		li1.removeAll(li2);
		System.out.println(li1);
		
		//find common elements in both lists
		li1.retainAll(li2);
		System.out.println(li1 + "common elements in  both list");
		
		
	}
	
}
