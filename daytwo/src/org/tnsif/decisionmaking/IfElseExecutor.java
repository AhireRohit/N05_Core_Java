// 

package org.tnsif.decisionmaking;

import java.util.Scanner;

public class IfElseExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter age : ");
		int age = sc.nextInt();
		
		System.out.println("Enter weight : ");
		float weight = sc.nextFloat();
		
		if((age >= 18) && (weight >= 50)) {
			System.out.println("You can donate blood. ");
		}
		else {
			System.out.println("You cannot donate. ");
		}
		sc.close();
	}

}
