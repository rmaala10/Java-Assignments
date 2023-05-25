//Assignment 2: Basic Structures in Java - Question 1//
//Program that prints prime numbers under 10000 using switch, case and for statements by Rodney Maala//
//Date: January 23, 2022//

package assignment2question2;

public class Assignment2Question2 
{

    public static void main(String[] args) 
{
      
  int i,count; //Declares variables i and count.//

      for (int number = 1; number <= 10000; number++) //For loop to go through every number from 1 to 10000. It also declares the variable number an assigns it the value 1.//
      {
        count = 0; //Assigns the variable count the number 0.//

        for (i = 2; i <= (number / 2); i++) //For loop thaat assigns the variable equal to 2. It checks the variable i is less or equal to than the number divided by 2 check if its a prime number, and then increments i to check if the number is divisible by the the next value of i.//
        {

          switch (number % i) //Switch to focus the cases of the number modulus i.//
          {
            case 0:  //Case for if the remainder of the number divided by the i is equal to 0.//
            count++; //Count increments by 1//
            break; //Terminates the loop and tells the program to execute the rest of the code outside the loop.//
          }

        }

        switch (count) //Switch to focus on the variable count.//
        {
          case 0: //Case for if count is equal to 0.//
          switch (number) //Switch to focus on the number.//
          {
            case 1: //Case for if the number is equal to one.//
            break; //Terminates the loop and tells the program to execute the rest of the code outside the loop.//
            default:  //Defaults to printing prime numbers.//
            System.out.print(" " +number);
            break;
          }
        }
      }
}  
}
