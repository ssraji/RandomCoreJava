package com.raji.ems.employee;

import java.util.Hashtable;

public class CharCount {

	public static void main(String[] args) {
		
		
	Hashtable <String,String> ht= new Hashtable <String,String>();

	
		
	String str= "aaa bb cda fhgh sasd dsad  dfd 66 26 632";
	char find;
	int findcount = 0;
	int len= str.length();
	
	String key,value;
	
	for (int i=0;i<len;i++)
	{
		find=str.charAt(i);
		
		for (int j=0;j<len;j++)
		{
			if(find == str.charAt(j))
			{
				findcount++;						
			}
		}
		
		key = String.valueOf(find);
		value = String.valueOf(findcount);
		
		
		
		ht.put(key,value);
		
		// Hashtable allows duplicates but replaces with the last added value.
		findcount = 0;
		

	}
	
	System.out.println(ht);

	

	}

}
