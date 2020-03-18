package com.Syntax.Class08;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		// Write a program to ask a user to enter item they want to buy and the price of
		// that item.
		// Every time user enters money accumulate the amount and tell the user how much
		// is left to pay off the amount.
		// If user give more money program should return a change. Whenever a user done
		// with payments program should say “Thank you for shopping!”

		Scanner scan = new Scanner(System.in);

		String item;
		double price;
		double payment;
		double change;
		double remainBalance;
		double totalPayment = 0;

		System.out.print("What do you want to purchase?");
		item = scan.next();

		System.out.format("How much is the price of %s? ", item);
		price = scan.nextDouble();

		while (price < 0) {
			System.out.format("Wrong price! How much is the correct price of %s? ", item);
			price = scan.nextDouble();
		}
		if (price == 0) {
			System.out.println("Thank you for shopping!");
		} else {

			System.out.format("Please pay for your %s", item);

			do {

				payment = scan.nextDouble();
				totalPayment += payment;

				if (totalPayment > price) {
					change = totalPayment - price;
					System.out.format("Your change is %.2f ", change);
					break;
				} else if (totalPayment < price) {
					remainBalance = price - totalPayment;
					System.out.format("You still owe %.2f for your %s. Please pay remain amount.", remainBalance, item);
				}
			} while (price != totalPayment);
			System.out.println("Thank you for shopping!");
		}

	}

}
