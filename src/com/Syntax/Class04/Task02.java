package com.Syntax.Class04;

import java.util.Scanner;

public class Task02 {
	public static void main (String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Do you have diploma? true or false. ");
		boolean hasDiploma = scan.nextBoolean();
		
		if (hasDiploma)
			System.out.println("congratulations.");
		else {
			System.out.print("Do you have a degree? true or false. ");
			boolean hasDegree = scan.nextBoolean();
			
			if (hasDegree) {
				System.out.print("Please Enter your GPA: ");
				int gpa = scan.nextInt();
				
				if (gpa >3.5)
					System.out.println("You are eligible for scholarship.");
				else
					System.out.println("You should have studied harder.");
			}
			else
				System.out.println("Please take a degree.");
			
		}
		scan.close();
			
			
	}

}
