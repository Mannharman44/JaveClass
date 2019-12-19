package com.class36;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Homewo {
public static void main(String args[]) {
	
	Map<String,String>map=new HashMap<>();
	map.put("101", "Apple");
	map.put("102", "Games");
	map.put("103", "laptop");
	map.put("104", "Phone");
	
	for(Map.Entry b:map.entrySet()) {
		System.out.println(b.getKey()+" "+b.getValue());
	}
	System.out.println("******************************");
	
	
	System.out.println(map);
	
	Set<Entry<String,String>>set=map.entrySet();
	for(Entry<String,String>a:set) {
		System.out.println(a.getKey()+" "+a.getValue());
	}
	System.out.println("------------------------");
	
	Iterator<Entry<String,String>>it=set.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	
}
}
