package org.tnsif.heirarchicalinheritance;

public class HighCourt extends Supreme{

	private int noOfJudge;
	private String courtName;
	public HighCourt() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HighCourt(String judgeName, String location, int noOfCases, int noOfJudge, String courtName) {
		super(judgeName, location, noOfCases);
		// TODO Auto-generated constructor stub
		this.noOfJudge = noOfJudge;
		this.courtName = courtName;	
	}
	public int getNoOfJudge() {
		return noOfJudge;
	}
	public void setNoOfJudge(int noOfJudge) {
		this.noOfJudge = noOfJudge;
	}
	public String getCourtName() {
		return courtName;
	}
	public void setCourtName(String courtName) {
		this.courtName = courtName;
	}
	public HighCourt(int noOfJudge, String courtName) {
		super();
		this.noOfJudge = noOfJudge;
		this.courtName = courtName;
	}
	@Override
	public String toString() {
		return "HighCourt [noOfJudge=" + noOfJudge + ", courtName=" + courtName + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
}
