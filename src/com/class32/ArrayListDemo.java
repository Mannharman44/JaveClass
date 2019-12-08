package com.class32;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
	ArrayList<String>arrayList=new ArrayList<>();
	arrayList.add("John");
	arrayList.add("Jane");
	arrayList.add("Jack");
		
System.out.println(arrayList.get(1));	
		
	arrayList.add("James");
	arrayList.add("John");
	arrayList.add("Jane");
	
	int size=arrayList.size();
	System.out.println(size);
	
	
	ArrayList<Integer>numArrList=new ArrayList<>();
	numArrList.add(100);
	numArrList.add(200);
	numArrList.add(300);
	
	numArrList.set(0, 1000);
	
	System.out.println(numArrList.get(2));
	
	
	for(Integer a:numArrList) {
		System.out.println(a);
		
	}
	for(int n=0;n<numArrList.size();n++) {
		System.out.println(numArrList.get(n));
	}
	
	}

}
