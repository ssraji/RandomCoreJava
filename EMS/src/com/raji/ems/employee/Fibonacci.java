package com.raji.ems.employee;

import java.util.Scanner;


public class Fibonacci {

	
	public static void main(String[] args) {
		
		int count;
		
		Scanner getInput = new Scanner(System.in);
		
		System.out.println("Please enter the count for Fibonacci series ");
		count = getInput.nextInt();
		int n1 =0;
		int n2 =1;
		int n3=0;
		
		for(int i=1;i<=count;i++)
		{
			n3 = n1+n2;
			
			System.out.println(n3);
			
			n1 = n2;
			n2 = n3;		
			
			
			
		}
		
		
		

	}

}
