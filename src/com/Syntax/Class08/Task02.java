package com.Syntax.Class08;

public class Task02 {
	public static void main (String [] args) {
		//write a program to calculate sum of odds and sum of even numbers 1 to 99
		
		int totalEven = 0;
		int totalOdd = 0;
		
		for (int i = 1; i <=99; i++) {
			if (i % 2 == 0) {
				totalEven = totalEven + i;
			}
			else {
				totalOdd = totalOdd + i;
			}
		}
		
		System.out.println("The total of even numbers between 1 to 99 is " + totalEven);
		System.out.println("The total of odd numbers between 1 to 99 is " + totalOdd);
		
		System.out.println("---------------------------------------");
		
		int min = 1;
		int max = 99;
		int oddMin;
		int oddMax;
		int evenMin;
		int evenMax;
		
		if (min % 2 == 0) {
			evenMin = min;
			oddMin = min + 1;
		}
		else {
			oddMin = min;
			evenMin = min +1;
		}
		
		if (max % 2 == 0) {
			evenMax = max;
			oddMax = max - 1;
		}
		else {
			oddMax = max;
			evenMax = max -1;
		}
		
		int totalEven1 = (evenMin+evenMax)*((evenMax+2-evenMin)/2)/2;
		int totalOdd1 = (oddMin+oddMax)*((oddMax+2-oddMin)/2)/2;
		
		System.out.println("The total of even numbers between 1 to 99 is " + totalEven1);
		System.out.println("The total of odd numbers between 1 to 99 is " + totalOdd1);
	}

}
