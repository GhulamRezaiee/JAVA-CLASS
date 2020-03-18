package com.Syntax.Class08;

import java.util.Scanner;

public class Task01 {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		double price;
		do {
			System.out.print("Please pay for the candy ");
			price = scan.nextDouble();
		} while (price != 2);
		System.out.println("Enjoy your candy");
	
	}

}
