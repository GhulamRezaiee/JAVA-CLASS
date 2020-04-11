package com.Syntax.Class25HW;

public class Task2Test {
	public static void main(String[] args) {
		A st1=new A(80,90,95);
		B st2=new B(89,70,90,100);
		double ave=st1.getPercentages();
		double av=st2.getPercentages();
		System.out.println("Average of Student A is: "+ave);
		System.out.println("Average of Student B is: "+av);
	}

}
