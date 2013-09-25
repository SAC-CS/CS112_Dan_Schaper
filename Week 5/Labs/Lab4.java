import java.util.Scanner;

/**
 * @author Dan Schaper
 *         Date: 9/24/13
 *         Time: 9:20 PM
 *         CS 112 Lab 4 For Loop
 */
public class Lab4 {

    public static void main(String[] args) {

        for (int i = 1; i < 4; i++) {
            System.out.printf("Starting Round %d of 3...\n",i);

            int targetNumber = 0 + (int) (Math.random() * 10); // Set random target number
            // System.out.println(targetNumber); //For debugging purposes
            Scanner in = new Scanner(System.in);

            System.out.print("Please inter an integer between 0 and 10: ");
            int userGuess = in.nextInt();

            if (userGuess == targetNumber) {
                System.out.println("Congrats, you guessed the number! Round Over.\n");
            } else if (userGuess < targetNumber) {
                System.out.println("Sorry, you were too low...");
            } else {
                System.out.println("Sorry, you were too high...");
            }
        }
        System.out.println("Game Over");
    }
}
