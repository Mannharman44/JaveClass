package com.class17;

public class Phone {
String name,color;
int price,size;

void speak() {
		
	System.out.println("i have a " +color+ " "+name+ " with "+ size+ " inch screen and it cost "+price);
	
}






public static void main(String[] args) {
	Phone ph1=new Phone();
	ph1.name= "iPhone";
	ph1.color="Black";
	ph1.price=500;
	ph1.size=6;
	ph1.speak();
	
	Phone ph2=new Phone();
	ph2.name= "Android";
	ph2.color="Blue";
	ph2.price=400;
	ph2.size=5;
	ph2.speak();
	
	Phone ph3=new Phone();
	ph3.name= "Nokie";
	ph3.color="Green";
	ph3.price=300;
	ph3.size=4;
	ph3.speak();
	
	
	
	
	
}	
}


