package com.raji.ems.employee;

public class MethodOverloading {
	
	public void getDetails()
	{
		System.out.println("Iam from the method with no paaram");
	}
	
	public void  getDetails(int age)
	{
		System.out.println("Iam from the method with int paaram");
	}
	
	public void getDetails(String name)
	{
		System.out.println("Iam from the method with name paaram");
	}
	
	public void getDetails(double id)
	{
		System.out.println("Iam from the method with double paaram");
	}

	public static void main(String[] args)
	{
		MethodOverloading mo = new MethodOverloading();
		mo.getDetails();
		mo.getDetails(67);
		mo.getDetails("Raji");
		mo.getDetails(89.8);
	
		
				
	}

	
}
