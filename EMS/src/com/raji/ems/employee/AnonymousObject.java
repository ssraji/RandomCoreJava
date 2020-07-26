package com.raji.ems.employee;

import jdk.nashorn.internal.parser.JSONParser;

class AnonymousObject{
	 void fact(int  n){  
	  int fact=1;  
	  for(int i=1;i<=n;i++){  
	   fact=fact*i;  
	  }  
	 System.out.println("factorial is "+fact);  
	}  
	public static void main(String args[]){
		System.out.println("factorial is "+fact);
		new AnonymousObject().fact(5);//calling method with anonymous object
	}


}