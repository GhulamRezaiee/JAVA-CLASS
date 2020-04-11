package com.Syntax.HomeWork25;

public class Task1 {
	/*
	 * Create an Interface ‘Shape’ with undefined methods as calculateArea and
	 * calculatePerimiter. Create 2 classes Circle & Square that implements
	 * functionality defined in the Shape Interface. Test your code.
	 * 
	 */
}
interface Shape {
	void calculateArea();
	void calculatePerimiter();
}
class Circle implements Shape {
	public static final double PI = 3.14;
	double r;
	Circle(double r) {
		this.r = r;
	}
	@Override
	public void calculateArea() {
		double area = r * r * PI;
		System.out.println("Area of circle is: " + area);
	}
	@Override
	public void calculatePerimiter() {
		double peri = 2 * PI * r;
		System.out.println("Perimeter of a circle is: " + peri);
	}
}
class Square implements Shape {
	double length;
	
	Square(double length) {
		this.length = length;
	
	}
	@Override
	public void calculateArea() {
		double area = length * length;
		System.out.println("Area of square is: " + area);
	}
	@Override
	public void calculatePerimiter() {
		double peri = 4 * length;
		System.out.println("Perimeter of a square is: "+peri);
	}
}