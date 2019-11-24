package com.class24;

public class Book1 {
	
	public String type;
	public int numPages;
	
	Book1(String type){
		this.type=type;
		
	}Book1(String type, int numPages){
		this.type=type;
		this.numPages=numPages;
		
	}public void display() {
		System.out.println(this.type+" "+this.numPages);
	}
	public static void main(String[] args) {
		Book1 book1=new Book1("Funny");
		Book1 book2=new Book1("Scary",500);
		
		
		
		book1.display();
		book2.display();
	}
}
