package com.ex.stream.codingQuestions;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		String n = sc.next();
		int z = n.chars().map(Character::getNumericValue).sum();
		System.out.println(z);

	}
}
