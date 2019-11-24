package com.class21;

public class Students {
String studentName;
int studentID;
static int numOfStudent;

void getInfo() {
	
	System.out.println();
}
	
	public static void main(String args[]) {
		Students obj1=new Students();
		obj1.studentName="Joe";
		obj1.studentID=1;
		Students.numOfStudent++;
		
		Students obj2=new Students();
		obj2.studentName="Nik";
		obj2.studentID=2;
		Students.numOfStudent++;
		
		
		
		Students obj3=new Students();
		obj3.studentName="Bob";
		obj3.studentID=3;
		Students.numOfStudent++;
		
		
		
	}
	
}
