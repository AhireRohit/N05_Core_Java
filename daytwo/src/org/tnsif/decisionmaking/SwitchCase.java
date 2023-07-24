package org.tnsif.decisionmaking;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your choice: ");
		int choice = s.nextInt();
		
		switch(choice) {
		case 1: 
			System.out.println("Play Erangle");
			break;
			
		case 2:
			System.out.println("Vinkendi");
			break;
			
		case 3:
			System.out.println("Miramar");
			break;
			
		case 4:
			System.out.println("Levik");
			break;
		
		default:
			System.out.println("Invalid Input ");
		}
			
	}

}
