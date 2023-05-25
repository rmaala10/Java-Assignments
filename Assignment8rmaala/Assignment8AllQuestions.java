//Assignment 8: Interdace//
//Program for Comparable interface and compareTo methods for Circle and Student Classes by Rodney Maala.//
//Date: March 28, 2022//

package assignment8allquestions;

import java.lang.Comparable; //Imports the Comparable interface.//

class Student implements Comparable<Student> //Student class that sets the student's first name, last name, student number, and GPA.//

{
    public String firstName;
    public String lastName;
    public int studentNumber;
    public float gpa;
    
    void Student (String firstN,String lastN, int studentN, float gpa)
    {
        setName(firstN,lastN);
        setstudentNumber(studentN);
        setGPA(gpa);
    }

    void setName(String firstN, String lastN)
    {
        this.firstName = firstN;
        this.lastName = lastN;
    }

    void setstudentNumber(int studentN)
    {
        this.studentNumber = studentN;
    }

    void setGPA(float gpa)
    {
        this.gpa = gpa;
    }

    String giveName()
    {
        return firstName+" "+lastName;
    }

    int givestudentNum()
    {
        return studentNumber;
    }

    float returnGPA()
    {
        return gpa;
    }

    @Override //Overrides compareTo method from interface Comparable.//
    public int compareTo(Student s1) //CompareTo method that checks if the first students gpa is larger if it is larger it returns 1 if student 2's is larger it returns -1.//
    {                                //If the information from the students are the same, it will return 0.//
        if(this.giveName().equals(s1.giveName()) && this.givestudentNum()==s1.givestudentNum() && this.returnGPA()==s1.returnGPA())
        {
            return 0;
        }

        else if(this.returnGPA()<s1.returnGPA())
        {
            return -1;
        }

        else
        {
            return 1;
        }

    }
}

class Circle implements Comparable<Circle> //Circle class that sets the radius of the circles.//
{
    public int radius;
    
    void Circle(int rad)
    {
        setRad(rad);
    }
    void setRad(int rad)
    {
        this.radius = rad;
    }
    int getRadius()
    {
       return this.radius; 
    }
    
    @Override //Override the interface's class the parameter for comparison is the radius of the circle object.//
    public int compareTo(Circle c1) //compareTo method that compares the radii of two circles, returns -1 if the first circle is smaller, returns 1 if first circle is bigger, if the circles have the same radius it returns 0.//
    {
        if(this.getRadius()<c1.getRadius())
        {
            return -1;
        }
        else if(this.getRadius()>c1.getRadius())
        {
            return 1;
        }
        else
        {
            return 0;
        }  
    }
}

class Utility //Utility class for Comparable type arrays.//
{
    Comparable[] Sort(Comparable[] array) //Sort method for the arrays.//
    {
        int size = array.length;
        Comparable temp;
        for(int x = 1; x < size; x++)
            for(int y =size-1; y  >= x; y --)
            {
                if(array[y -1].compareTo(array[y ])==1)
                { 
                    temp = array[y -1];
                    array[y -1] = array[y ];
                    array[y ] = temp;
                }
            }
        return array;
    }
    
    Comparable returnMax(Comparable[] array)//returnMax method will return the largest value in the array.//
    {
        Comparable [] sorted_arr = Sort(array);
        return sorted_arr[sorted_arr.length-1];
    }
    
    Comparable returnMin(Comparable[] array)//returnMin method that returns the smallest value in the array.//
    {
        Comparable[] sorted_arr = Sort(array);
        return sorted_arr[0];
    }
 
    Comparable[] removeRep(Comparable[] array)//removeRep method that removes the repetition in the list of arrays./
    {
        Comparable[] sorted_arr = Sort(array); //Sorts the arrays.//
        Comparable[] new_arr = new Comparable[sorted_arr.length]; //Creates a new array to store a new array with no repetitions in the list.//
        int size = sorted_arr.length;
        int y = 0;
        
        for(int x = 0;x < size-1;x++) //For loop that compares all the arrays elements and ignore the repeats in it.//
        {
            if(sorted_arr[x].compareTo(sorted_arr[x+1])!=0)
            {
                new_arr[y]=sorted_arr[x];
                y++;
            }
        }
      
        if(sorted_arr[size-2].compareTo(sorted_arr[size-1])!=0) //If statement that checks that last statement of the element and it will be added if the element is not the same.//
        {
            new_arr[y] = sorted_arr[sorted_arr.length-1];
            y++;
        }
        return new_arr;
    }
}
public class Assignment8AllQuestions 
{

    public static void main(String[] args) 
    {
        Circle [] c = new Circle[5]; //Creates 5 arrays of type Circle.//
        Student[] s = new Student [4]; //Creates 4 arrays of type student.//

        //Creates a list of students to be put in the Student class.//
        s[0]= new Student();s[0].Student("Rodney","Maala",69,3);
        s[1] = new Student();s[1].Student("Naruto","Uzumaki", 70,2);
        s[2] = new Student();s[2].Student("Sasuke","Uchiha",71,4);
        s[3]= new Student();s[3].Student("Rodney","Maala",69,3);

        //Creates a list of circles to be put in the Circle class.//
        c[0]=new Circle();c[0].Circle(1);
        c[1]=new Circle();c[1].Circle(2);
        c[2]=new Circle();c[2].Circle(3);
        c[3]=new Circle();c[3].Circle(4);
        c[4]=new Circle();c[4].Circle(4);

        Comparable[] Students = s; //Calls on the comparable method students.//
        Comparable[] Circles = c; //Calls on the comparable method for circles.//
        
        Utility test = new Utility(); //Creates a utility class

        test.returnMax(Circles); //Calls on the returnMax method.//
        test.returnMin(Circles); //Calls on the returnMin method.//
        test.removeRep(Circles); //Calls on removeRep method.//
        System.out.println("Smallest Circle: "+ c[0].getRadius()); //Prints the smallest circle and its radius.//
        System.out.println("Largest circle: "+ c[Circles.length-1].getRadius()); //Prints the largest circle and its radius./

        test.returnMax(Students); //Calls on the returnMax method.//
        test.returnMin(Students); //Calls on the returnMin method.//
        test.removeRep(Students); //Calls on removeRep method.//
        System.out.println("\nLowest GPA: "+s[0].giveName()); //Prints the student with the lowest GPA.//
        System.out.println("Highest GPA: "+ s[3].giveName()); //Prints the student with the highest GPA.//
        
    }
    
    //Question 4 Answers
    //1.The Utility class and test class, show polymorphism behavior. The circle and student objects are both kept in a Comparable type array, allowing them to utilize the utility class's methods. 
    //2. An object is implemented to the Circle class's compareTo function if it does not implement the Comparable interface. Because it operates similarly to inheritance, the method will not work because it only works with classes that implement it. This causes an error, preventing the code from successfully compiling. 
    //3. Type Comparable is not a better type for the parameter since it restricts the interface's usage. Because it may be used with any object, a parameter of type object provides significantly more versatility and is more convenient when polymorphism is used.
    
}
