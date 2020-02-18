package com.raji.ems.employee;

public class StaticVariable {
	
	static int no; // Take off static and run to see the difference

	public StaticVariable() {
		// TODO Auto-generated constructor stub
		no++;
		System.out.println(no);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariable sv = new StaticVariable();
		StaticVariable sv1 = new StaticVariable();
		StaticVariable sv2 = new StaticVariable();
		StaticVariable sv3 = new StaticVariable();



	}

}
