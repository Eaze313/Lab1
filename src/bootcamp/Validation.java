package bootcamp;
import java.util.Scanner;

/**
 * Created by james on 3/29/17.
 */
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
}
