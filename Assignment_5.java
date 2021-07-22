/*
	Author: Juan Enriquez
	Class: CSC-18A
	Prof: Paul Conrad
	Project: Array Statistics
*/

import java.util.Scanner;

public class Assignment_5
{
    public static void main(String[] args)
    {
		//Varibles
		int i; // counter

		//Initialize Scanner
		Scanner input = new Scanner(System.in);

		// Ask user how many values they want
		System.out.print("How many values do you want stored? ");
		int amount = input.nextInt();

		//Inititaize Array 
		double[] ARRAY = new double[amount];
		
		System.out.println("What numbers do you want to populate your array with?");

		// For loop to populate array
		for (i=0; i < amount; i++)
		{
			System.out.printf("Enter a value # %d : ", i+1);
			ARRAY[i] = input.nextDouble();
		}
		
		//Varibles for max and min
		double min = ARRAY[0];
		double max = ARRAY[0];

		// for loop to get the max and min
		for (i = 0; i < ARRAY.length; i++)
		{
			if(ARRAY[i] < min)
			{
				min = ARRAY[i];
			}
			if(ARRAY[i] > max)
			{
				max = ARRAY[i];
			}
		}
		//intitialize sum of contents in array
		double sum = 0;
		for (i=0; i < ARRAY.length; i++)
		{
			sum += ARRAY[i];
		}

		// calulation to find average
		double average = sum / ARRAY.length;

		// Call Functions 
		double sampleDiv = Sample_Div(average, ARRAY);
		double standeredDiv = Stand_Div(average, ARRAY);


		System.out.println("\nThe statistics for your user entered array is:");
		System.out.println("------------------------------------------------");
		System.out.printf("%32s%11.3f%n", "Minimum: ", min);
		System.out.printf("%32s%11.3f%n", "Maximum: ", max);
		System.out.printf("%32s%11.3f%n", "Average: ", average);
		System.out.printf("%32s%11.3f%n", "Standard deviation (population)", standeredDiv);
		System.out.printf("%32s%11.3f%n", "Standard deviation (sample):", sampleDiv);
		
	}
 
	// Method that does the Standard Deviation
	public static double Stand_Div(double average, double... ARRAY)
	{
		int k; 						// counter
		double E_Caluculation = 0;	// Varible intializing E_Caluculation

		//Caculations to get E|x- u|^2
		for (k=0; k < ARRAY.length; k++)
		{
		 	E_Caluculation += Math.pow((ARRAY[k] - average), 2);
		}

		double standardDiv = Math.sqrt(E_Caluculation / ARRAY.length);
		return standardDiv;
	}

	// Method that does the Sample Deviation
	public static double Sample_Div(double average, double... ARRAY)
	{
		int k;
		double E_Caluculation = 0;

		//Caculations to get E|x- u|^2
		for (k=0; k < ARRAY.length; k++)
		{
		 	E_Caluculation += Math.pow((ARRAY[k] - average), 2);
		}

		double sampleDiv = Math.sqrt(E_Caluculation / (ARRAY.length-1));

		return sampleDiv;
	}
}
