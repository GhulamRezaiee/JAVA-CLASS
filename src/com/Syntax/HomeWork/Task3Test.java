package com.Syntax.HomeWork;

public class Task3Test {
	public static void main(String[] args) {
		Car [] cars = {new Truck (50_000, "White", 2000), new Sedan(15_000, "red", 10)};
		for (Car car : cars) {
			System.out.println (car.calculateSalePrice());
		}
		
	}
}
