//program to demonstrate on encapsulation
//Encapsulation achieve the data hiding using private access specifier/

package org.tnsif.encapsulation;

public class HDFC {

	private long accNo;
	@Override
	public String toString() {
		return "HDFC [accNo=" + accNo + ", cvvNo=" + cvvNo + ", accountType=" + accountType + ", pinNo=" + pinNo + "]";
	}
	private int cvvNo;
	private String accountType;
	private int pinNo;
	
	
//	getter and setter	
	
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public int getCvvNo() {
		return cvvNo;
	}
	public void setCvvNo(int cvvNo) {
		this.cvvNo = cvvNo;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public int getPinNo() {
		return pinNo;
	}
	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}
	
	
	
}
