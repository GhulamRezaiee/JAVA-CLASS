package com.Syntax.Class27;

import java.util.ArrayList;
import java.util.Iterator;

//3. Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water. 

public class Drinks {

	public static void main(String[] args) {
		ArrayList<String> drinks = new ArrayList<>();
		
		drinks.add("Beer");
		drinks.add("Cook");
		drinks.add("Tea");
		drinks.add("Soda");
		drinks.add("Milk");
		drinks.add("Juice");
		
		System.out.println(drinks);
		
		for (int i = 0; i < drinks.size(); i++) {
			if(drinks.get(i).toLowerCase().contains("a") || drinks.get(i).toLowerCase().contains("e")) {
				drinks.set(i, "water");
			}
		}
		System.out.println("ArrayList after replacement");
		System.out.println(drinks);
	}

}
