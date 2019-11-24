package com.class20;

public class Myself  {
public static void main(String[] args) {
	MySonMath son1=new MySonMath();
	son1.name="jon";
	son1.add1();
	son1.add2(5,5);
	
	int a=son1.add3(4, 5);
	if(a==12) {
		System.out.println("good job");	
	}else {
		System.out.println("no good");
	}
	
	Myself1 myself=new Myself1();
	boolean good=myself.checkResult(12, a);
	if (good) {
		System.out.println("good job "+son1.name);
		
	}else {
		System.out.println("no good "+son1.name);
	}
	
}
}
