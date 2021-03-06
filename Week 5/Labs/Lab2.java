import java.util.Scanner;

/**
 * @author Dan Schaper
 *         Date: 9/24/13
 *         Time: 8:43 PM
 *         CS 112 Lab 2 If Else
 */
public class Lab2 {
    public static void main(String[] args) {
        int targetNumber = 0 + (int) (Math.random() * 10); // Set random target number
        // System.out.println(targetNumber); //For debugging purposes
        Scanner in = new Scanner(System.in);

        System.out.print("Please inter an integer between 0 and 10: ");
        int userGuess = in.nextInt();

        if (userGuess == targetNumber) {
            System.out.println("Congrats, you guess the number!");
        } else {
            if (userGuess < targetNumber) {
                System.out.println("Sorry, you were too low...");
            }
            if (userGuess > targetNumber) {
                System.out.println("Sorry, you were too high...");
            }
        }

    }
}
