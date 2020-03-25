package com.Syntax.Class16;

public class InstanceVariable {
	String name ="John"; // instance Variable
	
	public static void main(String[] args) {
		String name = "Yunus";
		System.out.println(name);
	
		InstanceVariable obj = new InstanceVariable();
		System.out.println(obj.name);
		
		obj.name = "Ali";
		System.out.println(name);
		System.out.println(obj.name);
		
		//change value of local variable
		name = "Farid";
		System.out.println(name);
		
	}

}
