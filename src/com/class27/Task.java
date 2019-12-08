package com.class27;

public class Task {
public static void main(String[] args) {
	Student obj=new SyntaxStudent();
	obj.study();
	obj.homeWork();
	Student obj1=new CollegeStudent();
	obj1.homeWork();
	obj1.study();
	
}
}

class Student{
	
	void study() {
		System.out.println("Student study 3 hours");
	}
	
	void homeWork() {
		System.out.println("Student does homework for 2 hours a day");
	}
	
}
class SyntaxStudent extends Student{
	void study() {
		System.out.println("Syntax Student study 4 hours");
	}
	void repl() {
		System.out.println("Syntax Student has to do repl assiments");
	}
	
}
class CollegeStudent extends Student{
	void homeWork() {
		System.out.println("College Student does homework for 3 hours a day");
	}
	
	void playSports() {
		System.out.println("College Student Plays Football");
		
	}
	
}
class SchoolStudent extends Student{
	void groupWork() {
		System.out.println("School Student has to do group work");
	}
	
}
