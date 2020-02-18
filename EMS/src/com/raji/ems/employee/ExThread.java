package com.raji.ems.employee;

public class ExThread implements Runnable
	{
	
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("i ="+i);
		}
	}

	public static void main(String[] args)	{
		
		
	Thread obj = new Thread(new hi());
	
	Thread  obj1 = new Thread(new hello());
	
	obj.start();
	
		/*
		 * try { obj.join(); } catch (InterruptedException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); }
		 */
	
	obj1.start();
	
	}

}


 class hi implements Runnable
{
	public void run()
	{
		for(int j=0;j<=10;j++)
		{
			System.out.println("Hi");
			 
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}
 
 
 class hello implements Runnable

 {
	 public void run()
		{
		 for(int k=0;k<=10;k++)
			{
				System.out.println("Hello");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		}
 }
 
 