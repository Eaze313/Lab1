/**
 * RoomCalc.java
 * Validation Class added on 3/29/17.
 * This program calculates the perimeter, area,
 * and volume of a room at based on user input.
 */


package bootcamp;
import java.util.Scanner;

public class Validation {
    public static String getString(Scanner sc, String prompt) {
        System.out.println(prompt);
        String s = sc.next();  // read user input
        sc.nextLine();  // discard any other data entered on the line
        return s;
    }

    public static int getInt(Scanner sc, String prompt) {
        int i = 0;
        boolean isValid = false;
        while (isValid == false) {
            System.out.println(prompt);
            if (sc.hasNextInt())
            {
                i = sc.nextInt();
                isValid = true;
            }
            else
            {
                System.out.println("Error! That's not a valid number. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return i;
    }

    public static int getInt(Scanner sc, String prompt,
                             int min, int max)
    {
        int i = 0;
        boolean isValid = false;
        while (isValid == false) {
            i = getInt(sc, prompt);
            if (i < min)
                System.out.println(
                        "Invalid Answer. Please Try again.");
            else if (i > max)
                System.out.println(
                        "Invalid Answer. Please Try Again.");
            else
                isValid = true;
        }
        return i;
    }

    public static double getDouble(Scanner sc, String prompt) {
        double d = 0;
        boolean isValid = false;
        while (!isValid)
        {
            System.out.print(prompt);
            if (sc.hasNextDouble())
            {
                d = sc.nextDouble();
                isValid = true;
            }
            else
            {
                System.out.println("Sorry, that is an invalid entry");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return d;
    }

    public static double getDouble(Scanner sc, String prompt,
                                   double min, double max) {

        double d = 0;
        boolean isValid = false;
        while (!isValid)
        {
            d = getDouble(sc, prompt);
            if (d < min)
                System.out.println(
                        "Error! Number must be positive, and greater than " + min);
            else if (d > max)
                System.out.println(
                        "Error! Number must be " + max + " or less.");
            else
                isValid = true;
        }
        return d;
    }

}




