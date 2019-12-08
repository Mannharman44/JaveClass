package com.class28;

public class Room extends Building {

	int roomNumber;
	
	Room(int floor,String address,int roomNumber){
		super(floor,address);
		this.roomNumber=roomNumber;
	}
	
	void m1() {
		
		System.out.println(address+" "+floor+" "+roomNumber);
	}
	
		
	public static void main(String[] args) {
		
		Room room=new Room(1,"123 1st",4);
		room.m1();
	}
}
