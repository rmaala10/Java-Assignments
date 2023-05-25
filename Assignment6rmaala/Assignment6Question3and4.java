//Assignment 6: Arrays//
//Program for Question 3 and 4 - Program that decomposes a circle into its constituent circles by Rodney Maala.//
//Date: February 27, 2022//

package assignment6question3and4; //Start of Question 3.//

import java.util.*; //Imports the valid data used for the scanner.//

class Circle //Creates a class Circle.//
{  
    public int[] decompose(int radius) //Method that decomposes the Circle with return type array and having one argument.//
    {
    int a = 2, i = 0; //Declares the variable a and sets it equal to 2, and declares the variable i the variable that will be the index of an array and sets it equal to 0.//

    int arr[] = new int[10]; //Creates an array with size 10.//

    while(radius >0 && radius != 0) //While loop that excutes until the radius of the circle is 0.
    {
        if(radius % a == 0) //Checks if the radius is divisible by a or not, if not the value of a is incremented.//
        { 
            arr[i]= a; //The variable a stored in the array with the index variable.//
            i++; //Increments the index value by 1.//
        
            if(radius == a) //If loop for if the radius is equals to a.//  
            { 
             radius = radius - a;
            }
            else
            {
             radius = (radius/a);  //Reduces the radius after decomposing.//
            }
            
        }
        else
        { 
         a++; //Else it increments the a value.//
        }
    }
    return arr; //Returns the array.// 
    }
} //End of question 3.

public class Assignment6Question3and4 //Start of question 4.//
{
    public static void main(String arg[])
    {
    Scanner input = new Scanner(System.in); //Declares the scanner and its input will be assigned to a variable called input.//
     
    int radius;//Declares a new radius variable.//

    int array_of_circle[]= new int[10]; //Declares and initilizes the array with size 10.//
        
  
     System.out.print("Enter the radius of Circle: "); //Asks the user for the raduis of the circle.//
     
    radius = input.nextInt(); //Assigns the variable radius as the input of the scanner.//
       
    Circle circle = new Circle(); //Creates object circle for Circle class.//

    array_of_circle = circle.decompose(radius); //Calls the Decompose method.//
     
    System.out.println("The radii of the consituent circles are:"); //For loop that prints out the radii of the consituent circles.//
    for (int i = 0; i < array_of_circle.length; i++)
    { 
    if(array_of_circle[i] == 0) //Prints the radii value and stops printing if the radius is 0.//
    break;  
          
     System.out.println("Decomposed with radius: "+ array_of_circle[i]); //Prints the values of the array.//
    }
    }
} //End of question 4.//