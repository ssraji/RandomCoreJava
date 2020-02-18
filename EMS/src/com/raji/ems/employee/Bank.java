package com.raji.ems.employee;

import java.util.Scanner;

public class  Bank extends BankMain implements BankInterest {
	
	String b_name;
	int b_id;
	double rate;
	

	public Bank() {
		super();
	}
	
	public Bank(int id, String name)
	{
		b_name = name;
		b_id = id;
	}

	@Override
	public double rateOfInterest(int id) {
		
		if (id == 1) {rate = 10;}
		else if (id == 1) {rate = 11;}
		else if (id == 2) {rate =  11.5;}
		else if (id == 3) {rate = 12;}
		else {rate = 11;}
		
		return rate;	
		
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int choice1;
		double getAmt;
		int custno;
		
		System.out.println("Please enter your Customer No");
		
		custno= scan.nextInt();
		
	
		System.out.println("Do you want to do any transaction"+'\n');
		System.out.println("1 = Invest Money in FD"+'\n');
		System.out.println("2 = Add Money in to Savings Account"+'\n');
		System.out.println("3 = Take Money from Savings Account"+'\n');
		
		choice1 = scan.nextInt();
		
		System.out.println("Please enter the amount");
		
		getAmt = scan.nextDouble();
	
		takeAction(choice1,getAmt,custno);

		Bank boa = new Bank(1,"BANK OF AMERICA");
		Bank pnc = new Bank(2,"PNC");
		Bank wf = new Bank(3,"Wells Fargo");
		
				
		
	}

}
