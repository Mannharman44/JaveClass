package com.class34;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
public static void main(String[] args) {
	
	
	LinkedList<String>list=new LinkedList<>();
	list.add("Hello");
	list.add("Bye");
	list.add("Hello");
	list.add("Bye");
	
	list.add(2, "How are you?");
	System.out.println(list);
	
	list.set(1, "Good bye");
	System.out.println(list);
	
	String str=list.get(1);
	System.out.println(str);
	
	for(String a:list) {
		System.out.println(a);
	}
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i));
	}
	
	Iterator<String>b=list.iterator();
	while(b.hasNext()) {
		System.out.println(b.next());
	}
	
	
	
}
}
