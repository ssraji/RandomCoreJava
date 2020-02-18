package com.raji.ems.employee;


import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;




public class RemoveDuplicatesfromList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> ll = new LinkedList<String>();
		
		
		ll.add("A");
		ll.add("B");
		ll.add("A");
		ll.add("B");
		ll.add("C");
		ll.add("B");
		ll.add("A");

		System.out.println(ll);
		
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("A");
		al.add("B");
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("B");
		al.add("A");
		
		System.out.println(al);
		
		
		List<Integer> listWithDuplicates = new ArrayList();
		
		listWithDuplicates.add(1);			
		listWithDuplicates.add(2);
		listWithDuplicates.add(2);		
		listWithDuplicates.add(1);
		listWithDuplicates.add(3);

		
		
	    List<Integer> listWithoutDuplicates = new ArrayList<>(new HashSet<>(listWithDuplicates));
		

		System.out.println(listWithoutDuplicates);

		
		

	}

}
