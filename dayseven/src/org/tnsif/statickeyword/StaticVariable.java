package org.tnsif.statickeyword;

//if any variable is non-static and outside the main function and 
//if you want to access that variable inside the main function, then we can make that variable as static

public class StaticVariable {
	static int num = 67;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(num);
		
		
	}

}
