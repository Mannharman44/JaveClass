package com.class35;
import java.util.*;
public class MapIntro {

	public static void main(String[] args) {

		HashMap<Integer,String>map=new HashMap<>();
		map.put(101,"Jon");
		map.put(102,"Jack");
		map.put(103,"Jane");
		map.put(104,"Jenny");
		
		System.out.println(map);
		boolean flag=map.isEmpty();
		if(!flag) {
			
		int size=	map.size();
			System.out.println(size);
		}
	map.put(105, "John");
	System.out.println(map);
	map.put(102,"Hasan");
	System.out.println(map);
		
		String str=map.get(105);
		System.out.println(str);
		
	map.replace(103, "Zeynep");
	System.out.println(map);
		
	map.remove(101);
	System.out.println(map);
	
	boolean flag1=map.containsKey(103);
	if(flag1) {
		map.remove(103,"Seval");
	}else {
		map.put(103, "Seval");
	}
		System.out.println(flag1);
		
	}
	
	

}
