package com.Syntax.Class01;
import java.lang.Math;

public class Test2 {
	public static void main(String[] args) {
		double num1 = 20.99;
		double num2 = 6.99;
		double add = num1 + num2;
		double subtract = num1 - num2;
		double multiply = num1 * num2;
		double divide = num1 / num2;
		System.out.println("The add of 2 numbers " + num1 + " and " + num2 + " is equal to " + add + ".");
		System.out.println("The subtract of 2 numbers " + num1 + " and " + num2 + " is equal to " + subtract + ".");
		System.out.println("The multiply of 2 numbers " + num1 + " and " + num2 + " is equal to " + multiply + ".");
		System.out.println("The divide of 2 numbers " + num1 + " and " + num2 + " is equal to " + divide + ".");

		double num3 = 3.9;
		double squar = Math.pow(num3, 2);
		System.out.println("the square of the " + num3 + " is " + squar + ".");

		int width = 5;
		int height = 8;
		int area = width * height;
		int perimiter = 2 * (width + height);
		System.out.println("The perimeter of a rectangle with width " + width + " and height " + height
				+ " is equal to " + perimiter + " and the area is " + area + ".");
		
	}
}
