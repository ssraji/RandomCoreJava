package com.raji.ems.employee;

import java.util.ArrayList;

public class RemoveDuplicates {

	public static void main(String[] args) {

		int[]  arr= {2,3,4,2,6,2};
		int arrmaxlen = arr.length;
		int[] arr1 = new int[arrmaxlen];

		System.out.println("the  arr2 len is "+ arr1.length);


		boolean matchfound = false;
				
	 for(int i=0;i<arr.length;i++)
	 {
		 
		 for(int j=i+1;j<arr.length;j++)
		 {
			 if(arr[i] == arr[j])// if duplicate is found
			 {
				 matchfound = true;
				 System.out.println("Match  found" );
			 }
			 else
			 {
				 matchfound = false;
				 
			 }
			 
		 }//outer for
		
		if(matchfound == false)
		 {
		  arr1[1] = arr[i];		 
	     }
	 }
	
	 System.out.println("the final array"+ arr1.length);
	 
	 for (int k=0;k<arr1.length;k++)
	 {
		 System.out.println(arr1[k]);
	 }

	}
}



