package com.Syntax.Class13;

import java.util.Arrays;

public class Question7 {

	public static void main(String[] args) {
		
		int [] numbers = {89,25,46,97,23,98};
		Arrays.sort(numbers);
		System.out.println("Smallest " + numbers[0]);
		System.out.println("Biggest " + numbers[numbers.length - 1]);
		System.out.println("Second Largest " + numbers[numbers.length - 2]);

	}

}
