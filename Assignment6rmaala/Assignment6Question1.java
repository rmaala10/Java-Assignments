//Assignment 6: Arrays//
//Program for Question 1 - addAll method for Circle class by Rodney Maala.//
//Date: February 27, 2022//

package assignment6question1;

class Circle
{
    public int c1radius; //Variable declaration of the radius of the first circle.//
    public int c2radius; //Variable declaration of the radius of the second circle.//
    public int totalradius; //Variable declaration of the total radius of the circle 1 and circle 2.//
    public int[] arrayradii = {1, 2, 3, 4, 5}; //Array declaration of the radii of the circles in the array.//

    public Circle() //Constructor to assign a value to radius of circle 1 and circle 2.//
    {
        c1radius = 10; 
        c2radius = 20;
    }

    public void add() //add method to add circle 1 and circle 2.//
    {
        totalradius = c1radius + c2radius;
        System.out.println("The sum of the radius of circle 1 and circle 2 is: " + totalradius); 
    }

    public void addAll() //addAll method to add the array of circle objects radius to the radius.//
    {
        for (int i = 0; i < arrayradii.length; i++) //For loop that adds each radii of the array to the sum of circle 1 and circle 2.//
        {
        totalradius = c1radius + c2radius + arrayradii[i];
        System.out.println("The radius of [Circle " + i +"] is " + totalradius);
        }
    }
}

public class Assignment6Question1
{
    public static void main(String[] args)
    {
        Circle sum = new Circle(); //Creates a new circle object called sum.//
        sum.add(); //Calls on the circle 1 and 2 add function.//
        sum. addAll(); //Calls on the addAll function.//
    }
}
