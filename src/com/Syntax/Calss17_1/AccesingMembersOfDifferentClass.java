package com.Syntax.Calss17_1;

import com.Syntax.Class17.*;

public class AccesingMembersOfDifferentClass {

	public static void main(String[] args) {
		
		Employee1 emp = new Employee1();
		emp.name = "Ahmet";
		//Below variable are not available due to restriction
		//emp.lastName --> protected
		//emp.salary --> default
		//emp.ssn --> private
		
		Employee1.method1();
		//Below variable are not available due to restriction
		//emp.method2(); --> protected
		//emp.method3(); --> default
		//emp.method4(); --> private
		
		
	}
}
