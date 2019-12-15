package com.class36;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Car{
	
	String make,model;
	
public	Car(String make,String model){		
	this.make=make;
	this.model=model;
	}
	
public void display() {
	System.out.println(make+" "+model);
}
	
}
public class CarTest {
		
public static void main(String[] args) {
	
	Map<Integer,Car>carMap=new LinkedHashMap<>();
	carMap.put(1, new Car("BMW","X5"));
	carMap.put(2, new Car("Tesla","S"));
	carMap.put(3, new Car("Mercedes","S500"));
	carMap.put(4, new Car("Toyota","Rav4"));
	carMap.put(5, new Car("Honda","Civic"));
	
	System.out.println(carMap.size());
	
	for(Entry a:carMap.entrySet()) {
		System.out.println(a.getKey()+" "+a.getValue());
	}
	
	
	Collection<Car>coll=carMap.values();
	for(Car c:coll) {
		System.out.println(c.make+"----"+c.model);
		c.display();
	}
	
	Set<Entry<Integer,Car>>set=carMap.entrySet();
	for(Entry<Integer,Car>cc:set) {
	Integer i=cc.getKey();
	Car c=cc.getValue();
	
	System.out.println("Key "+i+" is associated with value of "+ c.make);
	}
	
	Iterator<Entry<Integer,Car>>it=set.iterator();
	while(it.hasNext()) {
		Entry<Integer,Car>a=it.next();
	Integer aa=a.getKey();
	Car bb=a.getValue();
		System.out.println("Key "+aa+"is associated with "+bb.make);
		
	}
	Set<Integer>keyset=carMap.keySet();
	for(int key:keyset) {
		//System.out.println(key+" "+carMap.get(key).make+" "+carMap.get(key).model);
		Car car=carMap.get(key);
		String carDetails=car.make+"-"+car.model;
		System.out.println(key+"="+carDetails);
		
		
	}
	
	
}
}
