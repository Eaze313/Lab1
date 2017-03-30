import bootcamp.Validation;

import java.util.Scanner;

/**
 * James Bryant II
 * 1/30/17
 * RoomCalc.java
 * This program calculates the perimeter and area of various classrooms at Grand Circus
 * based on user input.
 *
 * Extended Challenge : Have the program return the Volume of a room.
 */
public class RoomCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        double length;
        double width;
        double height;
        int answer = 1;

            // Greeting Statement
           String name = Validation.getString(scan, "Welcome to Grand Circus' Room Detail Generator!\n\n" +
                    "Please Enter Your Name:");


            //while loop is used to continue the program until user opts out
        while (answer == 1) {


            System.out.println(name + ", " + "How long is the room? Enter the length below: "); // User enters the length of the room
            length = scan.nextDouble();

            System.out.println(name + ", " + "How Wide is the room? Enter the width below: "); // User enters the width of the room
            width = scan.nextDouble();

            System.out.println(name + ", " + "How tall is the room? Enter the height below: "); // User enters height of the room
            height = scan.nextDouble();

            // Area and Perimeter Calculations
            double area = length * width;
            double perimeter = (2 * length) + (2 * width);
            double volume = length * width * height;

            //Outputs
            System.out.println(name + ", " + "The area is: " + area + "\n"
                    + "The perimeter is: " + perimeter + "\n" +
                    "The volume is: " + volume);

            //Continue Prompt
            System.out.println();
            answer = Validation.getInt(scan, "Are you finished?\n" +
                    "(Press 1 to continue, 2 to exit)", 1, 2);

        }

            System.out.print("Thank You! See You Next Time!");

    }








    }





