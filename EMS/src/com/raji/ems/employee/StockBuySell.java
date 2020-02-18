package com.raji.ems.employee;

public class StockBuySell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int pricelist[] = {6,4,6,8,1,8};

		
		int len =pricelist.length;
		
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(pricelist[i]<pricelist[j])
				{
					System.out.println("You can buy on "+pricelist[i]+" and sell on "+pricelist[j]);
				}
				else
				{
					//System.out.println("Not a profitable");

				}
			}
		}
	}

}
