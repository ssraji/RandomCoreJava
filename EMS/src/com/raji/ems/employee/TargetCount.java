// Given an array of integers, find two numbers such that they add up to a specific target number.


package com.raji.ems.employee;

public class TargetCount {

	public static void main(String[] args) {
	
	int arr[]= {5,6,4,8,3};
	
	int target = 10;
	
	int find;
	
	for (int i=0;i<arr.length;i++)
	{
	    find =arr[i];
	    
	     for(int j=i+1;j<arr.length;j++)
	     {
	    	 
	    	 if (arr[i]+arr[j] == target)
	    	 {
	    		 System.out.println("target found");
	    		 System.out.println("The numbers that count up to the target no are = "+ arr[i] +" & " +arr[j]);
	    	 }
  		 
	     }
	    	 
		
	}
	
	
	}

}
