//program to demonstrate on encapsulation
//Encapsulation achieve the data hiding using private access specifier/

package org.tnsif.encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HDFC h = new HDFC();
		h.setAccNo(1234567890L);
		h.setCvvNo(331);
		h.setAccountType("Saving Account");
		h.setPinNo(1221);
		
		
		System.out.println(h.getAccNo());
		System.out.println(h.getAccountType());
		System.out.println(h.getCvvNo());
		System.out.println(h.getPinNo());
		
//		toString Override
		System.out.println(h);
		
		
		
	}

}
