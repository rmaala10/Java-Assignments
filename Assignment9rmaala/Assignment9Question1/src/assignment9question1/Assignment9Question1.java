//Assignment 9: Files//
//Program for Question 1 - FileUtils class by Rodney Maala.//
//Date: April 8, 2022//

package assignment9question1; 

public class Assignment9Question1 
{
    public static void main(String[] args) 
    {
    String testFolder = "C:\\Users\\rodne\\Documents\\NetBeansProjects\\Assignment9Question1\\src\\assignment9question1\\testFolder"; //Sets the testFolder as the folder that will be inputted into the length method.//
    System.out.println("The size of the test folder: " + FileUtils.length(testFolder) + " bytes"); //Calls on the length method and prints out the size of the folder in bytes.//
    
    System.out.println("\nRandom file's name: " + FileUtils.createRandomFile()); //Calls on the createRandomFile method and prints out the file name and location.//

    String fileName = "C:\\Users\\rodne\\Documents\\NetBeansProjects\\Assignment9Question1\\src\\assignment9question1\\fileName.txt"; //Sets the file fileName as the file that will be inputted into the split method.//
    int n = 10; //Set the number of lines that each file will have.//
    System.out.println("\nSplitting " + fileName + " with n = " + n);
    FileUtils.split(fileName, n); //Calls on the split function.//

    System.out.println("\nCreating directories with the current date."); 
    FileUtils.createDirectories(); //Calls on the createDirectories method.//
    System.out.println("\nThe directory has been created.");
    }
}

