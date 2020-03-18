package com.Syntax.Class11;

public class Task01 {

	public static void main(String[] args) {
		String [][] cars = {
				{"chevy", "GM", "Ford"},
				{"Benz","BMW", "WV", "Pourch"},
				{"Hoyonda", "Kia"},
				{"Ferari","Alfaromeo"}
		};
		for (int i = 0; i < cars.length; i++) {
			for (int j = 0; j<cars[i].length; j++) {
				System.out.print(cars[i][j] + " - ");
			}
			System.out.println();
		}
		
		System.out.println("\n-------------------------------------------");
		
		for (String[] make:cars) {
			for (String car:make) {
				System.out.print(car + " - ");
			}
			System.out.println();
		}
		
		
		System.out.println("\n***************** TASK 02 *******************\n");
		
		String [][] countries= {
				{"Canada", "USA", "Mixico"},
				{"Colombia", "Brazil", "Peru", "Ecuador"},
				{"Spain", "Greece", "UK", " France", "Italy", "Ukraine"},
				{"Algeria", "Chad", "Mali", "Sudan"},
				{"China", "UAE", "Mongolia", "Afghanistan", "Iraq"}
		};
		int count1=0;
				
		for (int r=0; r<countries.length; r++) {
			for (int c=0; c<countries[r].length; c++) {
				System.out.print(countries[r][c]+ " - ");
				count1++;
			}
			System.out.println();
		}
		
		System.out.format("\nThere are %d countries in the array. \n", count1);
		
		System.out.println("---------------------------------------------");
		
		int count2=0;
		
		for (String [] continent:countries) {
			for (String country:continent) {
				System.out.print(country+" - ");
				count2++;
			}
			System.out.println();
		}
		System.out.format("\nThere are %d countries in the array. \n", count2);
	}

}
