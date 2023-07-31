//used to refer instance variable of current class


package org.tnsif.thiskeyword;

public class ThisKeywordWithConstructor {
	int x, y;
	
	public ThisKeywordWithConstructor(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	void display() {
		System.out.println(x + " " + y);
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeywordWithConstructor t = new ThisKeywordWithConstructor(2, 3);
		t.display();
	}

}

