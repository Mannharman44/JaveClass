package com.class14;

public class SplitMethod {
public static void main(String[] args) {
	
	String str="If you come to class early,"
			+"then you can study more, also you can learn more,"
			+"and you can leave";
	
	String [] a=str.split(",");
	for(int i=0;i<a.length;i++) {
		
		System.out.println(a[i]);
		
	}
	System.out.println("*********");
	
	String s="Welcome To Syntax Technologies";
	String [] f=s.split(" ",3);
	System.out.println(f.length);
	
	
	for(int i=0;i<f.length;i++) {
		System.out.println(f[i]);
		String s1="Is it Saturday?Is it Raining? Do we have java class today?";
		String[] str4=s1.split("\\?");
				System.out.println(str4.length);
		
		
	}
	
	
	
	
	
	
	
}
}
