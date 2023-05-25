//Assignment 4:  Constructors and Access Modifiers - Question 1 and 2//
//Program for Question 1 and 2 class Rect modifiers by Rodney Maala.//
//Date: February 7, 2022//

package assignment4question1and2;

class Rect //Creates a class rect//
  {
    
    public int x1,y1; //Declares 2 variables x1 and y1 with public modifiers.//

    public int length, width; //Declares 2 variables length and width with public modifiers.//

    
    public Rect(int length, int width) //Method that uses public modifier and constructors to call length and width.//
    {
        this.length = length; 
        this.width = width;
    }
    
    
    public Rect(int length, int width, int x2, int y2) //Method that uses a public modifier and creates absolute values for the length and width of the rectangles.//
    {
        if(length < 0) //If the length is less than one, it takes the absolute value of the negative number, and if the length is equal to 0 it will set the length to 1.// 
        {
            length = Math.abs(length);
        }
        else if(length == 0)
        {
            length=1;
        }
        
        if(width < 0) //If the width is less than one,it takes the absolute value of the negative number, and if the length is equal to 0 it will set the with to 1.// 
        {
            width = Math.abs(width);
        }
        else if(width == 0)
        {
          width = 1;  
        }
        
        this.length = length; //Constructor that calls the length and width.//
        this.width = width;
        
        x1 = x2; 
        y1 = y2;
    }
   
    public boolean isBiggerThan(Rect o) //Boolean method that compares two rectangles.//
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

    public int getArea() //Method to get the area of the rectangle with a public modifer.//
    {
        return length*width;
    }

    
    public int getCircumf() //Method to get the area of the rectangle with a public modifier.//
    {
        return 2*(length+width);
    }

    public void move(int x3,int y3) //Method to move the rectangle with a public modifier.//
    {

        x1 = x3;
        y1 = y3;
    }
    
    public void changeSize(int i) //Method that changes the size of the rectangle.//
    {
        if(i < 0) //If statement that changes the length and width of the rectangle.//
        {
            length = width;
            width = Math.abs(i);
        }
        else if(i == 0)
        {
            length = width;
            width = 1;
        }
        else
        {
            length = width;
            width = i;
        }
    }
    
    public void print() //Method that prints the information for the first rectangle.//
    {    
        System.out.println("First Rectangle:");

        System.out.println("Coordinates: ("+x1+","+y1+")");
        System.out.println("Length: "+length);
        System.out.println("Width: "+width);
        System.out.println("Area: "+getArea());
        System.out.println("Perimeter: "+getCircumf());
        
    }
    
    public void print2() //Method that prints the information for the second rectangle.//
    {
        
        System.out.println("\nSecond Rectangle:");
        
        System.out.println("Area: "+getArea());
        System.out.println("Perimeter: "+getCircumf());
    }
}
public class Assignment4Question1and2 
{
    public static void main(String[] args)
    {
        Rect r1 = new Rect(7,-7,1,11); //Inputs the length, width and cooridinates of rectangle 1.//
        Rect r2 = new Rect(5,10); //Inputs the length and width of rectangle 2.//
        r1.print(); //Prints the print method for the first rectangle.//
        r2.print2(); //Prints the print method for the second rectangle.//
        r1.isBiggerThan(r2); //Prints the print method that compares the 2 rectangles.//
    }   
}