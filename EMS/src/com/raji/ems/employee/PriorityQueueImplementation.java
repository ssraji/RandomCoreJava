package com.raji.ems.employee;
import java.util.*;


public class PriorityQueueImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Priority Queue");

		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(100);
		al.add(200);
		al.add(500);
		al.add(700);
		
		pq.addAll(al);
		//pq.add(20);
		//pq.add(30);
		
		System.out.println("Priority Queue");
		
		System.out.println(pq.peek());
		
		System.out.println(pq.poll());
		
		System.out.println(pq.peek());
		
		
		

	}

}
