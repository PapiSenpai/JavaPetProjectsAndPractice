/*
	Author: Juan Enriquez
	Class: CSC-18A
	Prof: Paul Conrad
	Project: MonthDays
*/

// implement Scanner for user input 
import java.util.Scanner;

//set class MonthDays
class MonthDays
{
    // Instance Varibles
	private int month;
	private int year;
	private Boolean leap;
	private static final int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 
											  31, 31, 30, 31, 30, 31};
                                        
	public MonthDays (int month, int year)
	{
		setMonth(month);
		this.year = year;
	}

    //Used to catch unvalid requests
	public void setMonth (int month)
	{
		if (month < 1 || month > 12)
		{
			throw new IllegalArgumentException
				("Month must be between 1 and 12. Program terminating.");
		}

		this.month = month;
	}

	public int getMonth ()
	{
		return month;
	}

	public void setYear (int year)
	{
		this.year = year;
	}

	public int getYear()
	{
		return year;
	}

	public int getNumberOfDays()
	{
		if (year % 100 == 0 && year % 400 == 0)
			leap = true;
		else if (year % 100 != 0 && year % 4 == 0)
			leap = true;
		else
			leap = false;
			
		if (month == 2 && leap)
			return (daysInMonth[month] + 1);
		else
			return daysInMonth[month];
	}

	public MonthDays() {
	}

}


public class Assignment_6
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
		
		MonthDays myDate = new MonthDays (month, year);
		
		System.out.printf ("%n%d%s%d%s%d%s", myDate.getMonth(), "/", 
							myDate.getYear(), " has ", 
							myDate.getNumberOfDays(), " days.");
	}
}