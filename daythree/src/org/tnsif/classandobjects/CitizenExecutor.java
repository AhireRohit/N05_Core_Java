//Program to demonstrate on default and parameterized constructors

package org.tnsif.classandobjects;

public class CitizenExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Citizen pratik = new Citizen();
		pratik.citizenType = "Teen";
		pratik.aadharNo = 741258963895l;
		pratik.gender = "Male";
		pratik.city = "Nashik";
		
	
		
		Citizen ritesh = new Citizen("Teen", 789856987412l, "Male", "Palghar");
		
//		System.out.println(ritesh);
		
		pratik.display();
	
		
		
		
	}

}
