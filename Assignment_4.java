/*
	Author: Juan Enriquez
	Class: CSC-18A
	Prof: Paul Conrad
	Project: Perfect Number
*/

import java.util.Scanner;

public class Assignment_4 {
   public static void main(String[] args) 
   {
       // Scanner initializer
       Scanner input = new Scanner(System.in);
       
       // Ask for User input
       System.out.println("Enter number: ");
       int number = input.nextInt();

       // Used to Output text
       String str = "";

       // do-while statement used to not exceed 1000000
       do
       {
            for (int i = 1; i < number; i++)
            {
                // calls the isPerfect Method. Computes each number indivifually
                str = isPerfect(i);
                
                // Failsafe to ensure that wrong input cannot pass
                if (str != null)
                {
                    System.out.println(str);
                }
                
            }
        }
        while (number <= 1 && number >= 1000000);
        
   }

   /*************************************************
        Method: isPerfect
        computes wheter a number is perfect or not 
   *************************************************/
   public static String isPerfect(int n) 
   {
       // String initializer
       String s = "";
       // Varible set to 0
       int sum = 0;
        // for loop to test out numbers from 0 to what user inputed
       for (int i = 1; i < n; i++) 
       {
           // Makes sure theres is no remainder to number since 
           // perfect numbers have none.
           if (n % i == 0) 
           {
               s = s + " " + i;
               sum += i;
           }
       }
       // Makes sure that what is in sum equals to what is n and if it is
       // it would be a perfect number
       if (sum == n) 
       {
           s = n + " is perfect.\n\tFactors:" + s;
           return s;
       }

       // return null statement
       return null;
   }
}