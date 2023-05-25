//Assignment 2: Basic Structures in Java - Question 1//
//Program that prints prime numbers under 10000 by Rodney Maala//
//Date: January 23, 2022//

package assignment2question1;

public class Assignment2Question1 
{

    public static void main(String[] args) 
{
        
		int i, number = 1; //Declares variables i and number, and assigns the variable number equal to 1.//
		
		System.out.println("The prime Numbers under 10000 are: "); //Prints the statement inside the quotes.//	
		while(number <= 10000) //While loop to go through every number from 1 to 10000.//
		{
			i = 2; //Assigns the variable i equal to 2.//
                        while(i <= number/2 ) //While loop that checks the variable i is less than or equal to the number divided by 2 check if its a prime number.//
		    {
		    	if(number % i == 0) //If the number divided by i has a remainder of 0 that means that it is not a prime number.//
		    	{
		    		break; //The loop breaks and tests the next number.//
		    	}
		    	i++; //i increments to checks the next number to check if the number is divisible by 3 keeps on increasing by one if the if statement below is not satisfied.//
		    }
		    if(i == (number/2+1)) //If the the divisor is equal to the number divided by 2 and plus 1 the program prints out the number which is prime.//
		    {
		    	System.out.print(number + " ");//Prints the prime number.//
		    }
		    number++; //Increments the number and tests if its a prime number or not.//
		}
}
    
}
