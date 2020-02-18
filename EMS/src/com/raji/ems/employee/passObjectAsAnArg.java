package com.raji.ems.employee;

public class passObjectAsAnArg {

    String name = "Raji";
			
	
	public passObjectAsAnArg() {
		
	}
	
	public void sentMethod1() {
	 System.out.println("Hey Iam called from the sent method1");
	 sentMethod2(this);
	}
	
	public void sentMethod2(passObjectAsAnArg obj) {
		
		 System.out.println("Hey Iam called from the sent method2");
		 System.out.println("Using data member of the passed Object "+ obj.name);
		 
		}
		

	public static void main(String[] args) {
		
		passObjectAsAnArg pa = new passObjectAsAnArg();
		pa.sentMethod1();

	}

}
