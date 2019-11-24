package com.class24;

public class Country {

	public String capital,name;
	public int population;
	
	public Country() {
		System.out.println("I am non argument constructor");
	}
	
	Country(String name,String capital,int population){
		this.name=name;
		this.capital=capital;
		this.population=population;
	}
	Country(String name,String capital){
		this.name=name;
		this.capital=capital;
		
	}
	
	public void display() {
		System.out.println(name+" "+capital);
	}
	
	public static void main(String[] args) {
		Country country1=new Country("USA","Washington DC",350);
		//country1.name="USA";
		//country1.capital="Washington DC";
		
		Country country2=new Country("Kazakhstan","Astana",18);
		//country2.name="Kazakhstan";
		//country2.capital="Astana";
		Country country3=new Country();
		country1.display();
		country2.display();
		country3.display();
		
	}
	
}
