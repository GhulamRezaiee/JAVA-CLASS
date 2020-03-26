package com.Syntax.Class17;

public class AccessingMembersOfClass { 
	
	//accessing member of Employee1 Class
	
	public static void main(String[] args) {
		Employee1 emp = new Employee1();
		
		emp.name = "Faisal";
		emp.lastName = "Sakhi";
		emp.salary = 100000;
		//emp.ssn = 888225555; CE: field ssn is not visible because it is private
		
		Employee1.method1();
		emp.method2();
		emp.method3();
		// emp.method4(); CE: method4 is not visible
		
		
	}

}
