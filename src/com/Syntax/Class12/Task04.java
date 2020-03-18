package com.Syntax.Class12;

public class Task04 {
	public static void main (String [] args) {
		System.out.println("-------------- Task 1 -----------------------------");
		
		String sentence = "Write a program to get a new String.";
		String newSentence = sentence.replace(" ","");
		System.out.println(sentence);
		System.out.println(newSentence);
		
		System.out.println("---------------- Task 2 ---------------------------");
		
		String combination = "There are 3 &, shape 45 * shape, and 90837 ^.";
		String alpha = combination.replaceAll("[^A-Za-z]", "");
		int numberOfAlpha = alpha.length();
		System.out.println(combination);
		System.out.println(alpha);
		System.out.println("The number of alpha characters are " + numberOfAlpha);
		
		System.out.println("------------------ Task 3 -------------------------");
		
		String quastions = "Is it saturday? Is it raining? Do we have a Java Class today?";
		String [] quastion = quastions.split("\\?");
		int numberOfQuastion = quastion.length;
		System.out.println(numberOfQuastion);
		
		
	}
}
