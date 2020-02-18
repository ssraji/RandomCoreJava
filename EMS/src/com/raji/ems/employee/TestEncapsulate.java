package com.raji.ems.employee;

public class TestEncapsulate 
{


	public static void main (String[] args) {
		
		Encapsulate copyEncapsulate = new Encapsulate();
		
		Encapsulate copyEncapsulate1 = new Encapsulate("Tia",78);

		
		copyEncapsulate.setUsername("Raji");
		copyEncapsulate.setUserage(67);
		
		System.out.println(copyEncapsulate.getUsername());
		System.out.println(copyEncapsulate.getUserage());
		
        		
	}
	
	 
	
}
