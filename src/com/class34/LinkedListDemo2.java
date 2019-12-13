package com.class34;

import java.util.LinkedList;

class Sweets {

	String name;

	Sweets(String name) {
		this.name = name;
	}

	public void iLove() {
		System.out.println("I love " + name);
	}

}

public class LinkedListDemo2 {
	public static void main(String[] args) {

		LinkedList<Sweets>list=new LinkedList<>();
		list.add(new Sweets("Chocolate"));
		list.add(new Sweets("Cake"));
		list.add(new Sweets("Cookies"));
		list.add(new Sweets("Macarrons"));
		
		for(Sweets a:list) {
			System.out.println(a.name);
			a.iLove();
			
		}
		
		Sweets mysweet=list.get(2);
		mysweet.iLove();
		
		
		list.get(2).iLove();
		
		String str="Hello 123";
		str.replace("123", "456").trim();
		
		Integer num=100;
		String newnum=num.toString().replace("100", "200");
		System.out.println(newnum);
		
		
		
	}
}
