package com.Syntax.Class29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Question {
	
	public static void main(String [] args) {
		//how to remove duplicates from ArrayList
		
		List <String> aList = new ArrayList<>();
		aList.add("John");
		aList.add("Jane");
		aList.add("James");
		aList.add("Jasmine");
		aList.add("Jane");
		aList.add("James");
		
		Set<String> set = new LinkedHashSet<>();
		set.addAll(aList);
		System.out.println(set);
		set.add("Alijon");
		set.add("Usman");
		
		//how to get only 1 value from set?
		
		if (set.contains("Jasmine")) {
			System.out.println("We have Jasmine");
		}
		
		//1 convert to list (Retrieve Alijon)
		List<String> list = new ArrayList<>(set);
		String name = list.get(4);
		System.out.println(name);
		
		list.add("Jane");
		list.add("Jane");
		list.add("Jane");
		list.add("Jane");
		System.out.println(list);
		
		//2 Convert to array (Retrieve Usman)
		Object[] array = set.toArray();
		System.out.println(array[5]);
		//array is a utility class that have methods to work with arrays
		Arrays.sort(array);
		
		// to sort of elements of any collection
		//collections is a utility class that have methods to work with collections
		Collections.sort(list);
		System.out.println(list);
		
	}
}
