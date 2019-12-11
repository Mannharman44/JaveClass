package com.class33;

import java.util.ArrayList;

import java.util.List;

public class Drinks {
public static void main(String[] args) {
	
	
	List<String>drinks=new ArrayList<>();
	drinks.add("coffee");
	drinks.add("Water");
	drinks.add("Soda");
	drinks.add("Milk");
	
	  for(int i=0; i < drinks.size(); i++) {
  	      if(drinks.get(i).contains("a")|| drinks.get(i).contains("e") ) {
  	      	drinks.set(i, "water");	
			
  	      }
			
			}
	  				System.out.println(drinks);
}
	
	
	
	
}

