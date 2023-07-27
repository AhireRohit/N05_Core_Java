package org.tnsif.accessspecifierdayone;
import org.tnsif.accessspecifier.Bank;


public class BankExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank b = new Bank();
		b.bankName = "SBI";
		b.displayPublic();
		
		
//		pinNo and displayPrivate method are private, so we can't access into another class and another package,
//		only we can access private data members inside the same class
//		b.pinNo;
//		b.displayPrivate();
		
//		accNo and displayDefault() method are default that's why, 
//		we are not able to access into another class and another package,
//		only we can access within the same package.
//		b.accNo;
//		b.displayefault();
//		
		
		
	}

}
