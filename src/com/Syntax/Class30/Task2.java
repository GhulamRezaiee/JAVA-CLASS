package com.Syntax.Class30;
import java.util.*;
import java.util.Map.Entry;
public class Task2 {
	//Create a map of Best Buy store. Place
	//item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
	//Retrieve all keys and values from a Best Buy map using EntrySet.
	public static void main(String[] args) {
		Map<Integer, String> bestBuy = new HashMap<>();
		bestBuy.put(7664847, "Printer");
		bestBuy.put(7879885, "TV");
		bestBuy.put(7279825, "4K Monitors");
		bestBuy.put(7459385, "Tablets");
		bestBuy.put(7254385, "Speaker");
		bestBuy.put(7831647, "Dryer");
		bestBuy.put(7221346, "Smart Water Assistant");
		bestBuy.put(7632154, "Game");
		
		Set<Entry<Integer, String>> lists = bestBuy.entrySet();
		
		System.out.println("----------- list of items from for each Loop -------------");
		for (Entry<Integer, String> list:lists) {
			System.out.format("The item number %d is %s.\n",list.getKey(),list.getValue());
		}
		
		System.out.println("--------------- list of items with iterator--------------");
		
		Iterator <Entry<Integer, String>> listIt = lists.iterator();
		
		while(listIt.hasNext()) {
			Entry<Integer, String> it = listIt.next();
			int key = it.getKey();
			String value = it.getValue();
			System.out.format("The item number %d is %s.\n",key,value);
		}
	}
}
