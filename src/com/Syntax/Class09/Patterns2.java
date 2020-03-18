package com.Syntax.Class09;

public class Patterns2 {
	public static void main (String [] args) {
		for (int i =1; i <10; i++) {
			if (i <6 ) {
				for (int j=1; j<=i; j++) {
					System.out.print("# ");
				}
			}else {
				for (int k=10-i; k>0; k--) {
					System.out.print("# ");
				}
			}
			System.out.println();
				
		}
	}

}
