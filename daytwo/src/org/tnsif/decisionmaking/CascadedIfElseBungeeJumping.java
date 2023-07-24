package org.tnsif.decisionmaking;

import java.util.Scanner;

public class CascadedIfElseBungeeJumping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter age: ");
		int age = s.nextInt();
		
		System.out.println("Enter weight: ");
		int weight = s.nextInt();
		
		if(age >= 12) {
			if(weight >= 40 ) {
				System.out.println("You can jump");
				if(weight > 110) {
				System.out.println("but you need Extra rope");
				}
			}
			else {
				System.out.println("Not eligible");
			}
		}
		else {
			System.out.println("Not eligible");
		}
	}

}
