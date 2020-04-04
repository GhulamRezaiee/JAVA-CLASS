package com.Syntax.Class22;

public class OverloadingMain { // Java always look for this main method with this signature
	public static void main(String[] args) {
		System.out.println("Method with String array arguments");
		// we can call the other main methods this ways
		OverloadingMain.main("str"); 
		main("Hi");
		main("hello","world");
		main(new int[2]);
		
		
	}
	
	public static void main (int [] args) {
		System.out.println("Method with int array arguments");
	}
	
	public static void main (String args) {
		System.out.println("Method with String arguments");
	}
	
	public static void main (String args, String args1) {
		System.out.println("Method with two String arguments");
	}
	
	//if we change sequence of parameter, Java accept the overloading
	public static void main (String str, int num) {
		System.out.println("Method with String and int");
	}
	public static void main (int num, String str) {
		System.out.println("Method with int and String");
	}
}
