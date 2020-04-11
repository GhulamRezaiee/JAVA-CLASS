package com.Syntax.HomeWork25;

public class Task1Test {
	 public static void main(String[] args) {
			Shape circle=new Circle(12);
			Shape square= new Square(5);
			Shape [] shapes= {circle,square};
			for(Shape s:shapes) {
				s.calculateArea();
				s.calculatePerimiter();
				System.out.println("------");
			}
		}

}
