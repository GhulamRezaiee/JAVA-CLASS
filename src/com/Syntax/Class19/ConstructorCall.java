package com.Syntax.Class19;

public class ConstructorCall {
	
	public ConstructorCall() {
		System.out.println("I am non arguement constructor.");
	}
	
	public ConstructorCall (String str) {
		this();
	}
	
	public ConstructorCall(String str, String str1) {
		this("Hello");
	}
	
	public static void main(String[] args) {
		ConstructorCall obj = new ConstructorCall("Java");
	}

}
