package com.Syntax.Class12;

import java.util.Scanner;

public class Seperation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//-----------------	Write a Java Program to find whether a String is palindrome or not?------------------------
		
			System.out.println("Please enter your text:");
			String strPal = scan.nextLine();
			String reverseStrPal = "";
			
			for (int i = (strPal.length()-1); i >= 0; i--) {
					reverseStrPal = reverseStrPal + strPal.charAt(i);
			}
			if (strPal.equalsIgnoreCase(reverseStrPal))
				System.out.println("Your text is palindrome.");
			else
				System.out.println("Your text is not palindrome.");
			
	}

}
