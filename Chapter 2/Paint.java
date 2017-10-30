
//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//***************************************************************
import java.util.Scanner;
public class Paint
{
        public static void main(String[] args)
        {
            final double COVERAGE = 350.0;  //paint covers 350 sq ft/gal
            
            Scanner scan = new Scanner(System.in);
            //declare integers length, width, and height;
            double length, width, height;
            //declare double totalSqFt;
            double totalSqFt;
            //declare double paintNeeded;
            double paintNeeded;
 
            //Declare and initialize the length of the room
            System.out.println("Length of the room: ");
            length = scan.nextDouble();
            //Declare and initialize the width of the room
            System.out.println("Width of the room: ");
            width = scan.nextDouble();
            //Declare and initialize the height of the room
            System.out.println("Height of the room: ");
            height = scan.nextDouble();
            //Compute the total square feet to be painted--think
            totalSqFt = 2 * (height*width) + 2 * (height*width);
            //Compute the amount of paint needed
            paintNeeded = (totalSqFt/350);
            //number of gallons of paint needed.
            System.out.println("you need "+paintNeeded+"gallons of pain");
        }
}