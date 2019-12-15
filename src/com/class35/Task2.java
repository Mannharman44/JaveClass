package com.class35;
import java.util.*;
import java.util.Map.Entry;
public class Task2 {
public static void main(String[] args) {
	
	List<String>a=new ArrayList<>();
	a.add("Hello");
	a.add("Bye");
	a.add("KIOH");
	a.add("HJYTF");
	
	
	for(int i=0;i<a.size();i++) {
		System.out.println(a.get(i));
	}
	for (String b:a) {
		
		System.out.println(b);
		
	}
	
	Iterator<String>it=a.iterator();
	while(it.hasNext()) {
		
		System.out.println(it.next());
		
		System.out.println("---------------------------------------------");
	}
	
	
	
	Map<String,Integer>cityMap=new LinkedHashMap<>();
	cityMap.put("Newyork", 101);
	cityMap.put("paris",102);
	cityMap.put("london",103);
	cityMap.put("New Delhi",104);
	cityMap.put("Houston",105);
	
	for(Map.Entry str:cityMap.entrySet()) {
		System.out.println(str.getKey()+"-----> "+str.getValue());
	}
	
	Set<Entry<String,Integer>>str1=cityMap.entrySet();
	for(Entry<String,Integer> aa:str1) {
		System.out.println(aa.getKey()+"---->"+aa.getValue());
	}
	
	Iterator<Entry<String,Integer>>obj=str1.iterator();
	while(obj.hasNext()) {
		Entry<String,Integer>obj1=obj.next();
		System.out.println(obj1.getKey()+"---->"+obj1.getValue());
	}
	

	
	

	
	
	
	
	
	
	
	
	
}
}
