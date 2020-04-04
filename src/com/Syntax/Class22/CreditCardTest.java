package com.Syntax.Class22;

public class CreditCardTest {
	public static void main(String[] args) {
		
		CreditCard cc = new CreditCard(1200);
		double interest = cc.interest();
		System.out.println("Credit card interest is: "+interest);
		
		Visa visa = new Visa(1200);
		interest = visa.interest();
		System.out.println("Visa interest is: "+interest);
		
		AX ax = new AX(1200);
		interest = ax.interest();
		System.out.println("AX interest is: "+interest);
	}
}
