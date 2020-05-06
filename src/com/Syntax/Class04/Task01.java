package com.Syntax.Class04;

import java.util.Scanner;

public class Task01 {
	public static void main (String [] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Please enter your loan amount: ");
		int loanAmount = scan.nextInt();
		
		if (loanAmount<200_000)
			System.out.println("I will approve your loan");
		else
			System.out.println("I can not approve your loan");
		
		
		System.out.println("------------------------------------------------");
		
		
		System.out.print("Please enter your age: ");
		byte age = scan.nextByte();
		
		if (age<18)
			System.out.println("You are not elligible for license, Please take a learners permit.");
		else
			System.out.println("I will issue your driving license");
		
		
		
		System.out.println("-----------------------------------------------------------");
		
		
		System.out.print("Please enter your city name: ");
		String cityName = scan.next();
		System.out.print("Please enter the temperature: ");
		int temperature = scan.nextInt();
		
		int cTemp = (temperature - 32)*5/9;
		
		System.out.println("The temperature is the city " + cityName + " is "+ cTemp +" celsius.");
		
		scan.close();
		
		
	}

}
