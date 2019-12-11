package com.class32;

import java.util.ArrayList;
import java.util.Iterator;

public class Words {

	public static void main(String[] args) {
		
		ArrayList<String>words=new ArrayList<>();
		words.add("Hello");
		words.add("Syntaxe");
		words.add("Love");
		words.add("Ball");
		
		Iterator<String>str=words.iterator();
		while(str.hasNext()){
			if(str.next().endsWith("e")) {
				str.remove();
				
			}
		}
		System.out.println(words);
		
		

	}
	
	
	
	
}
