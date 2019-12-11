package com.class32;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args) {
		
		ArrayList<String>arrayList=new ArrayList<>();
		arrayList.add("John");
		arrayList.add("Jane");
		arrayList.add("Jack");
		
		Iterator<String>it=arrayList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
