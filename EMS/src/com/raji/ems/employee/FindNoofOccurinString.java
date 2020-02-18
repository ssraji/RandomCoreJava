package com.raji.ems.employee;

import java.util.*;
import java.io.*;
import java.lang.*;



public class FindNoofOccurinString {



	public static void main(String[] args) {
		
		//int i;
		//System.out.println(i);
		
		
		String str = "Hhrdwork is Strength and Strength is Power";
		
		
		HashMap<Character,Integer> charCountMap = new HashMap<Character,Integer>();
		
        System.out.println(" hhh" +charCountMap);

		char[] chArray = str.toCharArray();
		
		for (char c : chArray) { 
			
	        System.out.println(" char c is " +c);
	        System.out.println(charCountMap.containsKey(c));

            if (charCountMap.containsKey(c)) { 
  
                // If char is present in charCountMap, 
                // incrementing it's count by 1 
                charCountMap.put(c, charCountMap.get(c) + 1); 
            } 
            else { 
  
                // If char is not present in charCountMap, 
                // putting this char to charCountMap with 1 as it's value 
                charCountMap.put(c, 1); 
            } 
        } 
  
        System.out.println(charCountMap);
		
		
		
		/*
		 * char[] ch = str.toCharArray();
		 * 
		 * int[] freq = new int[str.length()];
		 * 
		 * 
		 * System.out.println(str.length());
		 * 
		 * char char1,char2;
		 * 
		 * 
		 * for(int i=0;i<ch.length;i++)
		 * 
		 * { freq[i] = 1; System.out.println("I value = "+i);
		 * 
		 * 
		 * for(int j=i+1;j<ch.length;j++) {
		 * System.out.println("I2 value = "+i+" --> "+ch[i]);
		 * System.out.println("J value = "+j+" --> "+ch[j]);
		 * 
		 * char1 = Character.toUpperCase(ch[i]); char2 = Character.toUpperCase(ch[j]);
		 * 
		 * if(char1 == char2 && ch[i] != ' ') { freq[i]++;
		 * System.out.println("Matched"); ch[j]='0'; } else {
		 * //System.out.println("not matched"); } } }
		 * 
		 * System.out.println(freq.length);
		 */
		
		
		
		
		
		 

		
	}
}
