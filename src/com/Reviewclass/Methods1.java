package com.Reviewclass;

public class Methods1 {

	public static void main(String[] args) {
		Add obj=new Add();
		obj.Palindrome();
		
		
	}
	
}
class Add{
	String a="jdid";
	String b="";
	
	void  Palindrome() {
		for (int i=a.length()-1;i>=0;i--) {
			b=b+a.charAt(i);
			
		}
		if (a.equals(b)) {
			System.out.println("Its good");	
		
		}else {
			System.out.println("no good");
		}
		
	}
	
	
	
}