package com.Syntax.Class04;

import java.util.Scanner;

public class Task01_1 {
	public static void main (String [] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter mortgage interest rate: ");
		double rate = scan.nextDouble();
		System.out.print("Please enter the house price: ");
		int price = scan.nextInt();
		
		if (rate > 4.5)
			System.out.println("The rate is high, we do not buy a house");
		else {
			if (price > 200_000)
				System.out.println("I will buy the house and take loan for the payment.");
			else
				System.out.println("I will buy the house and pay cash for it");
		}
	}

}
