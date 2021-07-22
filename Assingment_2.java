/*
	Author: Juan Enriquez
	Class: CSC-18A
	Prof: Paul Conrad
	Project: Monthly Sales Tax
*/

import java.util.Scanner;

public class Assingment_2 {
    public static void main (String[] args)
    {
        //  Scanner for user input
        Scanner input = new Scanner (System.in);

        // User input is inserted
        System.out.print("Enter the first value: ");
        int value1 = input.nextInt();

        System.out.print("Enter the second value: ");
        int value2 = input.nextInt();

        System.out.print("Enter the third value: ");
        int value3 = input.nextInt();

        System.out.print("Enter the fourth value: ");
        int value4 = input.nextInt();

        //values 
        int greatestNum = value1;
        int lowestNum = value1;

        // if statement determining whether which value is greatest 
       
        if (greatestNum <= value2)
        {
            greatestNum = value2;
        }
        if (greatestNum <= value3)
        {
            greatestNum = value3;
        }
        if (greatestNum <= value4) 
        {
            greatestNum = value4;
        }
        else
        {
            System.out.println("Something went wrong!");
        }

        // if statement determining whether which value is lowest 
        
        if (lowestNum >= value2)
        {
            lowestNum = value2;
        }
        if (lowestNum >= value3)
        {
            lowestNum = value3;
        }
        if (lowestNum >= value4) 
        {
            lowestNum = value4;
        }
        else
        {
            System.out.println("Something went wrong!");
        }


        // OUTPUT -After calculations the numbers are in order
        System.out.printf("The values entered: %d, %d, %d, %d have a minimum value %d and a maximum value %d", value1, value2, value3, value4, lowestNum, greatestNum);

    } 
}
