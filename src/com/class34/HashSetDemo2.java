package com.class34;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo2 {
public static void main(String[] args) {
	
	
	Set<Sweets>set1=new HashSet<>();
	Sweets sweet=new Sweets("cake");
	set1.add(sweet);
	set1.add(new Sweets("cookies"));
	set1.add(new Sweets("Ice cream"));
	set1.add(new Sweets("macaroons"));
	set1.add(new Sweets("cookies"));
	set1.add(sweet);
	System.out.println(set1.size());
	
	for(Sweets a:set1) {
		System.out.println(a.name);
	}
	
	
	Iterator<Sweets>it=set1.iterator();
	while(it.hasNext()) {
		System.out.println(it.next().name);
	}
	
	
	
	
	
	
}
}
