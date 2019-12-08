package com.class29;

public abstract class Task {

	public void Edit() {
		System.out.println("edit");
	}
	public void close() {
		System.out.println("close");
		
	}
	public abstract void open();
	
	
	
}
class JavaFile extends Task{

	
	public void open() {
		System.out.println("to open .java file we need notepad++");
	}
	
}
class Worldfile extends Task{

	@Override
	public void open() {
		System.out.println("to open world file");
		
	}
	
}

class PDFFile extends Task{

	@Override
	public void open() {
		System.out.println("PDF file");
		
	}
	
	
}