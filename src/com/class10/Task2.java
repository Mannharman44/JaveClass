package com.class10;

public class Task2 {
public static void main(String args[]) {
	String [] name= {"india","china","usa"};
	for(int a=0; a<name.length;a++) {
		if(name[a].equals("india")) {
			System.out.println(name[a]+ ": " +"new delhi");
			
		}else if(name[a].equals("china")) {
			System.out.println(name[a]+": " +"beijing");
			
		}else {
			System.out.println(name[a]+" : " +"D.C");
			
		}
		
	}
	
	
	
	
	
}
}
