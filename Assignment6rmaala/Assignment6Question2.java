//Assignment 6: Arrays//
//Program for Question 2 - addAll method for Circle C by Rodney Maala.//
//Date: February 27, 2022//

package assignment6question2;

import java.util.Random; //Imports the random class.//
import java.util.stream.IntStream; //Imports intStream class.//

class Circle
{
    private int totalradius; //Declares a private integer totalradius.//
    int [] r = IntStream.rangeClosed(1,100).toArray(); //Set the array range from 1 to 100.//

    public void addAll() //addAll method.//
    {
        Random random = new Random(); //Declares the variable random and assigns a rondom number from 10 to 1000.//
        int i = 990; //Variable declaration for i and sets it to 990.//
        int radius = random.nextInt(i) + 10; //Sets the radius to a random number from 0 to 990 and adds ten to make sure the number is not zero.//
        System.out.println("The radius of Circle C is: " + radius); //Prints the radius of circle C.//
        
        for(int n = 0; n <r.length; n++) //For loop that adds the numbers 1 to 100 to the randomly selected radius and prints it.//
        {
            totalradius = radius + r[n];
            System.out.println("The radius is: " + totalradius); 
        }
    }
}

public class Assignment6Question2 {

    public static void main(String[] args) 
    {
      Circle sum = new Circle(); //Creates a new circle object called sum.//
      sum.addAll(); //Calls on the addAll function.//
    }

}
