//used to refer instance variable of current class


package org.tnsif.thiskeyword;

public class ThisKeywordDemoOne {
	int x, y;
	void setData(int x, int y) {
//		we can change variable name if we want
		this.x = x;
		this.y = y;
		
	}
	void display() {
		System.out.println(x + " " + y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeywordDemoOne t = new ThisKeywordDemoOne();
		t.setData(2, 4);
		t.display();
	}

}
