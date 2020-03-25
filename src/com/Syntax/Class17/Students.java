package com.Syntax.Class17;

public class Students {
	String studentName;
	int studentID;
	
	static int numberOfStudent = 0;
	
	public static void main(String[] args) {
		
		Students student1 = new Students();
		student1.studentName = "John";
		student1.studentID = 11;
		numberOfStudent++;
		
		Students student2 = new Students();
		student2.studentName = "Miryam";
		student2.studentID = 12;
		numberOfStudent++;
		
		Students student3 = new Students();
		student3.studentName = "Gary";
		student3.studentID = 13;
		numberOfStudent++;
		
		System.out.format("Total number of studends are %d. \n",numberOfStudent);
	
	}

}
