package com.raji.ems.employee;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {

		String str= "This is Raji .Iam Me";
		
		String str2 = str.replaceAll("\\s", "*");
		
		System.out.println(str2);
		
	}

}
