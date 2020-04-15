package com.Syntax.Class27;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListRecap {
	public static void main(String[] args) {
		// lets Arraylist that stores Double type of objects
		//1. generic collection / arraylist
		ArrayList<Double> alist = new ArrayList<>();
		
		alist.add(10.99);
		alist.add(12.90);
		alist.add(100.99);
		
		
		System.out.println(alist);
		System.out.println(alist.isEmpty());
		//replace element
		alist.set(1, 13.90);
		
		System.out.println(alist);
		//remove element
		alist.remove(13.90);
		//retrieve single element
		System.out.println(alist.get(1));
		//retrieve all elements from collection
		//1. use advanced / enhanced for loop
		for (Double a:alist) {
			System.out.println(a);
		}
		
		System.out.println("-------------------");
		//2. for loop
		for (int i = 0; i<alist.size(); i++) {
			System.out.print(alist.get(i)+" ");
		}
		
		System.out.println();
		System.out.println("--------------------");
		//3. iterator
		Iterator <Double> iterator = alist.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
		
		
		System.out.println();
		System.out.println("***************************");
		
		//2.non generic collection / arraylist
		
		ArrayList obj = new ArrayList();
		obj.add("hello");//Store single object
		obj.add(100);
		obj.add('C');
		obj.addAll(alist);//Store collection object
		
		System.out.println(obj);
		
		System.out.println("-------------------");
		for (Object o:obj) {
			System.out.print(o +" ");
		}
		
	}

}
