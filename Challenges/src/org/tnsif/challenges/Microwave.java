// A microwave oven manufacturer recommends that when heating two items, add 50% to the heating time and when heating 3 
// * items double the heating time. Heating more than 3 items in once is not recommended. 
// WAP to find out recommended
// * heating time.  input  item=2 and heating time=5.0


package org.tnsif.challenges;

import java.util.Scanner;

public class Microwave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter total items : ");
		int item = s.nextInt();
		
		System.out.println("Enter heating time : ");
		float heatingTime = s.nextFloat();
		
		switch(item) {
		
		case 1:
			System.out.println("Heating time is : " + heatingTime);
			break;
			
		case 2:
			System.out.println("Heating time is : " + (heatingTime / 2) + heatingTime);
			break;
		
		case 3:
			System.out.println("Heating time is : " + 2 * heatingTime);
			break;
		
		default:
			System.out.println("Heating more than three items are " + "not recommend ");
		}
		
		
		
	}

}
