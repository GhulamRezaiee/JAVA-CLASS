package com.Syntax.Class29;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TaskSetCollection {
	public static void main (String [] args) {
		
		//Create a Set collection in which you need to add names of the countries. In this set
		//we want all objects to be sorted in alphabetical order. Using 2 different ways retrieve all elements from set.
		Set <String> countries = new TreeSet<>();
		countries.add("Afghanistan");
		countries.add("Monaco");
		countries.add("Bahrain");
		countries.add("Oman");
		countries.add("Chile");
		countries.add("Poland");
		countries.add("Djibouti");
		countries.add("Cuba");
		countries.add("Slovakia");
		
		for (String country:countries) {
			System.out.print(country+", ");
		}
		
		System.out.println();
		System.out.println("---------------------------------");
		Iterator <String> country = countries.iterator();
		while(country.hasNext()) {
			System.out.print(country.next()+ ", ");
		}
		System.out.println();
		System.out.println("****************************************************************************");
		
		//Create a Set of cities in which you want to make sure that insertion order is maintained. Using Iterator remove any city that starts with “A”;
		
		Set <String> cities = new LinkedHashSet<>();
		
		cities.add("Charles City");
		cities.add("Franklin");
		cities.add("Abingdon");
		cities.add("Farmville");
		cities.add("Ashland");
		cities.add("Wintergreen");
		cities.add("Richmond");
		
		System.out.println(cities);
		Iterator <String> city = cities.iterator();
		
		while (city.hasNext()) {
			
			if (city.next().toLowerCase().startsWith("a"))
				city.remove();
		}
		
		System.out.println(cities);
		System.out.println("*********************************************************************");
		
		//Create a Set collection that will hold Objects of Student Type. In this set we do not care about the insertion order. 
		//Each student object should have name and studentID. Display name of each student.
		
		Set <Student> students = new HashSet<>();
		
		students.add(new Student("Samir", 101));
		students.add(new Student("Karim", 102));
		students.add(new Student("John", 103));
		students.add(new Student("Jane", 104));
		students.add(new Student("Khan", 105));
		students.add(new Student("Tariq", 106));
		students.add(new Student("Ahmed", 107));
		
		Iterator <Student> student = students.iterator();
		
		while(student.hasNext()) {
			System.out.print(student.next().getName()+", ");
		}
			
	}
}


class Student{
	private String name;
	private int studentID;
	
	public Student(String name, int studentID){
		this.name = name;
		this.studentID = studentID;
	}
	
	public String getName() {
		return name;
	}
	
	public int getstudentID() {
		return studentID;
	}
	
}
