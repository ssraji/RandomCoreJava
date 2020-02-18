package com.raji.ems.employee;


public class BubbleSortArray {
	
	

	public static void main(String[] args) {
		
		
		int temp_no;
		
		int arr[] = {7,4,5,2};
		
		int j =arr.length;
		
		System.out.println("The arr length "+ j);
		
		System.out.println("------"+'\n');
		
		
		for(int l=0;l<j-1;l++)
		{
			
		System.out.println("Iam from the outer for"+'\n');
		
		for(int i=0;i<j-1;i++)
		{
			System.out.println("--*****---"+'\n');
			
			System.out.println("The i value is "+ i);
			System.out.println("The j value is "+ j);
			
			System.out.println(arr[i]+ " && "+ arr[i+1] );

			if(arr[i] < arr[i+1])
					{
					  System.out.println(arr[i]+ " < "+ arr[i+1] );
				      System.out.println("No swapping made");
					}
			else
			{
				System.out.println(arr[i]+ " > "+ arr[i+1] );
				System.out.println("Swapping made");
				
				temp_no= arr[i];
				System.out.println("temp no ="+temp_no);
				
				arr[i]=arr[i+1];
				System.out.println("arr[i] no ="+arr[i]);
				arr[i+1] = temp_no;
				System.out.println("arr[i+1] no ="+arr[i+1]);
				
				
			}
			System.out.println("The array length now is :: "+ j);
			
			System.out.println("------"+'\n');

			
			for(int k=0;k<j;k++)
			{
				System.out.println("the k is"+k);
				System.out.println("the no is "+arr[k]+'\n');
			}
	
			System.out.println("------"+'\n');
		}
		
		}// outer for
	}

}
