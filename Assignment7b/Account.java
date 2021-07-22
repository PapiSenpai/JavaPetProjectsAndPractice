/*
	Author: Juan Enriquez
	Class: CSC-18A
	Prof: Paul Conrad
	Project: Monthly Sales Tax
*/

// Fig. 7.8: Account.java
// Account class with a double instance variable balance and a constructor
// and deposit method that perform validation.

package Assignment7b;

import java.math.BigDecimal;
import java.io.*;

public class Account
{   
   private String name; // instance variable 
   private BigDecimal balance; // instance variable 


   // Account constructor that receives two parameters  
   public Account(String name, BigDecimal balance) 
   {
      this.name = name; // assign name to instance variable name

      // validate that the balance is greater than 0.0; if it's not,
      // instance variable balance keeps its default initial value of 0.0
      if (balance.doubleValue() > 0.0) // if the balance is valid
         this.balance = balance; // assign it to instance variable balance
   }

   // method that deposits (adds) only a valid amount to the balance
   public void deposit(BigDecimal depositAmount) 
   {      
      if (depositAmount.doubleValue() > 0.0) // if the depositAmount is valid
         balance = balance.add(depositAmount); // add it to the balance 
   }

   // method returns the account balance
   public BigDecimal getBalance()
   {
      return balance; 
   } 

   // method that sets the name
   public void setName(String name)
   {
      this.name = name; 
   } 

   // method that returns the name
   public String getName()
   {
      return name; 
   } 
} // end class Account