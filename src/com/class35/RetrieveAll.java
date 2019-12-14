package com.class35;
import java.util.*;
public class RetrieveAll {
public static void main(String[] args) {
	
	Map<String,String>pMap=new LinkedHashMap<>();
	pMap.put("Name", "Harman");
	pMap.put("LastName", "Mann");
	pMap.put("Address", "123 Test");
	pMap.put("City", "Dallas");
	pMap.put("State", "TX");
	
	System.out.println(pMap);
	String value=pMap.get("State");
	System.out.println(value);
	
	Set<String>keys=pMap.keySet();
	
	for(String key:keys) {
		System.out.println(pMap.get(key));
	}
		
	Iterator<String>keysit=keys.iterator();
	while(keysit.hasNext()) {
		System.out.println(keysit.next());
	}
	
	Collection<String>values=pMap.values();
	for(String val:values) {
		System.out.println(val);
	}
	
	Iterator<String>valesit=values.iterator();
	while(valesit.hasNext()) {
		System.out.println(valesit.next());
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
}
