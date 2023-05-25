//Assignment 3: Classes and objects in Java - Question 3 and 4//
//Program for Question 3 and 4 Date class//
//Date: January 31, 2022//

package assignment3question3and4; //Start of question 3.//

class Date //Defining class as Date.//
{
    int day, month, year; //Variable declarations for day, month, and year.//

    public Date(int dd, int mm, int yy) //Initalizes the Date constructor.//
    {
        day = dd; //Assigns dd the value of the date's day.//
        month = mm; //Assigns mm the value of the date's month.//
        year = yy; //Assigns yy the value of the date's year.//
    }

    public void addDays(int n) //Method that takes the first date and adds n days to the date.//
    {
        day = (day + n); //Adds the number of days n to the days of the first date.//

        if(day >= 31) //If the days added to the date past 31 it increments the month up by 1 and gets the date difference and sets it as the day of the new date.// 
        {
            int daydiff = day - 31;
            month++;
            day = daydiff;
        }
    }

    void compare(int day2, int month2, int year2) //Method that compares two dates and prints out the number of days in between them and declares the variables day2, month2, and year2 which are the inputs for the second date the date to be compared by the first date.//
    {
    double d1toDays = day +(year * 365); //Adds the total amount of days that are converted from the first date.//

for(int m = month; m > 0; m--) //For loop that converts the month in the first date to days.//
{
if (m == 1||m == 3||m == 5||m == 7||m == 8||m == 10||m == 12) //Checks if the first date's month is a month with 31 days.//
    d1toDays += 31; //Adds 31 days to the total amount of days for the first date.//

else if (m == 4||m == 6||m == 9||m == 11) //Checks if the first date's month is a month is a month with 30 days.//
    d1toDays += 30; //Adds 30 days to the total amount of days for the first date.//

else if(m == 2) //Checks if the first date's month is Feburary.//
    d1toDays += 28; //Adds 28 days to the total amount of days for the first date.//

}
    double d2toDays =  day2 +(year2 * 365); //Adds the total amount of days that are converted from the second date.//

for(int m2 = month2; m2 > 0; m2--) //For loop that converts the month in the second date to days.//
{
if (m2 == 1||m2 == 3||m2 == 5||m2 == 7||m2 == 8||m2 == 10||m2 == 12) //Checks if the second date's month is a month with 31 days.//
    d2toDays += 31; //Adds 31 days to the total amount of days for the second date.//

else if (m2 == 4||m2 == 6||m2 == 9||m2 == 11) //Checks if the second date's month is a month with 30 days.//
    d2toDays += 30; //Adds 30 days to the total amount of days for the second date.//

else if(m2 == 2) //Checks if the second date's month is a month with 28 days.//
    d2toDays += 28; //Adds 28 days to the total amount of days for the second date.//
}

double TotalDaysinBetween = Math.abs(d1toDays - d2toDays)+ day; //Finds the difference in between the first date and the second date.//
System.out.println("The days between the dates are = " + TotalDaysinBetween); //Prints out the days in between the first date and the second date.//

}

    public String print() //Method that formats the printing of the date.//
    {
        return ""+year+"/"+month+"/"+day;
    }
} //End of question 3.//

public class Assignment3Question3and4  //Start of question 4.//
{
    public static void main(String[] args) 
    {
        Date date = new Date(31,1,2022); //Assigns Date as the first date.//
        System.out.println("First Date: " + date.print());
        date.addDays(7); //Calls the method addDays and adds 7 days to the first date.//
        System.out.println("Date after adding 7 days: " + date.print());
        date.compare(9,2,2022); //Assigns this as the second date the one that compares with the first date.//
    }

} //End of question 4.//
