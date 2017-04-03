/**
 * James Bryant II
 * 1/30/17
 * RoomCalc.java
 *
 * This program calculates the perimeter and area of various classrooms at Grand Circus
 * based on user input.
 *
 * Extended Challenge :
 * (1)Have the program return the Volume of a room
 */

package bootcamp;
import java.util.Scanner;

class GreetExit {

    //Method - Greets the User
    static String hello(Scanner scan) {
        //Greeting and UserName Request
        String user = Validation.getString(
                scan, "Hi. Welcome to the the Java Decision Maker App.\n" +
                        "Please tell me your name?\n");

        return user;
    }

    //Method - Farewells the User
    static String bye(String userName) {
        return "\nFarewell " + userName + ",\nUntil Next Time!!!";
    }




}