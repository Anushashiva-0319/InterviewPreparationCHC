package com.anu.numberProgram;

import java.util.Scanner;

public class FindSumofNAturalNum {

	
	public static void main(String[] args) {
		System.out.println("enter n value");
		Scanner sc= new Scanner(System.in);
		int n =sc.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++) {
			sum=(n*(n+1))/2;
			//sum=sum+i;
		}
		System.out.println(sum);
	}
}
