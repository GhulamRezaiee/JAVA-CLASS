package com.Syntax.Class22;

public class Parent {
	Parent(){
		System.out.println("Parent class Constructor");
	}
	
	private void hello() {
		System.out.println("Hello from parent class");
	}
	
	static void bye() {
		System.out.println("Bye from parent class");
	}
}

class Child extends Parent {
	
	Child(){// we can not override constructor because constructor do not attend in inheritance
		System.out.println("Child Class Constructor");
	}
	//we can not override a private method because 
	//private members do not participate in inheritance
	//we just declaring private method inside child class
	//Override
	private void hello() {
		System.out.println("Hello from child class");
	}
	
	//@Override we can not override static method
	static void bye () {
		System.out.println("Bye from child class");
	}
	
}
