package com.class30;

public interface Drivable {
		
	boolean DRIVE_FAST=true;
	
	
	 void drive();
}
class Cars{
	
	public void stop() {
		System.out.println("Car stops by pressing breaks");
	}
}
class Toyota extends Cars implements Drivable{

	@Override
	public void drive() {
		System.out.println("Toyota can drive");
	}
}