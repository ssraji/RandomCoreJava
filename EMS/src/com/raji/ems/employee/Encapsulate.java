package com.raji.ems.employee;

 public class Encapsulate {
	 
	 private String username;
	 private int userage;
	 
	 public Encapsulate()
	 {
		 System.out.println("Hey Iam from Constructor");
	 }
   
	 public Encapsulate(String name,int age)
	 {
		 username = name;
		 userage = age;
		 System.out.println("Hey Iam from Constructor2");
		 System.out.println("Name"+username);
		 System.out.println("Age"+userage);
		 System.out.println("-------");
	 }
  
	// get and set Methods to access the private variables of this class. Here the data is encapsulated and it cannot
	// be retrieved easily.
	
	 public String getUsername()
	{
		return username;
	}
	
	public int getUserage()
	{
		return userage;
	}
	
	public void setUsername(String uname)
	{
		username = uname;
	}
	
	public void setUserage(int age)
	{
		userage = age;
	}
	
}


 
