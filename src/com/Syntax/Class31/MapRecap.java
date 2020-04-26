package com.Syntax.Class31;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapRecap {
	public static void main(String[] args) {
		//let's create hashmap of countries with capitals
		Map<String, String> hmap = new HashMap<>();
		
		hmap.put("US", "Washington DC");
		hmap.put("Russia", "Moscow");
		hmap.put("France", "Paris");
		hmap.put("Tajikistan", "Dushanbe");
		hmap.put("Italy", null);
		hmap.put(null, "some value");
		hmap.put(null, "another value");//Duplicate key, previous value will be overwritten
		hmap.put("Germany", null);
		System.out.println(hmap);
		
		// how to get all keys from a map? keySet(), entrySet();
		Set<String> keys = hmap.keySet();
		Iterator <String> it = keys.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("------Keys and values Using entry set----------");
		Set<Entry<String,String>> entries = hmap.entrySet();
		Iterator<Entry<String,String>> iter = entries.iterator();
		while(iter.hasNext()) {
			Entry <String, String> entry = iter.next();
			System.out.println(entry.getKey()+" : "+ entry.getValue());
		}
		
		
		
		//how to get only values from a map? values(); entrySet():
		System.out.println("---------values using values() method----------");
		Collection <String> values = hmap.values();
		it = values.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
		//let's create a hashtable of countries with capitals
		
		Map<String, String> htable = new Hashtable<>();
		
		htable.put("US", "Washington DC");
		htable.put("Russia", "Moscow");
		htable.put("France", "Paris");
		htable.put("Tajikistan", "Dushanbe");
		//htable.put("Italy", null); --> we cannot store null value inside hashtable
		//htable.put(null, "some value"); --> we cannot store null key inside hashtable
		System.out.println(htable);
		
			
	}

}
