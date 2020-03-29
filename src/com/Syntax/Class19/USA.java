package com.Syntax.Class19;

public class USA {
	// create variables to hold state and capital of the state
	String state, stateCapital;
	
	//create constructor 
	public USA(String state, String stateCapital){
		this.state = state;
		this.stateCapital = stateCapital;
	}
	
	public void displayState() {
		System.out.println(state);
	}
	
	public void displayStateCapital() {
		System.out.println(stateCapital);
	}
	
	public void displayInfo() {
		displayState();
		displayStateCapital();
	}

	public static void main(String[] args) {

		USA state1 = new USA("Texas","Austin");
		
		state1.displayState();
		state1.displayStateCapital();
		
		state1.displayInfo();
		
	}

	
}
