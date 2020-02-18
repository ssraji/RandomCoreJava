package com.raji.ems.employee;

import java.util.LinkedList;

public class LinkedListImpl {
	
	public static void main(String[] args) {
		
		
		int llcount;
			
		LinkedList<String> l1 =new LinkedList<String>();
		l1.add("A");
		l1.add("B");
		l1.add("c");
		l1.add("d");


		l1.add(3, "z");

		
		l1.addFirst("First");
		l1.addLast("Last");
		
		LinkedList<String> l2 =new LinkedList<String>();
		l2.add("A2");
		l2.add("B2");
		l2.add("c2");
		l2.add("d2");
	
		Iterator<String> itr = l1.iterator();
		
		Iterator<String> itr1 = l2.iterator();
		
		
		System.out.println("The LinkedList size ="+l1.size());
		

		
		 llcount = (l1.size()+l2.size());
		
		 //System.out.println("Total count "+llcount );
		 
		 LinkedList<String> l3 = new LinkedList<String>();
		 
		 

		 
		while (itr.hasNext()) {
			
			l3.add(itr.next());
			
		}
		
		while(itr1.hasNext()) {
			
			l3.add(itr1.next());
			
		}
		
		Iterator<String> itr2 = l3.iterator();
		
		while (itr2.hasNext())
		{
			System.out.println(itr2.next());
			
		}
		
	
		/*while (itr.hasNext())
		{
			System.out.println(itr.next());
			
		}*/
			
		/* for (String s:l1)
		{
			System.out.println(s);
		}*/
	
		
	}

}
