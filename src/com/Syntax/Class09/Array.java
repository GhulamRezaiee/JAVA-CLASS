package com.Syntax.Class09;

public class Array {
	public static void main (String [] args) {
		int [] grads = new int [4];
		grads [0] = 90;
		grads [1] = 67;
		grads [2] = 89;
		grads [3] = 78;
		//calculate average grade
		
		int sum = 0;
		for (int grade : grads) {
			sum += grade;
		}
		float average = sum / 4;
		System.out.println(average);
		
		System.out.println("--------------------------------------------------");
		
		String [] animals = {"Bear", "Deer", "Cat", "Fox", "Dog", "Horse"};
		for (int i = 0; i < animals.length; i++) {
			System.out.print(animals[i]+", ");
		}
		System.out.println();
		System.out.println("------------------------------");
		
		for (String animal : animals) {
			System.out.print(animal + ", ");
		}
		
	}
}
