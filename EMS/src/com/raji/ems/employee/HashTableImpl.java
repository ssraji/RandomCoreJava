package com.raji.ems.employee;


import java.util.*;



public class HashTableImpl {
	
	
	public static void main(String[] args) {
		
		Enumeration names;
		String key;
		
		Hashtable <String,String> ht = new Hashtable <String,String>();
		
		
	
		ht.put("Key1","Raji1");
		ht.put("Key2","Raji2");
		ht.put("Key3","Raji3");
		ht.put("Key4","Raji4");
		ht.put("Key5","Raji5");

		names=ht.keys();
		
		
		while (names.hasMoreElements()){
			
			key = (String)names.nextElement();
			
			System.out.println("Key = "+key+"  Value is ="+ht.get(key));
			
			
		}
		
		
				
		
		
	}

}
