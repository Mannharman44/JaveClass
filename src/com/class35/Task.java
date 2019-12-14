package com.class35;
import java.util.*;
public class Task {
public static void main(String[] args) {
	
	HashMap<Integer,String>map=new HashMap<>();
	map.put(101, "Syntax");
	map.put(102, "Google");
	map.put(103, "Facebook");
	map.put(104, "Yahoo");
	map.put(105, "Syntax");
	map.put(106, "Google");
	map.put(107, "Facebook");
	
	int a=map.size();
	System.out.println(a);
	
	map.replace(104, "IBM");
	System.out.println(map);
	map.remove(107);
	System.out.println(map);
	
}
}
