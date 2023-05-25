//Assignment 5: Strings//
//Program for Question 1 - String to Summary Form by Rodney Maala.//
//Date: February 14, 2022//

package assignment5question1;

import java.util.Scanner; //Imports the valid data used for the scanner.//

public class Assignment5Question1 
{


    static String returnSummaryForm(String a) //Class that returns the input string into summary form.//
    {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < a.length(); i++) //For loop that goes through every character and counts the occurences of one character.//
        {
            int count = 1; 
            while (i + 1 < a.length() && a.charAt(i) == a.charAt(i + 1)) //While loop that counts the occurences of a[i].//
            {
                i++; //Increments i.//
                count++; //Increments count.//
            }
            if (count == 1) //If the count of the character is one it returns the character itself.//
            {
                sb.append(a.charAt(i)); 
            } 
            else //If the count of character is more than one it returns the character and the count of the character in the string.//
            {
                sb.append(a.charAt(i)).append(count); 
            }
        }

        return sb.toString(); 
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in); //Declares the scanner and its input will be assigned to a variable called input.//
        System.out.print("Enter string to be put into summary form: "); //Prints out the text in the quotations.//
        String a = input.nextLine(); //Declares the string a and assigns it as the input of the scanner.//
        System.out.println("The string in summary form is: " + returnSummaryForm(a)); //Prints out the text in the quotations, calls the returnSummaryForm class, and prints the inputted string in summary form.//
    }

}