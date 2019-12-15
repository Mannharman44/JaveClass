package com.class36;
import java.util.*;
import java.util.Map.Entry;
public class Task {
public static void main(String[] args) {
	
	Map<String,Integer>map=new LinkedHashMap<>();
	map.put("Milk", 2);
	map.put("Tea", 3);
	map.put("Onion", 5);
	map.put("Apple", 10);
	
	map.get("Milk");
	
	map.containsKey("Apple");
	map.containsValue(2);
	
	for(Map.Entry a:map.entrySet()) {
		System.out.println(a.getKey()+" "+a.getValue());
	}
	Collection<Integer>values=map.values();
	for(Integer val:values) {
		System.out.println(val);
	}
	
	Iterator<Integer>valit=values.iterator();
	while(valit.hasNext()) {
		System.out.println(valit.next());
	}
	
	
	Set<String>keys=map.keySet();
	for(String k:map.keySet()) {
		System.out.println(k.toUpperCase()+"---->"+map.get(k));
	}
	Iterator<String>keyit=map.keySet().iterator();
	while(keyit.hasNext()) {
		String itKey=keyit.next();
		Integer val=map.get(itKey);
		System.out.println(itKey.toLowerCase()+"---->"+val);	
		
	}
	
	Set<Entry<String,Integer>>set=map.entrySet();
	for(Entry<String,Integer> en:set) {
		System.out.println(en.getKey()+"--->"+en.getValue());
	}
	
	Iterator<Entry<String,Integer>>it=set.iterator();
	while(it.hasNext()) {
		Entry<String,Integer>eit=it.next();
		String a=eit.getKey()+"-->"+eit.getValue();
		System.out.println(a);
		
	
		
	}
	
}
}
