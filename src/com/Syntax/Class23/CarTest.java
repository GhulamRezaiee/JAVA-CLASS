package com.Syntax.Class23;

public class CarTest {

	public static void main(String[] args) {
		Car bmw = new BMW("BMW");
		bmw.display();
		bmw.start();
//		bmw.navigate(); CE: undefined method in Car
		System.out.println("---------------------------------");
		Car tesla = new Tesla("Tesla");
		Car merc = new Mercedes("Mercedes");
		Car honda = new Honda ("Honda");
		
		Car [] cars = {new BMW("BMW"),new Tesla("Tesla"),new Mercedes("Mercedes"),new Honda ("Honda")};
		
		for (Car car : cars) {
			car.display();
			car.start();
			System.out.println("---------------------");
		}
		
		System.out.println("-------------------------------------------");
		
		for (int i = 0; i < cars.length; i++) {
			cars[i].display();
			cars[i].start();
			System.out.println("---------------");
		}

	}

}
