package com.Syntax.Class26;

public class Employee {
	
	//Define private variables
	private String name;
	private int age;
	private double salary;
	
	//Define public methods to give an access to private variable
	//getters
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getSalary() {
		return salary;
	}
	
	//setters
	public void setName(String name) {
		if(!name.isEmpty() && name.length()>3)
			this.name = name;
	}
	
	public void setAge(int age) {
		if (age>1)
			this.age = age;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}

}
