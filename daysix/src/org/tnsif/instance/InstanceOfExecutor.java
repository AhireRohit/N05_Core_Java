package org.tnsif.instance;

// Program to demonstrate on instance of operator.

class Flower{
	String name = "Rose";
}
//child class
class Rose extends Flower{
	String colour = "Red"; 
}

public class InstanceOfExecutor {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rose r = new Rose();
//		System.out.println(r instanceof Flower);
		if (r instanceof Flower) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}

}
