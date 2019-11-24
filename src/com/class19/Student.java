package com.class19;

public class Student {

	char getGrade(int score) {
		char grade;
		if (score > 90) {
			grade = 'A';
		}else if(score<=90 && score>80) {
			grade= 'B';
			
		}else if(score<=80 && score>70) {
			grade='C';
			
		}else if(score<=70 && score>50) {
			grade='D';
			
		}else {
			grade='F';
			
		}return grade;
		

	}

	public static void main(String[] args) {
		Student obj = new Student();
		char obj1=obj.getGrade(91);
		System.out.println(obj1);
	}

}
