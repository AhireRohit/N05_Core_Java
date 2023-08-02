//Ask the customer's age and for the time on a 24-hour clock (where noon is 12.00 and 4:30 PM is 16.30). 
//The show timings are 10.15, 13.30, 18.00 and 22.00. The normal adult ticket price is $8.00, however, the adult matinee price is $5.00. 
//Adults are those over 13 years. The normal children's ticket price is $4.00, however, the children's matinee price is $2.00. 
//Write a program that determines the price of a movie ticket

package org.tnsif.challenges;

import java.util.Scanner;

public class priceOFMovieTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter the show time (in 24-hour clock format, e.g., 12.00 or 16.30): ");
        double showTime = scanner.nextDouble();

        double adultPriceNormal = 8.00;
        double adultPriceMatinee = 5.00;
        double childPriceNormal = 4.00;
        double childPriceMatinee = 2.00;

        double ticketPrice;

        if (age > 13) { 
            switch ((int) showTime) {
                case 10:
                case 13:
                case 18:
                case 22:
                    ticketPrice = adultPriceMatinee;
                    break;
                default:
                    ticketPrice = adultPriceNormal;
                    break;
            }
        } else { 
            switch ((int) showTime) {
                case 10:
                case 13:
                case 18:
                case 22:
                    ticketPrice = childPriceMatinee;
                    break;
                default:
                    ticketPrice = childPriceNormal;
                    break;
            }
        }

        System.out.println("The ticket price is: $" + ticketPrice);

        scanner.close();
    }
}



