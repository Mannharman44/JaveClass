package com.Reviewclass;

 class Person{
	 
	 String name ;
	 int age;
	 
	 // Class can contain
	 
	 
	 // 1. Date 
	 // 2. subroutines(methods)
	void speak() {
		
		{
		System.out.println("My name is: "+name+"and i am "+age+" years old");
		
	}
	}
	 
	 int yearsToRetirement() {
		 int yearsLeft= 65-age;
		 
		 return yearsLeft;	 
		 
	 }
	 int getAge(){
		  
		 
		 
		 return age;
	 }
	 String getName() {
		 
		 return name;
		 
	 }
		 
		 
		 
		 
	 }
 



public class review1 {
public static void main(String[] args) {
	
	Person person1=new Person();
	person1.name="John Smith";
	person1.age=55;
	//person1.speak();
	
	
	
	int years= person1.yearsToRetirement();
	System.out.println("Years till Retirement: "+years);
	
	int age=person1.getAge();
	String name=person1.getName();
	
	
	System.out.println("Name is : "+name);
	System.out.println("Age is : "+age);
	
	
	
	
	Person person2=new Person();
	person2.name="Ali jon";
	person2.age=44;
	//person2.speak();
	int years1= person2.yearsToRetirement();
	System.out.println("Years till Retirement: "+years1);
	
	int age1=person2.getAge();
	String name1=person2.getName();
	
	System.out.println("Name is : "+name1);
	System.out.println("Age is : "+age1);
	
	
	
	
	
	Person person3=new Person();
	person3.name="Harman Mann";
	person3.age=99;
	//person3.speak();
	int years2= person3.yearsToRetirement();
	System.out.println("Years till Retirement: "+years2);
		
	int age2=person3.getAge();
	String name2=person3.getName();
	
	System.out.println("Name is : "+name2);
	System.out.println("Age is : "+age2);
	
	
	
	
	
}
}
