package com.Syntax.Class09;

import java.util.Scanner;

public class Patterns {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter length and width of your square: ");
		int length = input.nextInt();
		int width = input.nextInt();
		
		for (int i = 1; i <= width; i++) {
			for (int j = 1; j <= length; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
