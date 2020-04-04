package com.Syntax.Class22;

public class AnimalTest {
	
	public static void main(String[] args) {
		
		System.out.println("---- Create object of child class and refer it Parent class and execuite runtime polymorfism ---");
		// Non primitive casting: up casting
		Animal obj = new Tiger();
		obj.sleep();
		obj.eat(); //during of coding you see the eat() method from the Animal class (Parent)
		//but when you run the code Java first look at the child class and run the eat() method 
		//from Tiger class
		
		//obj.run(); compiler check the reference class and not able to find run() method becuase it is 
		//inside of Tiger class
		
		System.out.println("---- Accessing mehtods using Parent Class -------");
		
		Animal obj1 = new Animal();
		obj1.eat();
		obj1.sleep();
		
		System.out.println("----- Accessing Method using Child Class -------");
		
		Tiger obj2 = new Tiger();
		obj2.sleep();
		obj2.eat();//call eat() method from child class Tiger
		obj2.run();
		
		System.out.println("--------------------------------");
		
		
	}
}
