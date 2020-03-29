package com.Syntax.Class19;

public class Student {
	
	String name, address;
	
	public Student (String name, String address){
		this.name = name;
		this.address = address;
	}
	
	public void displayInfo () {
		System.out.format("The student name is %s and the address is %s.\n", name, address);
	}
	
	public static void main(String[] args) {
		Student obj = new Student("Ali", "Houston, Texas");
		obj.displayInfo();
	}
}
