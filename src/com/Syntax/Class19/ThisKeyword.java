package com.Syntax.Class19;

public class ThisKeyword {
	int a, b;
	
	public ThisKeyword() {
		System.out.println("I am non argument constructor");
	}
	
	public ThisKeyword (int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void sum(int a, int b) {
		//sum of which variables am i calculating?
		System.out.println("sum of local variables " +(a+b));
		System.out.println("sum of instance variables " +(this.a+this.b));
	}
	
	public static void main(String[] args) {
		ThisKeyword	obj = new ThisKeyword(10,20);
		obj.sum(100, 200);
		
		ThisKeyword obj2 = new ThisKeyword();
		obj2.sum(20, 40);
	}

}
