package com.Syntax.Class26;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		//create an array list with names
		
		ArrayList<String> arrayList=new ArrayList<>();
		//adding String Object into arrayList
		arrayList.add("John");
		arrayList.add("Gulbahar");
		
		//access element from arrayList
		String secondElement=arrayList.get(1);
		System.out.println(secondElement);
		
		//array list is dynamic array
		arrayList.add("Jane");
		arrayList.add("James");
		
		//how to get number of elements inside array list?
		int size=arrayList.size();
		System.out.println(size);
		
		arrayList.add("Hichem");
		System.out.println(arrayList.size());
		
		arrayList.remove("John");
		System.out.println(arrayList.size());
		
		arrayList.add("Hichem");
		System.out.println(arrayList);
		
		arrayList.set(1, "Ahmed");
		System.out.println(arrayList);
		
		//how to retrieve values from array list 1 by 1?
		for(int i=0; i<arrayList.size(); i++) {
			String element=arrayList.get(i);
			System.out.println(element);
		}
		System.out.println("------------------------");
		
		for(String str: arrayList) {
			System.out.println(str);
		}
	}
}