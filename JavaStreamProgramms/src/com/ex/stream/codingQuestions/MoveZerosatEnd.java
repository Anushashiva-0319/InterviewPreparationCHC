package com.ex.stream.codingQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoveZerosatEnd {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5, 6, 0, 0, 9, 8, 0, -1, -2));
		//List<Integer> list1 = list.stream().sorted().collect(Collectors.toList());
		Stream.concat(list.stream().filter(x -> x != 0), list.stream().filter(x -> x == 0))
				.forEach(x -> System.out.println(x));
	}
}
