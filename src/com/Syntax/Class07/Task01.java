package com.Syntax.Class07;

import java.util.Scanner;

public class Task01 {
	public static void main (String [] args) {
	// how to print 50 to 1
		int a =50;
		while (a>=0) {
			System.out.print(a + " ");
			a--;
			
		}
	System.out.println();
	System.out.println("____________________________________________________________________");	
	
	//how to print odds numbers from 1 to 20
	
		int b =1;
		while (b<=20) {
			System.out.print(b + " ");
			b+=2;
		}
	System.out.println();	
	System.out.println("____________________________________________________________________");	

	boolean workDay = true;
	int day = 1;
	while (workDay) {
		System.out.println("I need a day off");
		day++;
		if (day >= 6)
			workDay = false;
	}
	System.out.println("I do not need a day off any more");
	
	System.out.println();	
	System.out.println("____________________________________________________________________");				
		
	// we are playing a lottery and a lucky number is 17
	// we want to keep asking user to enter any number from 1-20 until he guess the lucky number
	
	
	Scanner scan = new Scanner(System.in);
	boolean lucky = true;
	
	while(lucky) {
	System.out.println("Please enter a number between 1-20: ");
	int number = scan.nextInt();
	if (number <1 || number >20)
		System.out.println("Invalid Number");		
	if (number ==17) {
		System.out.println("Congratulation! You are the winner.");
		lucky = false;
		}
	}
	
	System.out.println();	
	System.out.println("____________________________________________________________________");	
	
	int num1;
	do {
		System.out.print("Please enter a number from 1 to 20 ");
		num1=scan.nextInt();
	}while (num1!=17);
	
	System.out.println("Congratulation! You are the winner.");
	
	scan.close();
	}

}
