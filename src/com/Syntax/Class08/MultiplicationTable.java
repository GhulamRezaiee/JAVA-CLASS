package com.Syntax.Class08;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		// Create Multiplication table. User choose number of row and column.
		
		Scanner scan = new Scanner(System.in);
	
		System.out.print("Please enter a number for range of column of table: ");
		int column = scan.nextInt();
		System.out.print("Please enter a number for range of row of table: ");
		int row = scan.nextInt();
		
		for (int i=1; i<=row; i++) {
			for(int j=1; j<=column; j++) {
				int mul = i*j;
				System.out.format("%6d",mul);
			}
			System.out.println();
		}
	}

}

