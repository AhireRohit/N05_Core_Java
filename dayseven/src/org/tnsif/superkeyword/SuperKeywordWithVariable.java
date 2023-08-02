package org.tnsif.superkeyword;

class State{
	
	String stateName = "Punjab";
	public State() {
		super();
	}
}

class Capital extends State{
	
	
	String stateName = "Haryana";
	String capital = "Chandigarh";
	
	public void display() {
	
		System.out.println(super.stateName);
		System.out.println(stateName);

	}
	
}

public class SuperKeywordWithVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Capital c = new Capital();
		c.display();
//		System.out.println(c.stateName);

	}

}
