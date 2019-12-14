package com.class35;
import java.util.*;
import java.util.Map.Entry;
public class RetrieveAll1 {
public static void main(String[] args) {
	Map<String,Integer>classroom=new HashMap<>();
	classroom.put("Instructor", 3);
	classroom.put("Student", 80);
	classroom.put("Tables",20);
	classroom.put("Chairs",80 );
	
	System.out.println(classroom);
	 for(Map.Entry m:classroom.entrySet()){  
		   System.out.println(m.getKey()+"---> "+m.getValue());  

	 }
	 
	 Set<Entry<String,Integer>>eset=classroom.entrySet();
	 for(Entry<String,Integer> entry:eset) {
		 System.out.println(entry.getKey()+":"+entry.getValue()); 
	 }
	 
	 Iterator<Entry<String,Integer>>it=eset.iterator();
	 while(it.hasNext()) {
		 Entry<String,Integer>ent=it.next();
		 String a=ent.getKey()+"---"+ent.getValue();
		 System.out.println(a);
	 }
	 
	 
	 
	 
}
}
