package com.class17;

public class ObjectOfCarClass {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.color = "Black";
		car1.make = "BMW";
		car1.model = "M5";
		car1.year = 2019;
		car1.wheels = 4;
		car1.windows = 6;
		car1.speed = 200;
		car1.drive();
		car1.start();
		
		String color=car1.getColor();
		System.out.println("Color of the car is :"+color );
		
		
		
		
		
		Car car2 = new Car();
		car2.color = "Blue";
		car2.make = "Tesla";
		car2.model = "S";
		car2.year = 2019;
		car2.wheels = 4;
		car2.windows = 6;
		car2.speed = 250;
		car2.drive();
		car2.start();
		
		
		
		System.out.println(car2.color + car2.make);

	}
}
