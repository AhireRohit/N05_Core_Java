/*ask a user what their birth year encoded as two digit(like "62")
 * and for the current year , also encoded as two digit(like "99")
 * write a program to find the user current age in years*/

package org.tnsif.questions;


	import java.util.Scanner;

	public class BirthYearChallenge {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Ask the user for their birth year encoded as two digits
	        System.out.print("Enter your birth year (e.g., 62): ");
	        int birthYear = scanner.nextInt();

	        // Ask the user for the current year encoded as two digits
	        System.out.print("Enter the current year (e.g., 99): ");
	        int currentYear = scanner.nextInt();

	        // Calculate the user's current age in years
	        int century = 1900; // Assume the 20th century (1900s)
	        int birthCentury = century + birthYear;
	        int currentCentury = century + currentYear;

	        int age = currentCentury - birthCentury;

	        // Print the result
	        System.out.println("Your current age is: " + age + " years.");

	        scanner.close();
	    }
	}
