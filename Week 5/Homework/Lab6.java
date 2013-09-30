import java.util.Scanner;

/**
 * @author Dan Schaper
 *         Date: 9/26/13
 *         Time: 2:48 PM
 *         CS 112 Lab 6 Do While Loop
 */
public class Lab6 {

    public static void main(String[] args) {

        int count = 1;

        do {
            System.out.printf("Starting Round %d of 3...\n", count);

            int targetNumber = 0 + (int) (Math.random() * 10); // Set random target number
            System.out.println(targetNumber); //For debugging purposes
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
            count++; //increment loop counter
        } while (count < 4);
        System.out.println("Game Over");
    }
}
//Good
