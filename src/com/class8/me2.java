package com.class8;

public class me2 {

	 public static void main(String args[]) {
		int me[]= {2,4,5,7,9};
	    change(me);
	    
	    for(int y:me)
	    	System.out.println(y);
	    
}
	public static void change(int x[]) {
		for (int counter=0;counter<x.length;counter++)
		x[counter]+=5;
	}
	 
	 
	 
	 
}
