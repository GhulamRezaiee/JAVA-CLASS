package com.Syntax.Class27;
//4. Create an arrayList of even numbers from 1 to 50. Using Iterator remove any number that is divisible by 5 from that arrayList.
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EvenNumber {
	public static void main (String [] args) {
		
		System.out.println("Weclom to the Game!");
		System.out.println("We want to find even numebr that are not divisible by 5.");
		System.out.print("We start from 1 and you should give us the last number. Enter the last number: ");
		
		Scanner input = new Scanner(System.in);
		int max = input.nextInt();
		
		ArrayList <Integer> evenNumbers = new ArrayList<>();
		
		for (int i = 1; i <= max; i++) {
			if (i % 2 == 0) 
				evenNumbers.add(i);			
		}

		Iterator <Integer> number = evenNumbers.iterator();
		
		while(number.hasNext()) {
			if (number.next() % 5 == 0){
				number.remove();
			}
		}
		
		System.out.println(evenNumbers);		
	}

}
