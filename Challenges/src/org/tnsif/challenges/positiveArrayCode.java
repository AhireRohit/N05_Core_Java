package org.tnsif.challenges;

import java.util.Scanner;

public class positiveArrayCode {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of cases : ");
        int t = scanner.nextInt(); // Number of test cases
        
        for (int i = 0; i < t; i++) {
        
        	System.out.println("Enter the lenght of array : ");
            int n = scanner.nextInt(); // Length of the array
            
            int[] arr = new int[n];
            
            // Read the array elements
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }
            
            // Calculate and print the new array using brute force
            for (int j = 0; j < n; j++) {
                int sumWithoutCurrent = 0;
                for (int k = 0; k < n; k++) {
                    if (k != j) {
                        sumWithoutCurrent += arr[k];
                    }
                }
                if (j == n - 1) {
                    System.out.println(sumWithoutCurrent);
                } else {
                    System.out.print(sumWithoutCurrent + " ");
                }
            }
        }
		
	}

}
