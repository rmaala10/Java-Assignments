//Assignment 6: Arrays//
//Program for Question 5 - Progam to print the first n prime numbers by Rodney Maala.//
//Date: February 27, 2022//

package assignment6question5;

import java.util.*;
public class Assignment6Question5
{
    public static boolean checkprime(int n) //Method to check  if the number is prime.//
    {
        if(n <= 1)
        {
            return false;
        }
        for(int i = 2; i < n; i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
                return true;
    }
    
    public static int[] primenumber(int n) //Method to put the prime numbers into an array.//
    {
        int[] numbers = new int[n]; //Integer n determines the array size.//
        int checker = 0, i = 0;

        while(checker < n) //While loop that checks if a number is prime and adds it to the array and stops when the n number of prime numbers is found.//
        {
            if(checkprime(i) == true) //Calls the checkprime method.//
            {
                numbers[checker] = i;
                checker++;
            }
            i++;
        }
        return numbers;
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in); //Declares the scanner and its input will be assigned to a variable called input.//
        System.out.print("Enter the n amount of prime number to be printed: "); //Prints the text in the quotations.//
        int size = input.nextInt(); //Sets the variable size equal to the input of the scanner.//
        int[] nums=primenumber(size); //Calls prime number method and stores the return array into another array.//
        
        for(int i = 0; i < size; i++) //For loop that prints out the return array.//
        {
            System.out.println(nums[i]);
        }
    }
}