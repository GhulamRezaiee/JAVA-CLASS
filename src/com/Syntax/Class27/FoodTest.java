package com.Syntax.Class27;

//2. hw create food class that will have 3 undefined methods and it will have 4 subclasses;
//create a collection of food and using 3 ways execute methods

import java.util.ArrayList;
import java.util.Iterator;

public class FoodTest {
	public static void main(String[] args) {
		ArrayList <Food> foods = new ArrayList<>();
		foods.add(new Fruit());
		foods.add(new Vegitable());
		foods.add(new Meat());
		foods.add(new Bread());
		
		for (int i = 0; i < foods.size(); i++) {
			foods.get(i).test();
			foods.get(i).smell();
			foods.get(i).color();
		}
		
		System.out.println("--------------------------------");
		
		for (Food food:foods) {
			food.test();
			food.smell();
			food.color();
		}
		
		System.out.println("--------------------------------");
		
		Iterator <Food> food = foods.iterator();
		while(food.hasNext()) {
			Food item = food.next();
			item.test();		
			item.smell();
			item.color();
		}
	}
}
