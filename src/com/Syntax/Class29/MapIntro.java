package com.Syntax.Class29;

import java.util.HashMap;

public class MapIntro {
	public static void main(String[] args) {
		// HashMap does not maintain order of entry
		HashMap <String,String> hmap = new HashMap<>();
		
		// to store value into Map we use put method
		hmap.put("Name", "John");
		hmap.put("Last Name", "Smith");
		hmap.put("Address","123 Test");
		hmap.put("City","Chantilly");
		
		// how to check if map has any value
		boolean isEmpty = hmap.isEmpty();
		System.out.println("Map is empty = "+isEmpty);

		//how many elements in the Map
		int size = hmap.size();
		System.out.println("Map size is = "+size);
		
		//can we add more values to the map
		hmap.put("Zip Code", "12345");
		
		// can we store duplicate key? No, previous value will be replaced
		hmap.put("Name", "Jane");
		System.out.println(hmap);
		
		// how access the value? "Smith"--> use method get and specify the key
		System.out.println(hmap.get("Last Name"));
		
		// to remove the value
		hmap.remove("Address");
		System.out.println(hmap);
		
		//replace values in map
		hmap.replace("Zip Code", "98765");
		System.out.println(hmap);
		
		
	}

}
