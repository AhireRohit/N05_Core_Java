package org.tnsif.superkeyword;

public class StaticBlockExecutor {
	static float salary = 65786.89f;
	String companyName;
	
//	we cannot include any non-static variable in static block
//	static block is used to initialize the static variable
	
	static {
//		companyName = "Accenture";
		salary = 57576.89f;
//		System.out.println(salary);
		
	}
	static void print() {
		System.out.println(salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print();	
	}
}
