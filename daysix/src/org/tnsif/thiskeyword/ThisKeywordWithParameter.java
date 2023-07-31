package org.tnsif.thiskeyword;

import java.util.concurrent.Callable;

public class ThisKeywordWithParameter {
	
	void print() {
		System.out.println("Hey I am using 'THIS' keyword !!");
	}
	
	void display () {
//		When you call any parameterised method inside non-parameterised method then, 
//		we get an error, to overcome that we have to use "this" keyword as an argument in method call.
		
		print(this);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisKeywordWithParameter t = new ThisKeywordWithParameter();
		t.display();
		
		
	}

}
