package com.Syntax.Class12;

public class Fibonacci {
	public static void main (String [] args) {
		//---------------------- Write a Java Program to print first 10 numbers of Fibonacci series. ------------------------
		int [] fibonacci = new int [10];
		fibonacci [0] = 1;
		fibonacci [1] = 1;
		for (int i=2; i < 10; i++) {
			fibonacci[i] = fibonacci[i-1]+fibonacci[i-2];
		}
		
		for (int j = 0; j<10; j++ ) {
			System.out.print(fibonacci[j]+ " ");
		}
	}

}
