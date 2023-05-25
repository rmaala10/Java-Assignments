//Assignment 5: Strings//
//Program for Question 3 and 4 - Book Class Program by Rodney Maala.//
//Date: February 14, 2022//

package assignment5question3and4;

public class Assignment5Question3and4 //Start of Question 3.//
{

    //Variable declarations for different parts of infomation about the book.//
    private String Title; 
    private String Authors; 
    private int NumberOfPages; 
    private int YearOfPublication; 
    private double Price; 

    public Assignment5Question3and4() //Constructor that sets up empty strings for string variables and sets the numerical variables to 0 the number of pages, year of publication and price.//
    {
        Title = "";
        Authors = "";
        NumberOfPages = 0;
        YearOfPublication = 0;
        Price = 0;
    }

    public Assignment5Question3and4(String Title, String Authors, int NumberOfPages, int YearOfPublication, double Price) //Constructor to set the strings and numberical variables to specified values.//
    {
        this.Title = Title;
        this.Authors = Authors;
        this.NumberOfPages = NumberOfPages;
        this.YearOfPublication = YearOfPublication;
        this.Price = Price;
    }

    public String getTitleInTitleCase() //Method that returns the title of the book in Title Case format.//
    {
        String[] words = Title.split(" "); //Gets the array of strings using space as the delimiter.//

        String titleInTitleCase = "";

        for(int n = 0;n < words.length; n++) //For loop to scan over the array of words.//
        {
            if(words[n].length() > 0) //If the nth entry is not empty, add the nth word to titleInTitleCase string followed by a space.//
            {
                if(words[n].length() > 1) //If the number of characters in word is greater than 1 convert the first character to uppercase and rest of the characters to lowercase.//
                    
                    titleInTitleCase += Character.toUpperCase(words[n].charAt(0)) + words[n].substring(1).toLowerCase() + " ";
                
                else 
                    
                    titleInTitleCase += Character.toUpperCase(words[n].charAt(0)) + " "; //If the number of characters in the word is 1, convert the first characeter uppercase.//
            }
        }

        return titleInTitleCase.trim();
    }

    public boolean contains(String word) //Method that receives a word in string format, it returns true if the book title contains that string, if not false, it is case-sensitive.//
    {
        return Title.contains(word);
    }

   
    public void printAuthors()//Method that prints the name of each author on a separate line.//
    {
        String[] names = Authors.split(","); //Calls for the array of author names using comma as the delimiter.//

        for(int i=0;i<names.length;i++) //For loop that displays each author name in separate line.//
            System.out.println(names[i].trim()); //Prints the authors names.//
        

    } //End of Question 3.//
    
        public static void main(String[] args) //Start of Question 4.//
       {
        Assignment5Question3and4 book = new Assignment5Question3and4("java how to program", "Paul Dietel, Harvey Dietel", 250, 1995, 35.50); //Creates an object of Book class and inputs all the information of the book.//
        System.out.println("Title in title case format: "+book.getTitleInTitleCase()); //Calls the TitleinTitleCase method and prints the title in title case.//
        System.out.println("Title contains: "+book.contains("java")); //Checks if a word is contained in the title of the book and prints true of false depending if the word is in the title of not.//
        System.out.println("Title contains: "+book.contains("Java")); //Checks if a word is contained in the title of the book and prints true of false depending if the word is in the title of not.//
        System.out.println("Authors Names:");//Prints the words in the quotations.//
        book.printAuthors(); //Calls the printAuthors method and prints the authors names on separate lines.//
        System.out.println("Year of Publication: " + book.YearOfPublication); //Prints the year of publication.//
        System.out.println("Price: " + book.Price); //Prints the price of the book.//

        }
} //End of Question 4.//
