package com.raji.ems.employee;

import java.util.Scanner;


public class SingleArray {

	public SingleArray() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] cars;
		
		int arrayLength = 0;
		
		
		Scanner getInput = new Scanner(System.in);
		
		System.out.println("Hey we are going to deal with Single Dimensional Array");
		System.out.println("Please enter the quantity of the array");
		
		arrayLength = getInput.nextInt();
		
		cars = new String[arrayLength];
		
		for (int i=0; i < arrayLength ; i++)
		{
			System.out.println("Enter your"+i+"value");
			cars[i] = getInput.next();
			
		}
		
		System.out.println("Now you have finished ading to the array. The array looks like this ::");
		
		for (int i=0; i < arrayLength ; i++)
		{
			System.out.println(cars[i]);
			
		} 
		
		getInput=null;
		
		

	}

}
