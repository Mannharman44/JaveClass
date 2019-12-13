package com.class34;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorUsage {
public static void main(String[] args) {
	
	
	List<String>list=new ArrayList<>();
	list.add("jon");
	list.add("Bobby");
	list.add("Jay");
	list.add("Harman");
	list.add("jon");
	list.add("Helen");
	
	for(int i=0;i<list.size();i++) {
		if(list.get(i).length()<=4) {
			list.remove(i);
		}
	}
	System.out.println(list);
	
	List<String>list1=new ArrayList<>();
	list1.add("jon");
	list1.add("Bobby");
	list1.add("Jay");
	list1.add("Harman");
	list1.add("jon");
	list1.add("Helen");
	Iterator<String>it=list1.iterator();
	while(it.hasNext()) {
		if(it.next().length()<=4){
			it.remove();
		}
	}
	
	System.out.println(list1);
	
	
}
}
