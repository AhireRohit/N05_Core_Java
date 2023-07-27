package org.tnsif.heirarchicalinheritance;

public class DistrictCourt extends Supreme{
	private String district;
	private int pincode;
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public DistrictCourt() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DistrictCourt(String judgeName, String location, int noOfCases, String district, int pincode) {
		super(judgeName, location, noOfCases);
		// TODO Auto-generated constructor stub.
		this.district = district;
		this.pincode = pincode;
		
	}
	public DistrictCourt(String district, int pincode) {
		super();
		this.district = district;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "DistrictCourt [district=" + district + ", pincode=" + pincode + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
}
