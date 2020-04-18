package com.Syntax.Class29;
import java.util.HashMap;

public class HW {
	public static void main(String [] args) {
		HashMap <Integer, String> building = new HashMap<>();
		
		building.put(1, "Google");
		building.put(2, "Syntax");
		building.put(3, "Yahoo");
		building.put(3, "Apple");
		building.put(4, "Sumsung");
		building.put(5, "Amazon");
		building.put(6, "Netflix");
		building.put(7, "Netflix");
		System.out.println("Map update the value if see the doublicate key");
		System.out.println(building);
		
		System.out.println("-------------------------------------");
		
		//Number of entry
		System.out.println("Number of Entry is: "+building.size());
		
		System.out.println("--------------------------------------");
		//Update company on a 4th floor 
		building.replace(4, "HBO");
		System.out.println("replace 4th floor company with HBO");
		System.out.println(building);
		
		System.out.println("---------------------------------------");
		
		//Remove company on the 7th floor
		building.remove(7);
		System.out.println("Remove 7th floor company");
		
		//Print your map
		System.out.println(building);
		
	}

}
