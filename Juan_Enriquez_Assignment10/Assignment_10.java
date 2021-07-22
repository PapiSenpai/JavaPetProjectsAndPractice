package Juan_Enriquez_Assignment10;

/*
	Author: Juan Enriquez
	Class: CSC-18A
	Prof: Paul Conrad
	Project: MonthDays Modified To Have Exceptions
*/

// implement Scanner for user input 
import java.util.Scanner;

//set class MonthDays (Main on seperate source file)
// Driver Class
public class Assignment_10
{
	public static void main (String[] args)
	{
		int month;
		int year;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print ("Enter the month (1=January, 2=February, ... 12=December): ");
		month = input.nextInt();

		System.out.print ("Enter the year: ");
		year = input.nextInt();
		
		// create object for MonthDays
		MonthDays myDate = new MonthDays (month, year);
		
			// Try Catch blocks to get Exceptions
			try{
				if (month <= 1 || month >= 12) 
					throw new IllegalAccessException("Error");
				}
			catch (IllegalAccessException e){
					System.out.println("Exception caught at month: The value is not" +
										"between the numbers 1-12!");
				}

			try{
				if (year <= 0) 
					throw new IllegalAccessException("Error");
				}
			catch (IllegalAccessException e){
					System.out.println("Exception caught at year: The value is not" +
										" positive!");
					}
			

		System.out.printf ("%n%d%s%d%s%d%s", myDate.getMonth(), "/", 
							myDate.getYear(), " has ", 
							myDate.getNumberOfDays(), " days.");
	}
}