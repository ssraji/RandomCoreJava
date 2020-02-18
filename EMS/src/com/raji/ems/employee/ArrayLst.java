package com.raji.ems.employee;
import java.util.*;


public class ArrayLst {

	public static void main(String[] args) {

		
		ArrayList<String> list = new ArrayList();
		
		list.add("Raji");
		list.add(1, "Pip");
		list.add("Shreya");
		list.add("UIt");


		
		Iterator iter = list.iterator();
		
		while (iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
		
		
		
		
	}

}

