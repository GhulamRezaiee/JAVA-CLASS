package com.Syntax.Class01;

import java.util.Scanner;
public class TestCase {
	public static void main(String[] args) {
		// ask user to enter tow number and print all number between this two number
		// but don't print numbers that are divisible by both 2 and 3, at the same time
		Scanner input;
		int number1;
		int number2;
		int converter;
		
		input = new Scanner(System.in);
		System.out.print("Please enter two number: ");
		number1 = input.nextInt();
		number2 = input.nextInt();
		
		if(number2<number1) {
			converter = number2;
			number2 = number1;
			number1 = converter;
		}
		
		for (int i = number1; i <= number2; i++) {
			if (i % 2 == 0 && i % 3 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}
		input.close();
		
	}
}
