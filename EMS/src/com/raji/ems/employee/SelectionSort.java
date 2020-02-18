package com.raji.ems.employee;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {45,34,10,78,90};
		int small =0;
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("i === "+arr[i]);
			int minindex =i;
			
			for(int j=i+1;j<=arr.length-1;j++)
			{
			
				System.out.println("j = "+arr[j]);
				if(arr[j]<arr[minindex])
				{
					System.out.println("****if satisfied****");
					
					minindex = j;
					
					//swap the found min element with the first element
					
					int temp = arr[minindex];
					arr[minindex] = arr[i];
					arr[i] = temp;
		
				}
		
			}//j loop
	
			
		}// i loop
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
	
	}

}
