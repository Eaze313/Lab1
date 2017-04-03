/**
 * James Bryant II
 * 1/30/17
 * RoomCalc.java
 * This program calculates the perimeter and area of various classrooms at Grand Circus
 * based on user input.
 *
 * Extended Challenge : Have the program return the Volume of a room.
 */


package bootcamp;
import java.util.Scanner;

public class RoomCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int answer = 1;

        // Greeting Statement
        String name = hello(scan);
        System.out.println(" ");


        //Do-While Checks for Exit
        do {
            // User enters Room Measurements
            double length = Validation.getDouble(scan,(
                    name + ", " + "How long is the room? "
                    + "Enter the length: "),0,10000 );

            double width = Validation.getDouble(scan,(
                    name + ", " + "How wide is the room? "
                    + "Enter the width: "),0,10000 );

            double height = Validation.getDouble(scan,(
                    name + ", " + "How tall is the room? "
                    + "Enter the room's height: "),0,10000 );

            //Method Invocation
            double area = area(length, width);
            double peri = perimeter(length, width);
            double vol = volume(length, width, height);

            //Output
            System.out.println(name + ", " + "Your room's area is: " + area +"sq ft\n"
                    + "Its perimeter is: " + peri + "ft,\n" +
                    " The volume is: " + vol + "cubic ft.\n");

            //Continue Prompt
            System.out.println();
            answer = Validation.getInt(scan, "Are you finished?\n" +
                    "(Press 1 to continue, 2 to exit)", 1, 2);

        } while (answer == 1);

        System.out.println(bye(name));



    }
    //Method - Greets User and Gets Their Name
    public static String hello(Scanner scan) {
            String name = Validation.getString(scan, "Hello!\nWelcome to My " +
                    "Room Space Calculator!\n\nPlease Tell Me Your Name: ");
            return name;
    }

    //Method - Farewells User
    public static String bye(String name) {
        return "Good Bye " + name + ",\nSee you next time";
    }

    //Method - Area equals Length x Width
    public static double area(double l, double w) {
        return l * w;
    }

    //Method - Perimeter equals Length + Width x 2
    public static double perimeter(double l, double w) {
        return (l + w) * 2;
    }

    //Method - Volume equals Length x Width x Height
    public static double volume(double l, double w, double h) {
        return l * w * h;
    }
}





