package com.adv;

public class Bank {
	private String name;
	private String country;
	private String type;
	private int    branches;
	
	
	public Bank( String name,String country){
		this.name=name;
		this.country=country;
		this.type=null;
		this.branches=0;
	}
	
	public Bank( String type, int branches ) {
		
		this.type=type;
		this.branches=branches;
		
	}
	
	public Bank(Object... objects) {
		
	}
	
	 public void printBank() {
	        System.out.println(this.name + " is " + this.country + " is bank ");
	    }
	 
	 public String toString() {
	        return this.name + " is " + this.country + "  " ;
	    }

public static void main(String ars[]) {
	
	Bank b = new Bank("ABC","UK");
	Bank c = new Bank("Global",100);
	
	System.out.println(b);
	
	   for (BankOrderType bo : BankOrderType.values()) {
           System.out.println("Order name : " + bo);
       }
	
}
	
}