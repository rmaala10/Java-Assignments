/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package assignment9question1;
import java.io.File; 
import java.util.Calendar;
import java.io.BufferedWriter;
import java.io.FileWriter; 
import java.io.FileReader;
import java.io.BufferedReader;

//The length method takes the path of a folder as a parameter and calculates and returns the size of that folder in bytes.//
//The folder size includes the size of all the files in that folder and its subfolders.//

public class FileUtils //class fileUtils.//
{

    public static long length(String filePath) //Length method.//
    {
        long size = 0; 
        File file = new File(filePath);

        if (file.isDirectory()) //If file is a folder.//
            { 
            File[] files = file.listFiles(); //Get all the files in that folder.//

                for (File f : files) //For all the files in that folder.//
                    {
                        if (f.isDirectory()) //If the file is a folder.//
                            {
                            size += length(f.getAbsolutePath()); //Call length on that folder.//
                            }

                            else //Else if the file is a file.//
                                {
                                size+=f.length(); //Add the size of that file to the total size.// 
                                } 

                    }
            }

        else
            {
            size = file.length(); //If file is a file, add the size of that file to the total size.// 
            }

        return size; //Returns the size of the folder.//

    }

//The createRandom file creates a file with a random name with 15 characters length and a txt file extension.//
//The file name generated contains uppercase and lowercase letters.//
//The file is created in the folder of the program.//
//The program returns the full address of the created file with its name.//

public static String createRandomFile()
{
        String fileName = ""; //Creates a string for the file name to be stored in.//
        for (int i = 0; i < 15; i++) //For loop that creates 15 random letters.//
            {
                int random = (int)(Math.random()*2);

                if (random == 0)
                    {
                    fileName += (char)((int) (Math.random()*26) + 65);
                    }
                    
                    else
                        {
                        fileName += (char) ((int) (Math.random()*26) + 97);
                        }
            }
        
        fileName += ".txt"; //adds .txt at the end of the file name.//
        
        File file = new File(fileName); //Method to create a new file.//

        try
            {
            file.createNewFile(); //Creates a new file.//
            } 

            catch (Exception Error) //Catches errors and prints them out.//
                {
                Error.printStackTrace(); //Prints out the error.//
                }

        return file.getAbsolutePath(); //REturns the random file.//

}

//The split method takes a file name contain in a string and an integer parameter n and divides the txt file into smaller files.//
//It stores each n rows of the file in a new text file that will be put in the same folder.// 
//For example, if the file named fileName has 45 lines and n = 10.//
//The first 10 lines of the file will be saved in a file named fileNamel.txt.// 
//The second 10 lines of the file will be saved in a file named fileName2.txt.//
//The third 10 lines of the file will be saved in a file named fileName3.txt.//
//The fourth 10 lines of the file will be saved in a file named fileName4.txt.// 
//The last 5 lines of the file will be saved in a file named fileName5.txt.//

public static void split(String fileName, int n) 
{
    try 
        {
        FileReader fileReader = new FileReader(fileName); //Creates file reader.// 
        BufferedReader bufferedReader = new BufferedReader(fileReader); //Creates buffered reader.//
        String baseName = fileName.substring(0, fileName.length() - 4); 
        String line;

        int i = 1;
        int lineNum = 1;

        while((line = bufferedReader.readLine()) != null) //While loop that read each line of the file.//
            {
            String fN = baseName + i + ".txt"; 

            FileWriter fileWriter = new FileWriter(fN, true); //Creates file writer.//
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); //Creates buffered writer.//

            bufferedWriter.write(line); //Writes the lines into the file.//
            bufferedWriter.newLine(); //Creates a new line.//
            bufferedWriter.close(); //Closes the buffered writer.//

                if (lineNum % n == 0) //If n divides lineNum, increment i.//
                    {
                    i++;
                    }   

                lineNum++;

            } 
        }

    catch(Exception Error) //Catches errors and prints them out.//
    {
    Error.printStackTrace(); //Prints the errors.//
    }
}

//The createDirectories method gets the current date and creates a directory.//
//The name of the directory is the number of the year. 
//In this directory another directory is created and its name is the number of the month.//
//Inside the number of the month directory it creates another directory and its name is the number of the day.//

public static void createDirectories()
{
    String path = ""; //Creates a string for the directory name.//
    int year = Calendar.getInstance().get(Calendar.YEAR); //Gets the year and sets it to an integer variable.//
    int month = Calendar.getInstance().get(Calendar.MONTH) + 1;  //Gets the month and sets it to an integer variable.//
    int day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH); //Gets the day and sets it to an integer variable.//
    
    path += year; //Names the directory the number of the year.//
    File file = new File(path); //Creates a file.//
    file.mkdir(); //Creates the year directory.//

    path += "/" + month; //Names the directory the number of the month.//
    file = new File(path); //Creates a file.//
    file.mkdir(); //Create the month directory.//

    path += "/" + day; //Names the directory the number of the year.//
    file = new File(path); //Creates a file.//
    file.mkdir(); //Create the month directory.//
}

}