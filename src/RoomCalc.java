import java.util.Scanner;

/**
 * James Bryant II
 * 1/30/17
 * RoomCalc.java
 * This program calculates the perimeter and area of various classrooms at Grand Circus based on user input
 */
public class RoomCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        double length;
        double width;
        double height;
        int answer = 1;


            System.out.println("Welcome to Grand Circus' Room Detail Generator!");

        while (answer == 1) {


            System.out.println("How long is the room? "); // User enters the length of the room
            length = scan.nextDouble();

            System.out.println("How Wide is the room? "); // User enters the width of the room
            width = scan.nextDouble();
            System.out.println("How tall is the room? "); // User enters height of the room
            height = scan.nextDouble();

            // Area and Perimeter Calculations


            double area = length * width;
            double perimeter = (2 * length) + (2 * width);
            double volume = length * width * height;
            //Outputs
            System.out.println("The area is: " + area);
            System.out.println("The perimeter is: " + perimeter);
            System.out.println("The volume is: " + volume);


            System.out.println("Are you finished? 1 for No, 2 for Yes");
            answer = scan.nextInt();

        }

            System.out.print("Thank You! See You Next Time!");

    }








    }





