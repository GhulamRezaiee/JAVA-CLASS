package com.Syntax.Class17;

public class Employee {
	int eID;
	int salary;
	static String nameOfCEO = "Sumair";
	
	public static void main(String[] args) {
		
		Employee employee1 = new Employee();
		employee1.eID = 1;
		employee1.salary = 25000;
		System.out.format("The employee ID is %d and the salary is %d and the CEO is %s.\n",employee1.eID, employee1.salary, nameOfCEO);
		
		Employee employee2 = new Employee();
		employee2.eID = 2;
		employee2.salary = 35000;
		System.out.format("The employee ID is %d and the salary is %d and the CEO is %s.\n",employee2.eID, employee2.salary, nameOfCEO);
		
	}

}
