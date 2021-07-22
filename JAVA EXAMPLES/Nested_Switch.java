/* Example: This is called a nested switch.
   Since a switch statement defines its own block, no conflicts arise 
   between the case constants in the inner switch and those in the 
   outer switch.
*/
// Java program to demonstrate
// nested switch case statement
public class Nested_Switch {
	public static void main(String[] args)
	{
		String Branch = "CSE";
		int year = 2;

		switch (year) {
		case 1:
			System.out.println("elective courses : Advance english, Algebra");
			break;
		case 2:
			switch (Branch) // nested switch
			{
			case "CSE":
			case "CCE":
				System.out.println("elective courses : Machine Learning, Big Data");
				break;

			case "ECE":
				System.out.println("elective courses : Antenna Engineering");
				break;

			default:
				System.out.println("Elective courses : Optimization");
			}
		}
	}
}
