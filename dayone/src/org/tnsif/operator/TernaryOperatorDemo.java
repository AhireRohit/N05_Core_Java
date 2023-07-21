//Program to demonstrate on Ternary operator

package org.tnsif.operator;
import java.util.Scanner;
public class TernaryOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter num : ");
		int num = s.nextInt();
		String res = (num % 2 == 0) ? "Even" : "Odd";
		
		System.out.println("Result is : " + res);
		s.close();
		
	}

}
