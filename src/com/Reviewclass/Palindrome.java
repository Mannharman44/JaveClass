package com.Reviewclass;

public class Palindrome {
	 
	    
	    void polind(String original) {
	    	String reversed="";
	        for( int i=original.length()-1;i>=0;i--) {
	        	reversed=reversed+original.charAt(i);
	        }
	         if(original.equals(reversed)) {
	             System.out.println("String is palindrome");
	         }else {
	             System.out.println("String is not  palindrome");
	         }
	        }
	    
	    
	    public static void main(String[] args) {
	         
	        Palindrome name=new Palindrome();
	        
	        name.polind("Hello");
	
	 

	
		
			
		
		
	}
	
	
	
	
	
		
		
	
	
	
}
