package com.class33;

import java.util.ArrayList;
import java.util.List;

public class InstructorTest {

	public static void main(String[] args) {
		
		
		List<Instructor>iList=new ArrayList<>();
		iList.add(new Instructor("Harman","Mann"));
		iList.add(new Instructor("Jon","Jay"));
		iList.add(new Instructor("David","David"));
		iList.add(new Instructor("Kim","Hu"));
		
		for(Instructor i:iList) {
			i.display();
			
		}
		
		
		
		
	}

}
