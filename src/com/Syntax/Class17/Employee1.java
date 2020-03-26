package com.Syntax.Class17;

public class Employee1 {
	//create variables to hold name, last name, title, ssn,
	
	public static String title;
	
	public String name; //accessible everywhere
	protected String lastName; //accessible within same package
	double salary; // accessible within same package (default)
	private long ssn; // accessible only within same class
	
	public static void method1() { // accessible everywhere
		System.out.println("I am public method");
	}
	
	protected void method2() { //accessible within same package
		System.out.println("I am protected method");
	}
	
	void method3 () { // accessible within same package (default)
		System.out.println("I am default method");
	}
	
	private void method4 () {// accessible only within same class
		System.out.println("I am a private method");
	}
	
	public static void main (String [] args) {
		Employee1 emp = new Employee1();
		
		emp.name = "John";
		emp.lastName = "Smith";
		emp.salary = 90000;
		emp.ssn = 999774444;
		
		//accessing all methods
		
		method1();
		emp.method2();
		emp.method3();
		emp.method4();
		
		
	}

}
