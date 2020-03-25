package com.Syntax.Class16;

public class Dog {
	
	//instance variable
	String name, size;
	int age;
	
	//static variable
	static String breed = "Huscky";
	static int paws = 4;
	static int tail = 1;
	static int eyes = 2;
	
	
	
	void displayDog() {
		System.out.format("Dog name is %s and it is %s dog and its age is %d. \n",name,size,age);
		System.out.format("Dogs breed is %s and it has %d paws and %d tail.\n",breed,paws,tail);
	}
	
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		// how to access instance variables? --> by creating an object and using reference variable.
		dog1.name = "Lucy";
		dog1.size = "Big";
		dog1.age = 5;
		dog1.age = 6;
		dog1.displayDog();
		
		//how to access static variable? --> static variables belong to the class --> accessed by calssName
		System.out.println(Dog.breed);
		System.out.println(dog1.breed);// Compiler warning: access static variable in static way 
		System.out.println(breed);

		//Changing value of static variable
		breed = "Bulldog";
		
		Dog dog2 = new Dog();
		
		dog2.name = "Sharik";
		dog2.size = "Small";
		dog2.age = 2;
		dog2.displayDog();
		
		Dog dog3 = new Dog();
		
		dog3.name = "Pepsi";
		dog3.size = "Big";
		dog3.age = 10;
		dog3.displayDog();
		
		
	}

}
