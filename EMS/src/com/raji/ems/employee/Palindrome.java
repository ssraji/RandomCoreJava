package com.raji.ems.employee;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String getValue = scan.nextLine();
		
		System.out.println("the length of  the no " + getValue.length());
				
		int max = getValue.length()-1;
		String reverseValue ="";
		
		
		for (int i = max ; i >= 0 ; i--)
		{
			
			reverseValue = reverseValue + getValue.charAt(i);
			
		}
		System.out.println("The original value "+ getValue+'\n');
		System.out.println("The reverse value "+reverseValue);

		
		if (getValue.equals(reverseValue))
		{
		System.out.println("It is a Palindrome");
		}
		else {
			System.out.println("It is not a Palindrome");
		}
		
		

	}

}
