package org.tnsif.heirarchicalinheritance;

public class HeirarchicalInheritanceExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HighCourt hc1 = new HighCourt();
		HighCourt hc = new HighCourt("Akshay", "Nashik", 10, 25, "Divorce");
		System.out.println(hc);
		
		
		DistrictCourt dc1 = new DistrictCourt();
		DistrictCourt dc = new DistrictCourt("Rohit", "Mumbai", 10, "Mumbai", 422010);
		System.out.println(dc);
		
		
	}

}
