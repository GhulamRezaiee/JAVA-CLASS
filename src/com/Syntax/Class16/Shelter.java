package com.Syntax.Class16;

public class Shelter {

	public static void main(String[] args) {
		//access instance variable of different class
		
		Dog puppy = new Dog();
		puppy.name = "Charly";
		System.out.println(puppy.name);
		
		//access static variable of different class
		System.out.println(Dog.breed);
		

	}

}
