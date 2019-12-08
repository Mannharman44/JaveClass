package com.class29;

public class Test1 {
public static void main(String[] args) {
	

	Task obj=new JavaFile();
	obj.Edit();
	obj.close();
	obj.open();
	
	Task obj1=new Worldfile();
	obj1.Edit();
	obj1.close();
	obj1.open();
	
	Task obj2=new PDFFile();
	obj2.Edit();
	obj2.close();
	obj2.open();
	
}	
}
