//Assignment 4:  Constructors and Access Modifiers - Question 3//
//Program that uses coordinates of two rectangles and prints out information of the two rectangles by Rodney Maala.//
//Date: February 7, 2022//

package assignment4question3;
import java.lang.Math;

class RectMod 
{
    
    private int xtopleft; //Declares 4 variables xtopleft, ytopleft, xbottomright, and ybottom right with private modifiers.//
    private int ytopleft;
    private int xbottomright;
    private int ybottomright;

    public RectMod(int xtl, int ytl, int xbr, int ybr) //Method that stores the input of the coordinates.//
    { 
        xtopleft = xtl;
        ytopleft = ytl;
        xbottomright = xbr;
        ybottomright = ybr;
        setLengthAndWidth(); //Calls the method that checks in case the length and or width equals 0 or coordinates are equal.//
    }
    public int getLength() //Method that returns length.//
    {
        return Math.abs(ytopleft - ybottomright);
    }
    public int getWidth() //Method that returns width.//
    {
        return Math.abs(xtopleft - xbottomright);
    }
    public void setLengthAndWidth() //Method that checks if length and or width equals 0 or coordinates are the equal.//
    {
        if (xtopleft == xbottomright) //Increments xtopleft by 1 if the coordinate of xtopleft and xbottomright is same.//
        {
            xtopleft++;
        }
        if (ytopleft == ybottomright) //Increments ytopleft by 1 if the coordinate of ytopleft and ybottomright is same.// 
        {
            ytopleft++;
        }
        if (xtopleft > xbottomright) //If xtopleft is to the right of xbottomright take the absolute value of xtopleft.//
        {
            xtopleft *= -1;
        }
        if (ytopleft < ybottomright) //If ytopleft is to the right of ybottomright take the absolute value of ytopleft.//
        {
            ytopleft *= -1;
        }
    }
    public int getCircumf() //Method to get the perimeter of the rectangle with a public modifier.//
{ 
        int c = 2 * (getLength() + getWidth());
        return c;
    }
    public int getArea(){ //Method to get the area of the rectangle with a public modifier.//
        int a = getWidth() * getLength();
        return a;
    }
    public void moveUpperLeft(int x, int y) //Method that moves the top left coordinates to a certain point.//
    {
        xtopleft = x;
        ytopleft = y;
    }
    public void moveBottomRight(int x, int y) //Method that moves the bottom right coordinates to a certain point.//
    {
        xbottomright = x;
        ybottomright = y;
    }
    public void changeSize(int r) //Method that changes the length and width of the rectangle depending on if there is an error in placing the coordinates.//
    {
       int a = r - Math.abs(getLength()); //Gets differemce between a and length.//
       int b = r - Math.abs(getWidth());  //Gets differemce between b and width.//
       if (xtopleft <= xbottomright) //If xtopleft is less than xbottomright subtract xtopleft by b else add it.//
       {
           xtopleft -= b;
       }
       else
       {
           xtopleft += b;
       }
       if (ytopleft <= ybottomright) //If ytopleft is less than ybottomright subtract ytopleft by a else add it.//
       {
           ytopleft -= a;
       }
       else
       {
           ytopleft += a;
       }
    }
   public boolean isBiggerThan(RectMod o) //Boolean method that compares two rectangles.//
    {
      
        //A new rect object is created to store the area of the second rectangle.//
        int area1 = this.getArea();   //Declares a variable for both the area of the first rectangle and second rectangle.//
        int area2 = o.getArea();
        
        if(area1 > area2) //If the area of the first rectangle is larger than the second rectangle print true and if the area of the first rectangle is smaller than the second rectangle then print false.//
        {
            System.out.println("\nTrue");
            return true;
        }
        
        else
        {
            System.out.println("\nFalse");
            return false;
        }
    }

    public void print() //Method that prints out all the info of the rectangles.//
    {
        System.out.println("Rectangle Info:");
        System.out.println("Top Left Coordinates: " + xtopleft + "," + ytopleft);
        System.out.println("Bottom Right Coordinates: " + xbottomright + "," + ybottomright);
        System.out.println("Length: " + getLength());
        System.out.println("Width: " + getWidth());
        System.out.println("Perimeter: " + getCircumf());
        System.out.println("Area: " + getArea());
    }   
}

public class Assignment4Question3
{

    public static void main(String[] args)
    {
        RectMod r1 = new RectMod(1,-1,5,-5); //Inputs the length, width and cooridinates of rectangle 1.//
        RectMod r2 = new RectMod(3,-3,4,-4); //Inputs the length, width and cooridinates of rectangle 2.//
        r1.print(); //Prints the print method for the first rectangle.//
        r2.print(); //Prints the print method for the second rectangle.//
        r1.isBiggerThan(r2); //Prints the print method that compares the 2 rectangles.//
    }   
}   
