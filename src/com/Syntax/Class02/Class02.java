package com.Syntax.Class02;

import java.util.Scanner;

public class Class02 {
	public static void main (String [] args) {
		int highValue = readNumber ();
		for (int counter = 0; counter <= highValue; counter++) {
			for (int i = 0; i  <= (highValue-counter); i++) {
				System.out.print("      ");
			}
			for (int j = 0; j <= counter; j++) {
				long counterFactorial = factorial (counter);
				long jFactorial = factorial (j);
				int d = counter - j;
				long dFactorial = factorial (d);
				long result = counterFactorial / (jFactorial * dFactorial);
				System.out.print(result + "            ");
			}
			System.out.println();
		}
	}
	
	public static int readNumber () {
		Scanner scanner = new Scanner(System.in);
		int value;
		System.out.print("Enter a hole number between 1 to 20 = ");
		while (true) {
			value = scanner.nextInt();
			if (value >= 1 && value<=20)
				break;
			System.out.print("Wrong number, Please Enter a hole number between 1 to 20 = ");
		}
		scanner.close();
		return value;
	}
	
	public static long factorial (int number) {
		long result = 1;
		for (int factor = 2; factor <= number; factor++) {
		result *= factor;
		}
		return result;
	}
		
}
