package org.tnsif.superkeyword;

class Sports{
	
	String sportName = "Cricket";
	void display() {
		System.out.println("Sport name is " + sportName);
	}
}
//child class

class Cricket extends Sports{
	int noOfPlayers =  11;
	void display() {
		
		super.display();
		System.out.println("No. of players is : " + noOfPlayers);
	}
}

public class SuperKeywordWithMethod {

	public static void main(String[] args) {

		Cricket c = new Cricket();
		c.display();
		

	}

}
