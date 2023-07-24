package org.tnsif.looping;
import java.util.Scanner;

public class RightAngledTriangleLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner s = new Scanner(System.in);
		System.out.println("user input: ");
		int num = s.nextInt();
		
		for (int i = 1; i <= num ; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	}

