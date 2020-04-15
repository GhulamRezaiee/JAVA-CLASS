package com.Syntax.Class27;

import java.util.ArrayList;
import java.util.Iterator;

public class FlowerTest {
	public static void main(String[] args) {
		//store flowers into array
		Flower[] flowerArray = {new Rose("Rose"), new Tulip("Tulip"), new Sunflower("Sunflower")};
		
		//store flowers into arraylist
		ArrayList<Flower> flowers = new ArrayList<>();
		
		flowers.add(new Rose("Rose"));
		flowers.add(new Tulip("Tulip"));
		flowers.add(new Sunflower("Sunflower"));
		//flowers.add("Rose"); cannot add string object into ArrayList of Flower Objects
		
		// call available method
		//for loop
		for (int i = 0; i < flowers.size(); i++) {
			flowers.get(i).bloom();
		}
		
		System.out.println("--------------------------");
		
		//advance for loop
		for (Flower flower:flowers) {
			flower.bloom();
		}
		
		System.out.println("---------------------------");

		// iterator
		
		Iterator <Flower> flower = flowers.iterator();
		while(flower.hasNext()) {
			flower.next().bloom();
		}
			
	}

}
