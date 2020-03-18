package com.Syntax.Class03;

public class Task03 {
	public static void main(String[] args) {

		int month = 3;

		if (month == 1)
			System.out.println("Jan");
		else if (month == 2)
			System.out.println("Feb");
		else if (month == 3)
			System.out.println("Mar");
		else if (month == 4)
			System.out.println("Apr");
		else if (month == 5)
			System.out.println("May");
		else if (month == 6)
			System.out.println("Jun");
		else if (month == 7)
			System.out.println("Jul");
		else if (month == 8)
			System.out.println("Aug");
		else if (month == 9)
			System.out.println("Sep");
		else if (month == 10)
			System.out.println("Oct");
		else if (month == 11)
			System.out.println("Nov");
		else if (month == 12)
			System.out.println("Dec");
		else
			System.out.println("Invalid Number");

		System.out.println("---------------------------------");
		
		int a = -127;
		if (a>0)
			System.out.println("Number is Positive");
		else if (a<0)
			System.out.println("Number is Negitive");
		else 
			System.out.println("Number is Zero");
		
		System.out.println("------------------------------------");
		
		
		
		int b = 125;
		int reminder = b%2;
		
		if (reminder == 0)
			System.out.println("Numebr is Even");
		else
			System.out.println("Number is Odd");
			
		
	}

}
