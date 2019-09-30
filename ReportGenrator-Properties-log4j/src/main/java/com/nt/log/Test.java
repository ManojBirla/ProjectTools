package com.nt.log;

public class Test{
	
    public static void main(String[] args) {
    	StockMarket cust=new StockMarket();
		int res=cust.getAmount("ibm");
		System.out.println(res);
	}
}
