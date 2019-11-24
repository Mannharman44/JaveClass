package com.class17;

public class Computer {

	String brand,name,mouse;
	boolean keyboard;
	int size,screen,ram,memory;
	
	
	void playGames() {
		System.out.println("i can play games on my : "+name);
		
	}
	void javaCoding() {
		System.out.println("i can do java coding on my : "+ name );
		
	}
	void watchMovie() {
		System.out.println("i can watch movie on my : "+ name);
		
		
	}
	public static void main(String[] args) {
		
		Computer comp1=new Computer();
		comp1.brand="apple";
		comp1.name="macbook pro";
		comp1.memory=250;
		
		System.out.println("i have a: "+comp1.brand+comp1.name );
		comp1.playGames();
		comp1.javaCoding();
		comp1.watchMovie();
		
		Computer comp2=new Computer();
		comp2.brand="Dell";
		comp2.name="420";
		comp2.memory=150;
		comp2.watchMovie();
		comp2.javaCoding();
		comp2.playGames();
		
		
		
	}
}
