package com.Syntax.Class02;

public class HomeWork1 {
	public static void main (String [] args) {
		long a = factorial (20);
		System.out.println(a);
		
		
	}
	
	public static long factorial (int number) {
		long result = 1;
		for (int factor = 2; factor <= number; factor++) {
		result *= factor;
		}
		return result;
	}
}
