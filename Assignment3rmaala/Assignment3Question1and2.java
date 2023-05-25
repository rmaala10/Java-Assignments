//Assignment 3: Classes and objects in Java - Question 1 and 2//
//Program for Question 1 and 2 rect class//
//Date: January 31, 2022//

package assignment3question1and2; //Start of question 1.//

class Rect //Defining class as Rect.//
{
    int x1, y1; //Variable declaration for the coordinates x1 and y1.//
    int length, width; //Length and width of rectangle.//

    Rect() //Constructor that will call on the variables when the function is called.//
    {
        length = 0; //Default values when the function is called.//
        width = 0;
        x1 = 0;
        y1 = 0;
    }

    public int getCircumf() //Method to return perimeter of rectangle.//
    {
        return 2*(length + width); //The perimeter of a rectangle equals 2*(length + width).//
    }

    public int getArea() //Method to return the area of the rectangle.//
    {
        return length*width; //The area of a rectangle equals length*width.//
    }

    public void move(int x2 , int y2) //Method to change the coordinates of the rectangle.//
    {
        x1 = x2; //Moves the x coordinate "x1" to the inputted coordinate "x2".//
        y1 = y2; //Moves the y coordinate "y1" to the inputted coordinate "y2".//
    }

    public void changeSize(int newdimensions) //Method to change the size of the rectangle.//
    {
        length = newdimensions; //Set length of the rectangle to newdimensions.//
        width = newdimensions; //Set width of the rectangle to newdimensions.//
    }

    public void print() //Method that prints the data of the rectangle.//
    {
        System.out.println("Coordinates x = " + x1 + " and y = " + y1); //Prints the coordinates of the rectangle.//
        System.out.println("Length: " + length + " Width: " + width); //Prints the length and width of the rectangle.//

        int area = this.getArea(); //Sets the variable area to the area from the function.//

        System.out.println("Area: " + area); //Prints out the area of the rectangle.//

        int circum = this.getCircumf(); //Sets the variable circum to the perimeter from the getCircumf function.//

        System.out.println("Circumference: " + circum); //Prints the perimeter of the rectangle.//

    }
} //End of question 1.//

public class Assignment3Question1and2 //Start of question 2.//
{
    public static void main(String[] args) 
    {
        Rect r1 = new Rect(); //Creates the class object.//

        r1.length = 7 ; //Assigns the value of 3 to the length of the rectangle.//
        r1.width = 31; //Assigns the value of 10 the the width of the rectangle.//

        System.out.println("Details of rectangle: "); //Prints the statement in the quotation marks.//

        r1.print(); //Calls the method of Rect class.//
        r1.move(9,78); //Calls the method that changes the coordinates and changes its coordinates.//
        r1.changeSize(10); //Calls the method that changes the size of the rectangle and changes the size of the rectangle.//

        System.out.println("Details of changed rectangle: "); //Prints the statement in the quotation marks.//

        r1.print(); //Calling the method that prints the details.//
    }
} //End of question 2.//
