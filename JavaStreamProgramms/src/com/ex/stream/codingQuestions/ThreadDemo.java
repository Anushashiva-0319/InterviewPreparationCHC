package com.ex.stream.codingQuestions;


//using thread class we can start thread without run method bcz it is class no m
public class ThreadDemo  extends Thread{
	
	public static void main(String[] args) {
		
		ThreadDemo t =new ThreadDemo();
		System.out.println("thread started");
		for(int i=0;i<=5;i++) {
			System.out.println(i);
		}
		t.start();
		//t.en
	}

}
