package com.Syntax.Class20Task;

public class Employee {
	public static String company;
	protected int empNumber;
	double salary;
	private long ssn;
	
	void getPaid() {
		System.out.println("Employee get " + salary);
	}
	
	static void work() {
		System.out.println("Employee work at "+ company);
	}

}
