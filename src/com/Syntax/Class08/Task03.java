package com.Syntax.Class08;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		//Print numbers from 1 to 50 except those that are divisible by 3
		
		for (int i = 1; i<=50; i++) {
			if (i % 3 == 0)
				continue;
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("---------------------------------------------");
		
		//Create a program that will be asking user to apply for a credit card 10 times. 
		//As soon you get an “yes” from a user program should stop asking.
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 1; i <= 10; i++) {
			System.out.print("Do you want to apply for credit card? ");
			String creditCard = scan.next();
			
			if (creditCard.equals("yes")) {
				System.out.println("Congratulations!");
				break;
			}			
		}
		
		System.out.println();
		System.out.println("---------------------------------------------");
		
		//Write a program that reads a range of integers (start and end point), 
		//provided by a user and then from that range prints the sum of the even and odd integers.
		
		int totalEven = 0;
		int totalOdd = 0;
		
		System.out.print("Please enter two numbers: ");
		int min = scan.nextInt();
		int max = scan.nextInt();
		if (min>max) {
			int change = min;
			min = max;
			max = change;
		}
		
		for (int i = min; i <=max; i++) {
			if (i % 2 == 0) {
				totalEven = totalEven + i;
			}
			else {
				totalOdd = totalOdd + i;
			}
		}
		System.out.format("The total of even numbers between %d to %d is %d.\n", min , max , totalEven);
		System.out.format("The total of odd numbers between %d to %d is %d.\n", min , max , totalOdd);
		
		System.out.println();
		System.out.println("---------------------------------------------");
		
		
		
		
	}

}
