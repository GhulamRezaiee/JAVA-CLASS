package com.Syntax.Class22;

public class Recap {
	
	public void Hello () {
		System.out.println("Hello");
	}
	
	public void Hello (String name) {
		System.out.println("Hello "+name);
	}
	
// CE: Overloading is not possible by changing access modifier	
//	private void Hello (String str) {
//		System.out.println(str);
//	}
	
// CE: Overloading is not possible by changing return type 	
//	public String Hello (String name) {
//		return name;
//	}
	
// In method overloading method signature must be different
// Method signature contain : Method Name (Method Parameters)

}
