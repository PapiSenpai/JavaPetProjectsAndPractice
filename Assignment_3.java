/*
	Author: Juan Enriquez
	Class: CSC-18A
	Prof: Paul Conrad
	Project: Pennies for Pay
*/

import java.util.Scanner;

public class Assignment_3
 {
    public static void main (String[] args)
    {
        // The Scanner Varible
        Scanner input = new Scanner (System.in);

        // Counter Varible
        int counter;

        // Varibles
        double penny = .01;
        double total = 0;

        // Ask user for amount of days 
        System.out.println("For how many days will the pay double?");
        int days = input.nextInt();

        // Make sure its between 1 to 45 days
        if (days >= 1 && days <= 45)
        {
            // OUTPUT 
             System.out.printf("%s%25s%n","Day", "Total pay");
             System.out.println("---------------------------------");

            for (counter = 1 ; counter <= days ; counter++)
            {
                // Calculation (.01 * 2^(n - 1)
               total = penny * Math.pow(2, counter - 1);
                System.out.printf("%d%19s%12.2f%n", counter, "$", total);
            }
        }
        else
        {
            System.out.print("Something went wrong");
        }

    }      

}
