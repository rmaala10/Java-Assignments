//Assignment 7: Inheritance and Polymorphism//
//Program for Question 1 and 2 - Ticketing System Program by Rodney Maala.//
//Date: March 14, 2022//


package assignment7question1and2;

import java.time.LocalDateTime;

class Ticket //Creates a class Ticket.//
{
    //Declaring different parts of the ticket.//
    Person passenger;
    String source;
    String destination;
    String departureTime;
    double price;
    String marker;

    String vehicle;

    private static int ticketCount = 0;

    public Ticket(String source, String destination, String departureTime, double price) //Ticket constructor that holds the tickets information.//
    {
        this.source = source;
        this.destination = destination;
        this.departureTime = departureTime;
        this.price = price;

        ticketCount++; //Increments the ticket count whenever a new ticket is made.//
    }

    public void setVehicle(String v) //Method to set the vehicle.// 
    {
        vehicle = v;
    }

    public void print() //Print method for the ticket's information.//
    {
        System.out.println("The number of tickets made so far: " + this.ticketCount);
        passenger.print();
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Departure Time: " + departureTime);
        System.out.println("Price: $" + price);
        System.out.println("Ticket Marker: " + marker);
    }

    public void register(Person person) //Register method.//
    {
        passenger = person;
        marker();
    }

    public void marker() //Marker method.//
    {
        LocalDateTime registerDate = java.time.LocalDateTime.now();
        marker = (ticketCount + " " + vehicle + " " + registerDate);
    }
}

class Person //Person class.//
{
    //Declaring different parts of information needed for a person.//
    String firstName;
    String lastName;
    String nationalCode;

    public Person(String firstN, String lastN, String nationalC) //Person constructor that holds all the information of a person.//
    {
        firstName = firstN;
        lastName = lastN;
        nationalCode = nationalC;
    }

    public void print() //Print method for the Person's information.//
    {
        System.out.println("Passenger: " + firstName + " " + lastName + "\nNational Code: " + nationalCode);
    } 
}

class Plane extends Ticket //Class Plane inherits Class Ticket's information.//
{
    public static final String vehicle = "Plane";

    public Plane(Person person, String source, String destination, String departureTime, double price)
    {
        super(source, destination, departureTime, price);

        this.setVehicle(vehicle);

        this.register(person);
    }

}

class Train extends Ticket //Class Train inherits Class Ticket's information.//
{
    public static final String vehicle = "Train";

    public Train(Person person, String source, String destination, String departureTime, double price)
    {
        super(source, destination, departureTime, price);

        this.setVehicle(vehicle);

        this.register(person);
    }
}

public class Assignment7Question1and2
{
    public static void main(String[] args) 
    {
    //Ticket 1's Information.//   
    String firstName = "Rodney";
    String lastName = "Maala";
    String nationalCode = "YYZ";
    String source = "Toronto";
    String destination = "Edmonton";

    Person p1 = new Person(firstName, lastName, nationalCode); //Creating an object person for person 1's information.//

    Ticket t1 = new Plane(p1, source, destination, "2:22am", 70.00); //Creating an object plane for a plane ticket.//

    //Ticket 2's Information.//   
    firstName = "Aira";
    lastName = "Dominguez";
    nationalCode = "YEG";
    source = "Edmonton";
    destination = "Toronto";

    Person p2 = new Person(firstName, lastName, nationalCode); //Creating an object person for person 2's information.//

    Ticket t2 = new Train(p2, source, destination, "4:44pm", 31.00); //Creating an object train for a train ticket.//

    System.out.println("Ticket 1"); //Prints the text in the quotations.//
    t1.print(); //Prints ticket 1.//

    System.out.println("\nTicket 2");  //Prints the text in the quotations.//
    t2.print();  //Prints ticket 2.//
    }
}
