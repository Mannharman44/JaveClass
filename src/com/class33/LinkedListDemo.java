package com.class33;


import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> list=new LinkedList<>();
		list.add("Hello");
		list.add("Bye");		
		System.out.println(list.size());
		
		list.add("Hello1");
		list.add("Bye1");
		
		System.out.println(list.get(1));
		
		list.set(2, "Hi");
		System.out.println(list);
		
		Set<String>a=new HashSet<>();
		
		
		
	}
	
	
	
}
