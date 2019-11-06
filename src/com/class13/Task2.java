package com.class13;

public class Task2 {
public static void main(String[] args) {
	String name="racecar";
	 
	for(int a=name.length()-1;a>=0;a--) {
		
		System.out.print(name.charAt(a));
	}
	
	
	String s="hellourwe";
	int middle=s.length()/2;
	
	if (!s.isEmpty()) {
		if(s.length()%2!=0&&s.length()>=3) {
			System.out.println(s.charAt(middle));
		}
	}
	
}
}
