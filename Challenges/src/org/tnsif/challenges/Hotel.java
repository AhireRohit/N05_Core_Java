//Write a program to calculate the hotel tariff. 
//The room rent is 20% high during peak seasons(April to june is a peak season and nov to dec is also a peak season) 
//Use the switch case
//* Sample Input----month=3, rent, day=how many days, calculate the room price 


package org.tnsif.challenges;

import java.util.Scanner;

public class Hotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter month number : ");
		int months = s.nextInt();
		
		System.out.println("Enter total rent : ");
		float rent = s.nextFloat();
		
		System.out.println("Enter total number of days : ");
		int days = s.nextInt();
		
		switch(months) {
		case 1:
		case 2:
		case 3:
		case 7:
		case 8:
		case 9: 
		case 10:
			System.out.println(rent * days);
			break;
		case 4:
		case 5:
		case 6:
		case 11:
		case 12:
			System.out.println(rent + (rent * 0.2) * days);
			break;
		default : 
			System.out.println("Invalid month no : ");
		}
		
		
	}

}
