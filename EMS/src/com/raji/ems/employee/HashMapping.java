package com.raji.ems.employee;
import java.util.HashMap;

public class HashMapping {

	
	public static void main(String[] args) {
		
		String n ="Ijar";
		String n1 ="Ijar";

		
		
		String name = new String("Raji");
		
		String name1= new String("Raji"); 
		
		HashMap <String,String> capitalcities = new HashMap<String,String>();
		capitalcities.put("India", "Chennai");
		capitalcities.put("India", "Mumbai");
		capitalcities.put("India", "bangalore");
		capitalcities.put("USA", "Newyork");
		capitalcities.put("USA", "Dallas");
		capitalcities.put("USA", "Houston");
		capitalcities.put("England", "London");
		capitalcities.put("England", "Birmingham");


		System.out.println(capitalcities);
		
		System.out.println(capitalcities.size());
		
		for (String i : capitalcities.keySet()) {
		      System.out.println("key: " + i + " value: " + capitalcities.get(i));
		    }
		
		
		HashMap<Todos,String> m = new HashMap<Todos,String>();
		Todos t1 = new Todos("Monday");
		Todos t2 = new Todos("Monday");
		Todos t3 = new Todos("Tuesday");
		
		m.put(t1, "doLaundry");
		m.put(t2, "payBills");
		m.put(t3, "cleanAttic");
		
		System.out.println("Hashmap Size " +m.size());
		System.out.println("hash code of hash map capitalcities "+capitalcities.hashCode());
		System.out.println("hascode of todos and job "+m.hashCode());
		
		System.out.println("Hash code of t1 "+t1.hashCode());
		
		System.out.println("Hash code of t2 "+t2.hashCode());
		
		
		System.out.println("Hash code of name "+name.hashCode());
		
		System.out.println("Hash code of name1 "+name1.hashCode());
		
		System.out.println("Hash code of n "+n.hashCode());
		
		System.out.println("Hash code of n1 "+n1.hashCode());

		System.out.println("t1 equals t2 using .equals ="+t1.equals(t2));
		System.out.println("hey");
		
		System.out.println("name equals name1 using .equals ="+name.equals(name1));

		System.out.println("n equals n1 using .equals ="+n.equals(n1));

		System.out.println('\n'+"t1 == t2"+(t1.hashCode() == t2.hashCode()));
		System.out.println('\n'+"name == name1"+(name.hashCode() == name1.hashCode()));
		System.out.println('\n'+"n ==n1"+(n.hashCode() == n1.hashCode()));

		

	}
}


class Todos{
	String day;
	
	Todos(String d)
	{
		day = d;
	}
	
	public boolean equals(Object o) {
		return ((Todos)o).day == this.day;
	}
	
	public int hashCode()
	{
		return 9;
	}
	
	
}
