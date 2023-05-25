//Assignment 5: Strings//
//Program for Question 5 - Email Reader by Rodney Maala.//
//Date: February 14, 2022//

package assignment5question5;

import java.util.Scanner; //Imports the valid data used for the scanner.//

public class Assignment5Question5 
{

   public static void main(String[] args) 
    {

       Scanner input = new Scanner(System.in); //Declares the scanner and its input will be assigned to a variable called input.//
       System.out.println("Enter email addresses seperated by a space, comma or semicolon: "); //Prints the text in the quotations.//

       String email = input.nextLine(); //Declares the string email  and assigns it as the input of the scanner.//
       String[] arr = email.split(("[, ;]+")); //Declares that the string is spilt with spaces, commas, and semicolons.//

       System.out.println("\nEmails that have the _ character: "); //Prints the text in the quotations.//

       for(int i=0;i<arr.length;i++) //For loop that check if the emails have underscores ("_").//
        {

           if(arr[i].contains("_")) //If the email contains an underscore ("_") the program prints out that email address.//
           {

               System.out.println(arr[i]);

           }

       }

       System.out.println("\nEmails that are associated with Gmail: "); //Prints the text in the quotations.//

       for(int i=0;i<arr.length;i++) 
        {

           if(arr[i].contains("gmail")) //If the email contains gmail the program prints out that email address.//
            {

               System.out.println(arr[i]);

            }

       }

    for(int i=0;i<arr.length;i++) 
        {

           if(arr[i].contains("Gmail")) //If the email contains Gmail the program prints out that email address.//
            {

               System.out.println(arr[i]);

            }

       }
   }

}


