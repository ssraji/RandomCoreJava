package com.raji.ems.employee;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr1[] =new int[]{7,8,9,10};
		int arr2[] = new int[arr1.length];
		
		for (int i=0;i<arr1.length;i++)
		{
			
			arr2[i] = arr1[i];
			
		}
	
		for (int j=0;j<arr2.length;j++)
		{

			System.out.println(arr2[j]);
			
		}
		
	}

}
