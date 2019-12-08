package com.class29;



public abstract class Phone {

	public void makeCall() {
		System.out.println("call home");
	}
	
	public void sendText() {
		System.out.println("Send Text");
		
	}
	public abstract void takePic();
	
	public abstract void playGames();
	
}
