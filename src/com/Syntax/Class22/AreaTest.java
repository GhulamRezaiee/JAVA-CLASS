package com.Syntax.Class22;

public class AreaTest {
	public static void main(String[] args) {
		HW obj = new HW();
		
		int area = obj.area(4);
		System.out.println("Square Area "+ area);
		
		area = obj.area(10, 24);
		System.out.println("Rectangle area "+ area);
		
		area = obj.area(10,20,15);
		System.out.println("Box area "+ area);
		
		String str = "Hello World";
		System.out.println(str.substring(6));
		System.out.println(str.substring(0,5));
	}
}
