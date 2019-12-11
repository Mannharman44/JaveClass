package com.class33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student {

	String name;
	int studentId;

	public Student(String name, int studentId) {
		this.name = name;
		this.studentId = studentId;

	}

	public void display() {

		System.out.println("My name is " + name + " and my id is " + studentId);
	}

}

class StudentTest {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();

		Student stu = new Student("Jon", 101);
		Student stu1 = new Student("Jim", 102);
		Student stu2 = new Student("Jack", 103);

		students.add(stu);
		students.add(stu1);
		students.add(stu2);

		stu.display();
		stu1.display();
		stu2.display();

		for (Student a : students) {
			a.display();

		}
		
		students.add(new Student("Mike",104));
		students.add(new Student("David",105));
		students.add(new Student("Eric",106));
		
		
		Iterator<Student>obj=students.iterator();
		
		while(obj.hasNext()) {
			obj.next().display();
		}
		
	}

}