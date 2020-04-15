package com.Syntax.Class27;

public abstract class Food {
 public abstract void test();
 public abstract void smell();
 public abstract void color();
}

class Fruit extends Food{
	public void test() {
		System.out.println("Fruit tests good.");
	}
	
	public void smell() {
		System.out.println("Fruit smells good.");
	}
	
	public void color() {
		System.out.println("Fruit has different color.");
	}
}

class Vegitable extends Food{

	@Override
	public void test() {
		System.out.println("vegitable test good.");
	}

	@Override
	public void smell() {
		System.out.println("vegitable smell good.");
		
	}

	@Override
	public void color() {
		System.out.println("vegitable has different color");
	}	
}

class Meat extends Food{

	@Override
	public void test() {
		System.out.println("Meat tests good.");
	}

	@Override
	public void smell() {
		System.out.println("Meat smells good.");
	}

	@Override
	public void color() {
		System.out.println("Meat has two colors");
	}
}

class Bread extends Food{

	@Override
	public void test() {
		System.out.println("Bread test good.");
	}

	@Override
	public void smell() {
		System.out.println("Bread smells good.");
	}

	@Override
	public void color() {
		System.out.println("Beard has different color.");
	}
	
}








