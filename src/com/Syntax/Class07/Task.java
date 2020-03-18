package com.Syntax.Class07;

public class Task {
	public static void main (String [] args) {
		int i = 1;
		while (i<101){
			System.out.print(i+" ");
			i++;
			}
		
		System.out.println();
		System.out.println("--------------------------------------------------------------");
		
		
		int a = 20;
		while (a>1) {
			System.out.print(a+" ");
			a-=2;
		}
		
		System.out.println();
		System.out.println("--------------------------------------------------------------");
		
		int min = 20;
		int max = 50;
		while (min<max) {
			if (min%2 != 0)
				System.out.print(min + " ");
			min++;
		}
	}
	
}
