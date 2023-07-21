//Program to demonstrate on Logical operator


package org.tnsif.operator;
import java.util.Scanner;
public class LogicalOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter num1: ");
		int num1 = s.nextInt();
		
		System.out.println("Enter num2: ");
		int num2 = s.nextInt();
		
		System.out.println((num1 == num2) && (num1 > num2));
		System.out.println((num1 == num2) || (num1 > num2));
		System.out.println(!((num1 == num2) || (num1 > num2)));

		s.close();		

	}

}
