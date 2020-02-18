package com.raji.ems.employee;

public class BinarySearch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int low,high,guess,mid,item;
		
		int list[]= {16,25,32,45,53,62,75,86};
		item = 86;
		
		low =0;
		high=list.length -1;
		
	
		while (low <= high) {
			
			mid = (low+high)/2;
			guess = list[mid];
			
			if(guess == item)
			{
				System.out.println(" guess equals item in index " + mid);
				break;
			}//if ends
			if (guess < item) {
				low = mid +1;
				continue;
			}// if ends
			else {
				high = mid-1;
				continue;
			}//else ends
			
		}// while ends
		
			
	}
	
		
}


	


