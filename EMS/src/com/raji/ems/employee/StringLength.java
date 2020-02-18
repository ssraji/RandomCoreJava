package com.raji.ems.employee;

public class StringLength {
	

	public static void main(String[] args) {
		
		String str = "This is Raji yuyuuu ";
		
		int count =0;
				
		 int len=str.length();
		
		for(int i=0;i<len;i++)			
		
		{
		
			if (str.charAt(i) != ' ')
				{
						count++;
				}
		}
				
		System.out.println("The no of Characters " +count);

	}

}
