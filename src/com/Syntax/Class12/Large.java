package com.Syntax.Class12;

public class Large {
	public static void main (String [] args) {
		int [] array = {25, 35, 12, 24, 26, 80};
		
		int min= array[0];
		int max = array[0];
			
		for (int i = 0; i < array.length; i ++) {
			if (array[i] > max) {
				max = array[i];
			}else if (array[i] < min) {
				min = array[i];
			}
		}
		
		int secondLarge = min;
		
		for (int j = 0; j < array.length; j++) {
			if (array[j]>secondLarge && array[j] != max) {
				secondLarge = array[j];
			}
		}
		
		System.out.println("Max = "+ max);
		System.out.println("Min = "+ min);
		System.out.println("Second Largest = "+secondLarge);
		
	}

}
