package com.Syntax.Class29;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

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
		
		// how to get all keys
		Set<Integer> keys = building.keySet();
		System.out.println(building.keySet());
		System.out.println("----------use iterator to reterieve keys one by one");
		
		Iterator <Integer> keyIt = keys.iterator();
		while(keyIt.hasNext()) {
			int key = keyIt.next();
			System.out.println("Key is "+key+" and its value is "+ building.get(key));
		}
		// getting value of key and value by for each loop
		for(Integer key:keys) {
			System.out.println("key from building map is "+key+" and the value is "+building.get(key));
		}
		System.out.println("--------------------------------------------------");

		//how to get all values
		Collection<String> values = building.values();
		System.out.println("----getting all values using for each loop -----");
		for(String value: values) {
			System.out.println("The value is: "+value);
		}
		
		System.out.println("-------getting all values using iterator---------");
		
		Iterator <String> value = values.iterator();
		
		while(value.hasNext()){
			System.out.println("value is "+value.next());
		}
		
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
