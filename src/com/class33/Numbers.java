package com.class33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Numbers {
public static void main(String[] args) {
	
	
	List<Integer>nums=new ArrayList<>();
	
	
	for(int i=2;i<=50;i++) {
		if(i%2==0) {
			nums.add(i);
		}
		
	}
	System.out.println(nums);
	
	Iterator<Integer>it=nums.iterator();
	while(it.hasNext()) {
		if(it.next()%5==0) {
			it.remove();
			
		}
	}
	System.out.println(nums);
	
	
}
}
