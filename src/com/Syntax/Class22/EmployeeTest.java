package com.Syntax.Class22;

public class EmployeeTest {
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.salary =80_000;
		emp.getPaid();
		
		FullTimeEmployee ft = new FullTimeEmployee();
		ft.salary = 90_000;
		ft.getPaid();
		
		Contractor ct = new Contractor();
		ct.hourlyRate = 50;
		ct.getPaid();
		
	}

}
