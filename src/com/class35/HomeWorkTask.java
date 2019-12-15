package com.class35;
import java.util.*;
import java.util.Map.Entry;
public class HomeWorkTask {
public static void main(String[] args) {
	
	Map<Integer,String>stores=new TreeMap<>();
	stores.put(10200, "TV");
	stores.put(10300, "PS4");
	stores.put(10400, "Xbox 1");
	stores.put(10500, "Mac Book");
	stores.put(10600, "Printer");
	stores.put(10700, "Phone");
	
	System.out.println(stores);
	
	
	
	for(Entry a:stores.entrySet()){
		System.out.println(a.getKey()+"= "+a.getValue());
	}
	System.out.println("----------------------------------");
	Set<Entry<Integer,String>>set=stores.entrySet();
	for(Entry<Integer,String> b:set) {
		System.out.println(b.getKey()+"= "+b.getValue());
		
	}
	System.out.println("---------------------------------------");
	Iterator<Entry<Integer,String>>it=set.iterator();
	while(it.hasNext()) {
		Entry<Integer,String>en=it.next();
		String a =en.getKey()+"= "+en.getValue();
		System.out.println(a);
		
		
	}
	
	
	
}
	
}
