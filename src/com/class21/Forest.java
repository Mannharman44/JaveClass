package com.class21;

public class Forest{
	
	public static void main(String args[]) {
		
		
	Wolf wolf1=new Wolf();
	wolf1.age=5;
	wolf1.color="Black";
	Wolf.numberOfWolves++;
	
	Wolf wolf2=new Wolf();
	wolf2.age=4;
	wolf2.color="Gray";
	Wolf.numberOfWolves++;
	
	Fox fox1=new Fox();
	fox1.age=4;
	fox1.color="Blue";
	Fox.numberOfFoxes++;
	
	Fox fox2=new Fox();
	fox2.age=4;
	fox2.color="Blue";
	Fox.numberOfFoxes++;
	
	
	Bear bear1=new Bear();
	bear1.age=3;
	bear1.color="Brown";
	Bear.numberofBears++;
	
	Bear bear2=new Bear();
	bear2.age=3;
	bear2.color="Brown";
	Bear.numberofBears++;
	
	
	System.out.println(Bear.numberofBears+"\n"+Wolf.numberOfWolves+"\n"+Fox.numberOfFoxes);
	

	
	
	}
	
}
 class Wolf{
	 int age;
	 String color;
	 static int numberOfWolves;
	 
 }
 class Fox{
	 int age;
	 String color;
	 static int numberOfFoxes;
	 
 }
 class Bear{
	 int age;
	 String color;
	 static int numberofBears;
	 
	 
	 
 }
 