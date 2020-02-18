/**
 * 
 */
package com.raji.ems.employee;


public abstract class BankMain {
	
	static double money = 0;
	static double fdmoney = 0;
	
	public static void takeAction(int choice,double amt,int custno) {
		System.out.println("Action Taken");
		
		switch (choice) {
		case 1 : doFD(custno,amt);
			break;
		case 2: doSavings(custno,amt);
			break;
		case 3: doExpenses(custno,amt);
			break;
		default:
			System.out.println("Invalid Choice in Transaction");
		}
		
	}
	
	public static void doFD(int custno,double amt) {
		
		fdmoney = fdmoney + amt;
		System.out.println("$"+amt+" Fixed Deposit added to the Customer "+custno);
		
	}
	
public static void doSavings(int custno,double amt) {
		
	money = money+amt;
	System.out.println("$"+amt+" Savings added to the Customer "+custno);

	
	}

public static void doExpenses(int custno,double amt) {
	
	money = money - amt;
	System.out.println("$"+amt+" Savings added to the Customer "+custno);

	
}

}
