package com.Syntax.Class09;

public class Capital {

	public static void main(String[] args) {
		
		String [] countries = { "USA", "India", "Iran", "Iraq", "UAE", "China"};
		for (String country : countries) {
			switch(country) {
			case "USA":
				System.out.println("DC is the capital of " + country);
				break;
			case "India":
				System.out.println("New Delhi is the capital of " + country);
				break;
			case "Iran":
				System.out.println("Tehran is the capital of " + country);
				break;
			case "Iraq":
				System.out.println("Baghdad is the capital of " + country);
				break;
			case "UAE" :
				System.out.println("Abu Dhabi is the capital of " + country);
				break;
			case "China" :
				System.out.println("Beijing is the capital of " + country);
				break;
			
			}
		}
		

	}

}
