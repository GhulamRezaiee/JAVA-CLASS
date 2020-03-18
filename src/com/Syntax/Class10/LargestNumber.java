package com.Syntax.Class10;

public class LargestNumber {
	public static void main (String [] args) {
		int [] numbers = { 25,250,35,350,-128,134,276,-24};
		int largest = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (largest < numbers[i]) {
				largest = numbers[i];
			}
		}
		System.out.println("The largest number is "+ largest);
		
		System.out.println("-------------------------------");
		
		int largest1 = numbers[0];
		for (int number : numbers) {
			if (largest1 < number) {
				largest1 = number;
			}
		}
		System.out.println("Largest number is "+largest1);
	}

}
