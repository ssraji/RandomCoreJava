package com.raji.ems.employee;

import java.util.*;

public class FindNoOfWords {

	public static void main(String[] args) {

		
		String str = "I love world. The world Love me. We all love world.";
		
		str =str.toLowerCase();
		
		String  arr[] = str.split("\\s+");
		
		int wordLength=str.split("\\s").length; 

		//System.out.println(wordLength);

		
		for(String strtemp : arr) {
			
			//System.out.println(strtemp);
			
		}
		
		int count;
		
		for(int i=0;i<arr.length;i++){
		  count = 1;
		  for(int j=i+1;j<arr.length;j++) {
			  
			  if(arr[i].equals(arr[j])) {  
				  
				  count++; 
				 // arr[j]= "O";
				 //System.out.println("arr[j] ="+arr[j]);
				  
			  }
		  }//inner for
          //System.out.println("The count is"+count);  		  
		  if(count > 1)  
	            System.out.println("The repeated words are "+ arr[i]);  
			
		}// outer for
		
	

	}

}
