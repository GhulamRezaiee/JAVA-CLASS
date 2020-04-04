package com.Syntax.Class22;

public class Addition {
	
	public void add (int a, int b) {
		System.out.println(a+b);
	}
	
	public void add (int a, int b, int c) {
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		
		Addition obj = new Addition();
		obj.add(12, 15);

	}

}
