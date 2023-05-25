//Assignment 5: Strings//
//Program for Question 2 - Random String Generator by Rodney Maala.//
//Date: February 14, 2022//

package assignment5question2;

import java.util.Random; //Imports the java random class.//

public class Assignment5Question2 
{

    static String RandomString(int a) //Class to generate a random string of length a.//
    { 
        String String1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz"; //Declares String1 and it stores all the alphanumeric characters.//

        StringBuilder randomstring = new StringBuilder(a); //Declares a string randomstring as a modifible string and sets its length to variable a.//
  
        for (int i = 0; i < a; i++) //For loop that generates random characters for the string.//
        {
   
            int RandomNum = (int)(String1.length() * Math.random()); //Generates random numbers for the random string.//
  
            randomstring.append(String1.charAt(RandomNum)); //Inputs each random character one by one in the end of the string.//
        } 
  
        return randomstring.toString();
    }

    
    public static void main(String[] args) 
    {
      int a = 10; //To change the length of the string change the value of a.//
      System.out.println("Random String:"); //Prints the text in the quotations.//
      System.out.println(Assignment5Question2.RandomString(a)); //Calls and prints the random string.//
    }

    
}

