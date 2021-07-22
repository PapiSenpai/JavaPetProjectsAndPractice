/****************************************************************************
    Example:
    Consider the following java program, it declares an int named day
    whose value represents a day(1-7). The code displays the name of the day,
    based on the value of the day, using the switch statement.
*****************************************************************************/

// Java program to demonstrate switch case
// with primitive(int) data type

public class Switch_Example {
	public static void main(String[] args)
	{
		int day = 5;
		String dayString;

		// switch statement with int data type
		switch (day) {
		case 1:
			dayString = "Monday";
			break;
		case 2:
			dayString = "Tuesday";
			break;
		case 3:
			dayString = "Wednesday";
			break;
		case 4:
			dayString = "Thursday";
			break;
		case 5:
			dayString = "Friday";
			break;
		case 6:
			dayString = "Saturday";
			break;
		case 7:
			dayString = "Sunday";
			break;
		default:
			dayString = "Invalid day";
		}
		System.out.println(dayString);
	}
}
