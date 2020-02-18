package com.raji.ems.employee;

public class StaticMethod {
	
	static String name = "Raji"; // Take off static and run to see the difference

	public StaticMethod() {
		// TODO Auto-generated constructor stub
		
		System.out.println(name);
	}
	
	// Only Static Method can change the staic variables.
	public static void applyStaticMethod() {
		
		name ="Lakshmi";
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethod sm = new StaticMethod();
		StaticMethod sm1 = new StaticMethod();
		StaticMethod sm2= new StaticMethod();
		applyStaticMethod();
		System.out.println("Only Static Method can change the static variable");
		StaticMethod sm3 = new StaticMethod();
		StaticMethod sm4 = new StaticMethod();


	}

}
