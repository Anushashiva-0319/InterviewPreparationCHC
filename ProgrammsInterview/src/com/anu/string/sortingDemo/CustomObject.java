package com.anu.string.sortingDemo;

import java.util.ArrayList;
import java.util.Collections;

public class CustomObject {
	
	public static void main(String[] args) {
		
		ArrayList<Student> asList=new ArrayList<Student>();
		asList.add(new Student(1, "zaabis", "pmr", 90));
		asList.add(new Student(2, "sai", "vnk", 99));
		asList.add(new Student(3, "xiaomi", "gnt", 95));
		asList.add(new Student(4, "anusha", "vizag", 99));
		asList.add(new Student(5, "yuvaraj", "vijayawada", 99));
		asList.add(new Student(6, "Rohit", "bankok", 99));
		
		MyUtil.iterateList(asList);
		Collections.sort(asList);
		System.out.println("after sorting *****************");
		System.out.println( asList);
		
	}

	
	
	

}	
