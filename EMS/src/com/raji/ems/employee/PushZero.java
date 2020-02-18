package com.raji.ems.employee;

public class PushZero {

	public static void main(String[] args) {
		
		int arr[] = { 2,0,3,0,4,0,5}; // original array
		
		int len = arr.length;
		
		System.out.println("original arr len ="+len);

		
		int count = 0,index = 0;
		
		
		for(int i=0;i<len;i++)
		{
			if(arr[i] != 0)
			{
				 index = count++;
				System.out.println("index ="+ index);
				arr[index] =arr[i];
				
			}
			/*
			 * else { System.out.println("It is zero"); }
			 */
			
		}
		len = arr.length;
		
		System.out.println("last index ="+index);

		
		for(int i=index+1;i<len;i++)
		{
			arr[i] = 0;

		}
		
		for(int i=0;i<len;i++)
		{
			System.out.println(arr[i]);

		}

	}

}
