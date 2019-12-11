package com.class32;

import java.util.ArrayList;
import java.util.Iterator;

public class Car {

	public static void main(String[] args) {
		
		ArrayList<String>cars= new ArrayList<>();
		cars.add("Honda");
		cars.add("Toyota");
		cars.add("Ford");
		cars.add("Dodge");
				
		for(String a:cars) {
			System.out.println(a);
		}
		System.out.println("----------------------------");
		for(int i=0;i<cars.size();i++) {
			System.out.println(cars.get(i));
		}
		System.out.println("----------------------------");
		Iterator<String>str=cars.iterator();
		
		while(str.hasNext()) {
			System.out.println(str.next());
		}
		
		
		
		
		
		
		
	}
	
	
	
	
}
