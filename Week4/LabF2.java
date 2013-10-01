import java.util.Scanner;

/**
 * @author Dan Schaper
 *         Date: 9/17/13
 *         Time: 8:20 PM
 *         Week 4 Lab F2 Flow Chart
 */
public class LabF2 {

    /**
     * Simple flow chart to code demonstration
     *
     * @param args Not used
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Scanner for user input
        String thirsty;

        System.out.println("I'm Hungry!");
        System.out.println("Need to get in line.");
        System.out.println("Okay, time to buy lunch...");

        System.out.print("Hmm, do I want a Coke today? Y or N: "); // Prompt for input
        thirsty = in.nextLine();

        if (thirsty.toUpperCase().equals("Y")) {
            System.out.println("Okay, Coke it is!");
        } else {
            System.out.println("Where's the tap water?");
        }

        System.out.println("Now to eat...");
        System.out.println("All done, I'll be nice and put the tray back.");
        System.out.println("And we're off!");


    }
}
