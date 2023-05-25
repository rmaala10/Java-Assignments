//Assignment 9: Files//
//Program for Question 2 - Buffering vs No Buffering for Creating Files Program by Rodney Maala.//
//Date: April 8, 2022//

package assignment9question2;

import java.io. BufferedOutputStream; //Imports the BufferedOutputStream library.//
import java.io.FileOutputStream; //Imports the FileOutputStream library.//
import java.io.IOException; //Imports the IOException library.//

public class Assignment9Question2
{ 
    public static void main(String[]args)
    {
        String fileName = "Buffering.bin"; //Creates a string to set it to the name of the binary file.// 
        int RandomNumberCount = 10000000; //Sets the 10 million random integers as an integer variable.//
        
        long startTime = System.currentTimeMillis(); //Starts the timer and sets the start time as a long variable.//

        try //Executes the code in the brackets.//
        {
        BufferedOutputStream BufferingOutput = new BufferedOutputStream(new FileOutputStream(fileName)); //Uses Buffering to make a new file.//
            
        for(int i = 0; i < RandomNumberCount; i++) //For loop that writes 10 million random integers with buffering in the file.//
            {
            BufferingOutput.write(RandomIntGenerator()); 
            }

            BufferingOutput.close(); 

        }

        catch(IOException Error) //If there is an error it prints out the errors.//
            {
            Error.printStackTrace(); //If there is an error it excecutes the code below.//
            }   

        long endTime = System.currentTimeMillis(); //Ends the timer and sets the end time as a long variable.//
        
        System.out.println("Time that it takes to create the file with buffering: " + (endTime - startTime) / 1000.000 + " seconds"); //Prints the time it takes to create the file in seconds.//

        //Creating the file without buffering.//
        String fileName2 = "WithoutBuffering.bin"; //Creates a string to set it to the name of the binary file.// 

        startTime = System.currentTimeMillis(); //Starts the timer and sets the start time as a long variable.//

        try //Executes the code in the brackets.//
        {
        FileOutputStream FileOutput = new FileOutputStream(fileName2); //Uses FileOutputStream to create a file.//
        
            for (int i = 0; i < RandomNumberCount; i++) //For loop that writes 10 million random integers without buffering in the file.//
                {
                FileOutput.write(RandomIntGenerator());
                }
       
                FileOutput.close();
        } 
        
        catch (IOException Error) //If there is an error it executes the code below.//
            {
            Error.printStackTrace();//Prints out the errors.//
            }

        endTime = System.currentTimeMillis(); //Ends the timer and sets the end time as a long variable.//
        
        System.out.println("Time that it takes to create the file without buffering: " + (endTime - startTime)/1000.000 + " seconds"); //Prints the time it takes to create the file in seconds.//
        }

        public static int RandomIntGenerator() //Method that returns a random integer.//
            {
            return (int) (Math.random());
            }

}