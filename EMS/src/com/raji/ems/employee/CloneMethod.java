package com.raji.ems.employee;

public class CloneMethod {
	
	String name;
	int age;
	

	 CloneMethod(String getname,int getage) {
		// TODO Auto-generated constructor stub
		name = getname;
		age = getage;
		
	}	  
	
	 public CloneMethod() {
	
	}

	void display() {
		 System.out.println(name + "--- " + age +"years");
	 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CloneMethod cm = new CloneMethod("Raji",40);
		
		System.out.println("The original values are");
		
		cm.display();
		
		CloneMethod cm1 = new CloneMethod();
		//Copied with out the clone method.
		cm1.name = cm.name;
		cm1.age = cm.age;
	
		
		System.out.println("The coiped values from the object are");
		cm1.display();
		

	}

}
