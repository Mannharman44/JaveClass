package com.class33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Recap1 {

	public static void main(String[] args) {
		
		int a;
		a=10;
		
		int b=20;
		
		
		Student s1=new Student("leo",107);
		
		List<Student>list=new ArrayList<>();
		list.add(s1);
		list.add(new Student("Zeynep",108));
		list.add(new Student("Jamie",109));
		list.add(new Student("Hasan",110));
		
		
		Iterator<Student>it=list.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next().name);
		}
		
		
	}
	
	
	
}
