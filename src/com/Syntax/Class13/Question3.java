package com.Syntax.Class13;

public class Question3 {

	public static void main(String[] args) {
		//---------------------- Write a Java Program to print first 10 numbers of Fibonacci series. ------------------------
		int numbers = 10;
		int a = 0;
		int b = 1;
		int c;
		
		for (int i = 0; i < numbers; i ++) {
			c = a + b;
			System.out.print(a + " ");
			a = b;
			b = c;
		}
	

	}

}
