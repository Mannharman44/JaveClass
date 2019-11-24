package com.class24;

public class Teacher {
	
	public char gender;
	public int numStudents,idNum;
	
	 Teacher(char gender,int numStudents,int idNum) {
		this.gender=gender;
		this.numStudents=numStudents;
		this.idNum=idNum;
		
	}
	
	public void display() {
	System.out.println(gender+" "+numStudents+" "+idNum);
	}
	

}
