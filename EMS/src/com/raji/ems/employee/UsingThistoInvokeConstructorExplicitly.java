package com.raji.ems.employee;

public class UsingThistoInvokeConstructorExplicitly {

	public UsingThistoInvokeConstructorExplicitly() {
		
		System.out.println("Hey Iam from the constuctor with no args and I am called explicitly");
	
	}
	public UsingThistoInvokeConstructorExplicitly(int no) {
		
		this();
		System.out.println("Hey I am from the constructor with arguments");
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsingThistoInvokeConstructorExplicitly  ui = new UsingThistoInvokeConstructorExplicitly(7);
		

	}

}
