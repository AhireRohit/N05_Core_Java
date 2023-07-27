package org.tnsif.heirarchicalinheritance;

public class Supreme {
	private String judgeName;
	private String location;
	private int noOfCases;
	public String getJudgeName() {
		return judgeName;
	}
	public void setJudgeName(String judgeName) {
		this.judgeName = judgeName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getNoOfCases() {
		return noOfCases;
	}
	public void setNoOfCases(int noOfCases) {
		this.noOfCases = noOfCases;
	}
	public Supreme() {
		super();
		
		System.out.println("This is default!!");
		// TODO Auto-generated constructor stub
	}
	public Supreme(String judgeName, String location, int noOfCases) {
		super();
		this.judgeName = judgeName;
		this.location = location;
		this.noOfCases = noOfCases;
		System.out.println("This is parameterized!");
		
	}
	@Override
	public String toString() {
		return "Supreme [judgeName=" + judgeName + ", location=" + location + ", noOfCases=" + noOfCases
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
}
