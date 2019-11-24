package com.Reviewclass;

public class Robot {

	void speak(String text) {
		System.out.println(text);
		
	}void jump(int heigth){
		System.out.println("Jumping "+ heigth);
	}
	void move(String day,int time) {
		System.out.println("i run on "+day+ " at "+time+" pm");
	}
	
	
	public static void main(String[] args) {
		
		Robot me=new Robot();
		
		me.speak("Hi i am me");
		me.jump(7);
		
		me.move("monday", 8);
		String a="Bye bye!";
		me.speak(a);
		
		int value=100;
		me.jump(value);
		
		
	}
}
