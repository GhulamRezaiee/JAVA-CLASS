package com.Syntax.Class19;

public class TestClass {
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		
		//access variable from own class
		dog.breed = "Huskey";
		//access variable from parent class
		dog.color = "Gray";
		dog.fur = "Too Much";
		dog.size = "big";
		
		// access method from own class
		dog.bark();
		// access methods from parent class
		dog.beWild();
		dog.eat();
		dog.sleep();
		
		Dog.age = 2;
		Dog.display();
		
		Animals animal = new Animals();
		//can access only features define within its own class
		animal.color = "Any";
		animal.fur = "Any";
		animal.size = "Any";
		
		
		animal.sleep();
		animal.beWild();
		animal.eat();
		//we can not access to the variable and method from child class dog for object animal
		
	}

}
