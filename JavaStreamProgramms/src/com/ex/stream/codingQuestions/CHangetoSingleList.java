package com.ex.stream.codingQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CHangetoSingleList {

	public static void main(String[] args) {

		List<List<String>> list1 = Arrays.asList(Arrays.asList("java", "spring", "springboot"),
				Arrays.asList("react", "angular", "java script"), Arrays.asList("My sql", "oracle", "pg"));

		List<String> ls = list1.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
		System.out.println(ls);

	}
}
