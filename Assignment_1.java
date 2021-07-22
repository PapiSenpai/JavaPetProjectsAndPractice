/*
	Author: Juan Enriquez
	Class: CSC-18A
	Prof: Paul Conrad
	Project: Monthly Sales Tax
*/
 
 
import java.util.Scanner;
 
 
 class Assingment_1
{
	public static void main (String[] args)
	{
		//Scanner for input
		Scanner input = new Scanner (System.in);
 
		//Prompts
		System.out.println("Enter month name: ");
		String month = input.nextLine();
 
		System.out.print("Enter the year: ");
		int year = input.nextInt();
 
		System.out.print("Enter amount that is to be collected: ");
		double money = input.nextDouble();
 
		// Calculations
		double Total = money / 1.086; // The total sales tax
		double CountyTax = Total * 0.0285; // County Tax
		double Statetax = Total * 0.0575;  	// tax amount
 
		//Output
		
		System.out.printf ("Month: %s %d%n", month, year);
		System.out.printf ("-------------------------------%n");
		System.out.printf ("%-17s", "Total Collected:");
		System.out.printf ("%6s%.2f%n", "$ ", money);
		System.out.printf ("%-17s", "Sales:");
		System.out.printf ("%6s%.2f%n", "$ ", Total);
		System.out.printf ("%-17s", "County Sales Tax:");
		System.out.printf ("%8s%.2f%n", "$ ", CountyTax);
		System.out.printf ("%-17s", "State Sales Tax:");
		System.out.printf ("%7s%.2f%n", "$ ", Statetax);
		System.out.printf ("%-17s", "Total Sales Tax:");
		System.out.printf ("%7s%.2f%n", "$ ", CountyTax + Statetax);
 
 
	}
}