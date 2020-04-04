package com.Syntax.Class22;

public class Bnak {
	
	double money, fee;
	
	public Bnak (double money) {
		this.money = money;
	}
	
	double chargeFee() { // overridden method
		if (money < 1_000) 
			fee = money * 0.1;
		else 
			fee = 0;
		return fee;
	}
}



class BOA extends Bnak{
	public BOA (double money) {
		super(money);
	}
}



class PNC extends Bnak{
	public PNC (double money) {
		super(money);
	}
	
	@Override //annotation to check that the method is override or not
	double chargeFee() { // overriding method
		if (money < 1_000) 
			fee = money * 0.2;
		else 
			fee = 0;
		return fee;
	}	
}

class TD extends Bnak{
	public TD (double money) { 
		super(money);
	}
	
	@Override
	double chargeFee() {
		if (money<1_000)
			fee = money * 0.3;
		else
			fee = 0;
		return fee;
	}
}

