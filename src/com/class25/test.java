package com.class25;

public class test {

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.salary=70000;
		Employee.companyName="Syntax";
		emp.work();
		emp.getPaid();
		
		ScrumTeam sm=new ScrumTeam();
		sm.salary=90000;
		sm.work();
		sm.getPaid();
		sm.artifacts="Product Backlog, Sprint Backlog, BurnDown Chart";
		sm.ceremonies="Sprint Demo , Planning, Retro,Daily Standup";
		sm.attendScrumMeeting();
		
		
		
		Developer dv=new Developer();
		dv.salary=120000;
		dv.work();
		dv.getPaid();
		dv.code();
		
		
		
		
	}
	
	
}
