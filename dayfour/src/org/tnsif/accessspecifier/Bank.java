package org.tnsif.accessspecifier;

public class Bank {
	
	// different access specifier
	
	public String bankName;
	private int pinNo;
	long accNo = 0126101101334l;
	
	public void displayPublic() {
		
		System.out.println("Bank name is " + bankName);
		
	}
	
	private void displayPrivate() {
		
		System.out.println("Pin no is " + pinNo);
		
	}
	
	void displayDefault() {
		
		System.out.println("Account no is " + accNo);
		
	}
}
