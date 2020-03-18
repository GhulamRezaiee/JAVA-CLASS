package com.Syntax.Class01;
import java.util.Arrays;
import java.util.Date;

public class Test {
	public static void main (String [] args ) {
		byte i1 = 127;
		short i2 = 32000;
		int i3 = 2_000_000_000;
		long i4 = 5_000_000_000L;
		float i5 = 4_900_000_000.21F;
		double i6 = 35.26;
		char i7 = 'A';
		boolean i8 = true;
		Date now = new Date();
		String message = "Hello World";
		int[] numbers = {1, 2, 8, 0, 5};
		Arrays.sort(numbers);
	
		System.out.println(Arrays.toString(numbers));
		
		int[][] number = new int[2][3];
		number[0][0] = 1;
		
		System.out.println(Arrays.deepToString(number));
		
		int[][] wNumbers= {{1, 2, 3}, {4, 5, 6}};
		
		System.out.println(Arrays.deepToString(wNumbers));
		System.out.println();
		
		
	}
}
 