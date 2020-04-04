package com.Syntax.Class22;

public class BankTest {
	public static void main(String[] args) {
			
		Bnak bank = new Bnak(700);
		double fee = bank.chargeFee();
		System.out.println("Bank Fee: "+fee);
		
		BOA boa = new BOA(700);
		fee = boa.chargeFee();
		System.out.println("BOA Fee: "+fee);
		
		PNC pnc = new PNC(700);
		fee = pnc.chargeFee();
		System.out.println("PNC Fee: "+fee);
		
		TD td = new TD(700);
		fee = td.chargeFee();
		System.out.println("TD Fee: "+fee);
		
	}
}
