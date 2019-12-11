package com.class33;

import java.util.ArrayList;
import java.util.Iterator;

public class Recap {
public static void main(String[] args) {
	
	ArrayList<Integer>nums=new ArrayList<>();
	nums.add(100);
	nums.add(200);
	nums.add(300);
	nums.add(400);
	
	int size=nums.size();
	System.out.println(size);
	
	
	nums.add(500);
	nums.remove(2);
	
	System.out.println(nums);
	
	int elemenet=nums.get(0);
	System.out.println(elemenet);
	System.out.println("------------------------");
	for(int i=0;i<nums.size();i++) {
		System.out.println(nums.get(i));
		
	}
	System.out.println("-----------------------------");
	for (Integer a:nums) {
		System.out.println(a);
	}
	System.out.println("------------------------");
	for (int i=nums.size()-1;i>0;i--) {
		System.out.println(nums.get(i));
	}
	System.out.println("--------------------------");
	Iterator<Integer>b=nums.iterator();
	while(b.hasNext()) {
		System.out.println(b.next());
	
	}
	
}
}
