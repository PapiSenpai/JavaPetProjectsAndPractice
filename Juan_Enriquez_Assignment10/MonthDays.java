package Juan_Enriquez_Assignment10;

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

