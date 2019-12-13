package com.class34;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
public static void main(String[] args) {
	
	
	HashSet<String>hset=new HashSet<>();
	hset.add("cucumber");
	hset.add("onion");
	hset.add("pepper");
	hset.add("zuccini");
	hset.add("carrot");
	hset.add("zuccini");
	
	System.out.println(hset.size());
	System.out.println(hset);
	
	Iterator<String>it=hset.iterator();
	while(it.hasNext()) {
		String a=it.next();
		System.out.println(a);
	}
	
	for(String b:hset) {
		System.out.println(b);
	}
	
	
	
	
	
	
	
}
}
