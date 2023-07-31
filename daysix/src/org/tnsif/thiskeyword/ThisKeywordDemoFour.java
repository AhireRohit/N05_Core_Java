package org.tnsif.thiskeyword;

public class ThisKeywordDemoFour {
	
	int x;
	
	ThisKeywordDemoFour(){
		// invoking current parameterised constructor
		this(34);
		System.out.println("Default Constructor");
		
	}
	ThisKeywordDemoFour(int x){
		this.x = x;
		System.out.println("Parameterised constructor " + x);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeywordDemoFour t = new ThisKeywordDemoFour();
		

	}

}
