package com.Syntax.Class13;

import java.util.Scanner;

public class Question2 {
	public static void main (String [] args){
		
		//------------ Write a java program to check whether a given number is prime or not? ------------------------
		
		Scanner scan = new Scanner(System.in);
		int number;
		boolean isPrime = true;
					
		System.out.println("Find out a number is prime or not!");
		System.out.print("Please enter a whole numebr greater than 1: ");
		while(true) {
			number = scan.nextInt();
			if (number>1)
				break;
			System.out.print("Invalid number. Please enter a whole number greater than 1: ");
		}
		
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}
			
		if (isPrime) {
			System.out.format("%d is a prime number.",number);
		}else {
			System.out.format("%d is not a prime number.", number);
		}
	
	}
	

}
