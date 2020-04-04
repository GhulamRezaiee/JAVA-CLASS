package com.Syntax.Class22;

public class CreditCard {
	
	double balance, interest;
	
	CreditCard(double balance){
		this.balance = balance;
	}
	
	double interest () {
		interest = balance*0.2/12;
		return interest;
	}
}


//visa Class without any overriding
class Visa extends CreditCard{
	
	Visa (double balance){
		super(balance);
	}
	
}


//AX class with overriding method
class AX extends CreditCard {
	
	AX (double balance){
		super(balance);
	}
	
	double interest () {
		interest = balance*0.24/12;
		return interest;
	}
}
