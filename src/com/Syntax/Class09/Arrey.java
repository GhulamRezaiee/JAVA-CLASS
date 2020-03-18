package com.Syntax.Class09;

public class Arrey {
	public static void main (String [] args) {
		
		//declare an array and initialize it and store value
		
		int [] array = new int [4];
		array [0] = 10;
		array [1] = 20;
		array [2] = 30;
		array [3] = 40;
		
		System.out.println(array[1]);
	
		String array1 [] = new String [3];
		array1[0] = "BMW";
		array1[1] = "Honda";
		array1[2] = "Toyota";
		System.out.println("I am driving "+array1[2]);
		
		int numbers[] = new int [3];
		numbers[0] = 100;
		numbers[1] = 200;
		numbers[2] = 300;
		//change the value of number[1]
		
		numbers[1] = 2000;
		System.out.println(numbers[0]+numbers[1]);
		
	}

}
