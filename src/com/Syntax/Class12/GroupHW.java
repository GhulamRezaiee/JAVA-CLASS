package com.Syntax.Class12;

import java.util.Scanner;

public class GroupHW {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	//--------------- Write a program to swap 2 numbers without a temporary variable? --------------- 
		
	/*	System.out.print("Please enter a number for 'A': ");
	*	int a = scan.nextInt();
	*	System.out.print("Please enter another number for 'B': ");
	*	int b = scan.nextInt();
	*	
	*	System.out.format("\nThe value of 'A' is %d and the value of 'B' is %d. \n",a,b);
	*	
	*	a = a + b;
	*	b = a - b;
	*	a = a - b;
	*	
	*	System.out.format("The new value of 'A' is %d and the new value of 'B' is %d. \n",a,b);
	*/
		
	//--------- Write a program to Swap 2 strings without a temporary variable? -------------
		
	/*	System.out.println("Please enter a value for 'First String': ");
	*	String str1 = scan.nextLine();
	*	
	*	System.out.println("Please enter a value for 'Second String': ");
	*	String str2 = scan.nextLine();
	*	
	*	System.out.format("The value of 'First String' is %s and the value of 'Second String' is %s.\n",str1,str2);
	*	
	*	str1 = str1+str2;
	*	str2 = str1.replace(str2, "");
	*	str1 = str1.replace(str2, "");
	*	
	*	System.out.format("The new value of 'First String' is %s and the new value of 'Second String' is %s.\n",str1,str2);
	*/	
		
	//------------ Write a java program to check whether a given number is prime or not? ------------------------
		
	/*	int number;
	*			
	*	System.out.println("Find out a number is prime or not!");
	*	System.out.print("Please enter a whole numebr greater than 1: ");
	*	while(true) {
	*		number = scan.nextInt();
	*		if (number>1)
	*			break;
	*		System.out.print("Invalid number. Please enter a whole number greater than 1: ");
	*	}
	*	
	*	if (number == 2) {
	*		System.out.format("%d is a prime number.",number);
	*	}else {
	*		for (int i = 2; i < number; i++) {
	*			if (number % i == 0) {
	*				System.out.format("%d is not a prime number.", number);
	*				break;
	*			}
	*			if (i == number-1) {
	*				System.out.format("%d is a prime number.",number);
	*			}
	*		}
	*	}
	*/	
	//---------------------- Write a Java Program to print first 10 numbers of Fibonacci series. ------------------------
		
	/*	int howManyNumber;
	*	int [] fibonacci;
	*	
	*	System.out.println("This program print Fibonacci numbers.");
	*	System.out.print("Please enter number of fibonacci numbers that you want to see: ");
	*	
	*	while (true){
	*		howManyNumber = scan.nextInt();
	*		if (howManyNumber > 0)
	*			break;
	*		System.out.print("Invalid Number. Please enter number of fibonacci numbers that you want to see: ");
	*	}
	*	
	*	fibonacci = new int [howManyNumber];
	*	fibonacci [0] = 1;
	*	
	*	if (howManyNumber > 1) {
	*		fibonacci [1] = 1;
	*	
	*		for (int i = 2; i < howManyNumber; i++) {
	*			fibonacci[i] = fibonacci[i-1]+fibonacci[i-2];
	*		}
	*	
	*		System.out.format("The first %d numbers of fibonacci series are:\n", howManyNumber);
	*		for (int j = 0; j < howManyNumber; j++) {
	*			System.out.format("%10d", fibonacci[j]);
	*			if ((j+1) % 10 == 0) 
	*				System.out.println();
	*		}
	*	} else 
	*		System.out.format("The first number of fibonacci series is %d.", fibonacci[0]);
	*/
		
	//-------------- Find out how many alpha characters are present in a String?  Find number of words in string? ------------------
		
	/*	System.out.println("Please enter a text:");
	*	String text = scan.nextLine().trim();
	*	
	*	String alphaCharacters = text.replaceAll("[^A-Za-z]", "");
	*	System.out.format("%d alpha characters are in your text.\n", (alphaCharacters.length()));
	*	
	*	String words = text.replaceAll("\\s+", " ");
	*	String words1 = words.replaceAll("[^\\s]", "");
	*	System.out.format("%d words are in the your text.", (words1.length()+1));
	*/	
		
	//-----------------------------	Write a java program to reverse String? Reverse a string word by word? -------------------------
		
	/*	System.out.println("Please enter a text: ");
	*	String str = scan.nextLine().trim();
	*	String reverseStr = "";
	*	String reverseWords = "";
	*	
	*	for (int i = (str.length()-1); i >= 0; i--) {
	*		reverseStr = reverseStr + str.charAt(i);
	*	}
	*	System.out.println("The reverse String of your text is:");
	*	System.out.println(reverseStr);
	*	
	*	String [] wordsArray = str.split(" ");
	*	for (int j = (wordsArray.length-1); j >= 0; j--) {
	*		reverseWords = reverseWords + wordsArray[j] + " ";
	*	}
	*	System.out.println("The reverse string word by word of your text is:");
	*	System.out.println(reverseWords);
	*/
		
	//-----------------	Write a Java Program to find whether a String is palindrome or not?------------------------
		
	/*	System.out.println("Please enter your text:");
	*	String strPal = scan.nextLine();
	*	String reverseStrPal = "";
	*	
	*	for (int i = (strPal.length()-1); i >= 0; i--) {
	*			reverseStrPal = reverseStrPal + strPal.charAt(i);
	*	}
	*	if (strPal.equalsIgnoreCase(reverseStrPal))
	*		System.out.println("Your text is palindrome.");
	*	else
	*		System.out.println("Your text is not palindrome.");
	*/	
		
	//-----------------	Write a java program to find the second largest number in the array? Maximum and minimum number in the array? -------------------
		
		System.out.println("This program will find the second largest, maximum and minimum in an array of numbers");
		System.out.print("How many number do you like to have in your array? ");
		
		int arrayLength;
		int [] array;
		int secondLargest;
		int maximum;
		int minimum;
		
		while (true) {
			arrayLength = scan.nextInt();
			if (arrayLength > 0)
				break;
			System.out.print("The length of array should be more than or equal to one. Please enter another number.");
		}
		
		array = new int [arrayLength];
		
		for (int i = 0; i < arrayLength; i++) {
			System.out.format("The number %d is \n", (i+1));
			array[i] = scan.nextInt();
		}
		
		maximum = array[0];
		minimum = array[0];
		for (int j = 1; j < arrayLength; j++) {
			if (array[j] > maximum) 
				maximum = array[j];
			else if (array[j] < minimum)
				minimum = array[j];
		}
		
		if (minimum == maximum) {
			System.out.format("All numbers of the array are equal. Therefore, minimum and maximum are the same number of %d.\n", minimum);
			System.out.println("There is not a second largest number in the array.");
		}
		else {
			secondLargest = minimum;
			for(int k = 0; k < arrayLength; k++) {
				if (array[k] > secondLargest && array[k] != maximum) {
					secondLargest = array[k];
				}
			}
			System.out.format("The minimum number of the array is %d, the second largest is %d, and the maximum is %d.", minimum, secondLargest, maximum);
		}
		
		

	}

}
