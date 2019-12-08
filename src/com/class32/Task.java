package com.class32;

import java.util.ArrayList;

public class Task {
public static void main(String[] args) {
	
	ArrayList<String>aList=new ArrayList<>();	
	aList.add("Joe");
	aList.add("Kim");
	aList.add("John");
	aList.add("Bob");
	aList.add("James");
	System.out.println(aList.isEmpty());
	int size= aList.size();
	System.out.println(size);
	
	for(String str:aList) {
		
		System.out.println(str);
	}
	
	System.out.println(aList.contains("John"));

	
	
	ArrayList bList=new ArrayList();
	bList.add("Hello");
	bList.add(100);
	bList.add(10.10);
	bList.add(true);
	bList.add('a');
	
	System.out.println(bList);
	
	
}
}
