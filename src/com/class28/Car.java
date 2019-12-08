package com.class28;

public class Car {

	String make, model;
	
	Car(){
		
		System.out.println("i am non argument");
	}
	
	Car(String make,String model){
		this.make=make;
		this.model=model;
		
	}
	
}
class Tesla extends Car{
	
	boolean autopilot;
	
	Tesla (){
		super();
		System.out.println("i am a non argument in child class");
		
	}
	Tesla(String make,String model,boolean autopliot){
		super(make,model);
		this.autopilot=autopilot;
		
	}
	
	public void displayInfo() {
		
		System.out.println("Car "+make+" "+model+" has an autopilot "+autopilot);
		
		
	}
	
}