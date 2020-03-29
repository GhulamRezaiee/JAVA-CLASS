package com.Syntax.Class19;

public class Book {
	
	String bookName;
	int printingYear;
	
	public Book () {
		System.out.println("The below line shows a book information.");
	}
	
	public Book (String bookName, int printingYear) {
		this();
		this.bookName = bookName;
		this.printingYear = printingYear;
	}
	
	public void displyInfo() {
		System.out.format("The book %s printed in %d.\n",bookName, printingYear);
	}
	
	public static void main(String[] args) {
		Book obj = new Book("The war",1998);
		obj.displyInfo();
	}
	
}
