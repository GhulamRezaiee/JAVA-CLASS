package com.Syntax.Class12;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String mamName;
		String dadName = "";
		String gender = "";
		String babyName = "";
		int mamNameLength = 0;
		int dadNameLength = 0;
		
		
		
		System.out.print("Please enter mom's first name: ");
		do {
			mamName = input.next();
			mamName = mamName.trim();
			if (!mamName.isEmpty()) {
				break;
			}	
			System.out.println("You can not leave the mam name empty.");
			System.out.print("Please enter mom's first name: ");
		} while (true);
		mamNameLength = mamName.length();
		
		System.out.print("Please enter dad's first name: ");
		do {
			dadName = input.next().toUpperCase();
			if (!dadName.isEmpty())
				break;
			System.out.println("You can not leave the dad name empty.");
			System.out.print("Please enter dad's first name: ");
		} while (true);	
		dadNameLength = dadName.length();
		
		
		System.out.print("Do you epecting boy or girl? ");
		do {
			gender = input.next().toLowerCase().trim();
			if (gender.equals("boy") || gender.equals("girl"))
				break;
			System.out.println("Wrong Selection. Please select between boy or girl");
		} while (true);	
		
				
		if (gender.equals("boy")) {
			babyName = dadName.substring(0,(dadNameLength/2)) + mamName.substring(mamNameLength/2);
		}else {
			babyName = mamName.substring(0,(mamNameLength/2)) + dadName.substring(dadNameLength/2);
		}
		
		System.out.println("Suggested baby name: "+babyName);
	}

}
