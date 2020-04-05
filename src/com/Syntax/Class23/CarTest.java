package com.Syntax.Class23;

public class CarTest {

	public static void main(String[] args) {
		Car bmw = new BMW("BMW");
		Car tesla = new Tesla("Tesla");
		Car merc = new Mercedes("Mercedes");
		Car honda = new Honda ("Honda");
		
		Car [] cars = {new BMW("BMW"),new Tesla("Tesla"),new Mercedes("Mercedes"),new Honda ("Honda")};
		
		for (Car car : cars) {
			car.display();
			car.start();
			System.out.println("---------------------");
		}

	}

}
