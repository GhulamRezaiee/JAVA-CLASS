package com.Syntax.Class30;
import java.util.*;

public class Task {
	public static void main(String[] args) {
		Map<String, String> countries = new TreeMap<>();
		countries.put("ALBANIA","TIRANA");
		countries.put("RWANDA","KIGALI");
		countries.put("BRAZIL","BRASILIA");	
		countries.put("JAPAN","TOKYO");
		countries.put("CYPRUS","NICOSIA");
		countries.put("NEPAL","KATHMANDU");
		
		System.out.println(countries.keySet());
		System.out.println(countries.values());
		
		Set<String> keys = countries.keySet();
		
		System.out.println("---------Print Key and Value with for each loop------------");
		for(String key:keys) {
			System.out.println(key+" capital is "+countries.get(key));
		}
		
		System.out.println("---------Print Key and Value with iterator------------");
		Iterator <String> keyIt = keys.iterator();
		while(keyIt.hasNext()) {
			System.out.println(keyIt.next()+" capitl is "+countries.get(keyIt.next()));
		}
		
		System.out.println("---------Print Value with for each loop------------");
		for(String value:countries.values()) {
			System.out.print(value+", ");
		}
		
		System.out.println();
		System.out.println("---------Print Value with iterator------------");
		Iterator <String> valueIt = countries.values().iterator();
		while(valueIt.hasNext()) {
			System.out.print(valueIt.next()+", ");
		}
	}

}
