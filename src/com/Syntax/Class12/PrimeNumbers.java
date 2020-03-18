package com.Syntax.Class12;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number;
		int [] primeNumbers;
		int counter = 0;
		
		System.out.println("This program can find all prime numbers between 1 and your selected number.");
		System.out.print("Please enter a number: ");
		
		while(true) {
			number = input.nextInt();
			if (number>1)
				break;
			System.out.print("Invalid number. Please enter a whole number greater than 1: ");
		}
		
		primeNumbers = new int [number];
		
		
		for (int i = 2; i <= number; i++) {
			for (int j = 0; j < number; j++) {
				if (primeNumbers[j] == 0) {
					primeNumbers[j] = i;
					break;
				}
				if (i % primeNumbers[j] == 0) {
					break;
				}
				
			}
		}
		System.out.format("The prime numbers between 1 and %d are: \n", number);
		for (int k = 0; k < number; k++) {
			if (primeNumbers[k] == 0)
				break;
			System.out.format("%10d",primeNumbers[k]);
			counter++;
			if (counter % 10 == 0)
				System.out.println();
		}

	}

}
