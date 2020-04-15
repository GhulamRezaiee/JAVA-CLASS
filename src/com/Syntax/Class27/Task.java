package com.Syntax.Class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Task {
	public static void main(String[] args) {
		//Create an arraylist of cars and retrieve all the values using 3 different ways.
		
		ArrayList <String> cars = new ArrayList<>();
		
		cars.add("Toyota");
		cars.add("Mercedes");
		cars.add("BMW");
		cars.add("Mazda");
		cars.add("Chevy");
		cars.add("Ford");
		cars.add("GM");
		cars.add("Reno");
		
		// 1. for loop
		for (int i =0; i < cars.size(); i++) {
			System.out.print(cars.get(i)+", ");
		}
		
		System.out.println();
		System.out.println("-----------------------------");
		//2. Advance for loop
		for (String car : cars) {
			System.out.print(car+", ");
		}
		
		System.out.println();
		System.out.println("-----------------------------");
		//3. iterator
		Iterator<String> car = cars.iterator();
		while(car.hasNext()) {
			System.out.print(car.next() + ", ");
		}
		
		System.out.println();
		System.out.println("*******************************************");
		
		//Create an arrayList of words. Remove every word that ends with “e”. Use iterator
		
		ArrayList <String> words = new ArrayList<>();
		
		words.add("Water");
		words.add("inorganic");
		words.add("substance");
		words.add("hydrosphere");
		words.add("fluid");
		words.add("comprehensive");
		words.add("organisms");
		words.add("life");
		words.add("calories");
		words.add("temperature");
		
		System.out.println("All Word List:");
		System.out.println(words);
		System.out.println("---------------------------------------------");
		
		Iterator <String> word = words.iterator();
		
		while(word.hasNext()) {
			if (word.next().endsWith("e"))
				word.remove();	
		}
		
		System.out.println("Word List without word that ends with \"e\": ");
		System.out.println(words);
		
	}




}
