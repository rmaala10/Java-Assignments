//Assignment 2: Basic Structures in Java - Question 4//
//Program that calculates the sum of integers until the user enters zero by Rodney Maala//
//Date: January 23, 2022//

package assignment2question4;

import java.util.*; //Import the valid data used for the scanner.//
public class Assignment2Question4 
{

    public static void main(String[] args) 
{

Scanner input = new Scanner(System.in); //Declares the scanner and its input will be assigned to a variable called input.//

System.out.println("Enter a integer: "); //Asks the user to enter an integer.//

int data = input.nextInt(); //Declares the variable data and assigns it as the input of the scanner.//

int sum = 0; //Declares the variable sum and assigns it the value of zero.//
while (true) //While loop that repeats adding the integers if the condition is true.//
{
    if (data == 0) //If the inputted number is zero then the program executes the code below.//
{
        break; //Terminates the loop and tells the program to execute the rest of the code outside the loop.//
}
    else //If the inputted number is not zero the code below is executed//
    { 
        sum += data; //Function that adds the integers, the sum is equal to the sum plus data, so everytime a new integer is inputted the sum equals the sum of the previous integers plus the new integer and repeats this until zero is inputted.//
    }
System.out.println("Enter another integer: "); //Asks the user for another integer.//
            data = input.nextInt(); //Assigns the input as the data variable.//
}

System.out.println("The sum of the numbers is " + sum); //Prints out the total sum of the integers//
}
}
