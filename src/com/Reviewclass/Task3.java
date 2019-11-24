package com.Reviewclass;

public class Task3 {

	public static void main(String args[]) {
		
		
		
		
		aircraft b747=new aircraft(350,550,99.0,20.5);
		
	System.out.println(b747.passengers);	
 		double a=b747.calculateEndurance();
 		System.out.println(a);
		
 		
 		double  b=b747.fuelNeeded(2.5);
 		System.out.println(b);
 		
		aircraft a340=new aircraft(330,540,98.0,18.5);
		aircraft c363=new aircraft(222,333,45.5,34.3);
	}
}
 class aircraft{
	int passengers;			//numbers of perople
	int cruiseSpeed;		//miles per hour 
	double fuelCapacity;	//gallons
	double fuelBurnRate;	//gallons per hour
	
	aircraft(int p,int c,double fc,double fbr){
		passengers=p;
		cruiseSpeed=c;
		fuelCapacity=fc;
		fuelBurnRate=fbr;
		
	}
	
	
	
	
	
	double calculateEndurance() {
		double endurance;
		
	 endurance= fuelCapacity /fuelBurnRate;
		return endurance;
		
	}
	double fuelNeeded(double time) {
		return fuelBurnRate*time;
	
	
	
		
	}
	
}




