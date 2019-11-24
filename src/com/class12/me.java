package com.class12;

class person{
	String name;
	int age;
	
	void speak() {
		for(int i=0;i<4;i++) {
		System.out.println("My name is : "+name+ " and i am "+age+ " years old");
		}
	}
	
}



public class me {
	public static void main(String[] args) {
		person a=new person();
		a.name="Harman";
		a.age=99;
		a.speak();
		
		person b=new person();
		b.name="jon";
		b.age=98;
		b.speak();
		
		
		
			
	}

}
