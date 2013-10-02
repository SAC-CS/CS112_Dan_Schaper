import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Dan Schaper
 *         Date: 10/1/13
 *         Time: 7:20 PM
 *         Week 6 Lab 1  boolean
 */
public class Lab1 {
    public static void main(String[] args) {

        int count = 1; // incrementing counter for number of rounds played
        int continueGame; // Sentinel variable for game end control
        Random rand = new Random();
        boolean playGame = true;

        do { // Main application loop for game
            String message; // Dialog box message local variable
            String userGuessStr; // Users guess local variable
            String roundTitle = String.format("Round %d", count); // Set title for dialog box

            int targetNumber = rand.nextInt(11); // Set random target number
            System.out.println(targetNumber); //For debugging purposes show target number

            // Prompt user for guess
            do { // Basic exception handling to loop while user clicks cancel or doesn't enter a number
                message = "Please enter an integer between 0 and 10"; // dialog box message
                userGuessStr = JOptionPane.showInputDialog(null, message, roundTitle, JOptionPane.QUESTION_MESSAGE);
            } while (userGuessStr == null || userGuessStr.equals(""));

            int userGuessInt = Integer.parseInt(userGuessStr); // Parse out integer from String input

            // main game logic block
            if (userGuessInt == targetNumber) {
                message = "Congrats! You guessed the number! Round Over.";
                roundTitle = "You Won!";
            } else if (userGuessInt < targetNumber) {
                message = "Sorry, you were too low";
                roundTitle = "You lost";
            } else {
                message = "Sorry, you were too high...";
                roundTitle = "You lost";
            }
            JOptionPane.showMessageDialog(null, message, roundTitle, JOptionPane.INFORMATION_MESSAGE); // Result display
            count++; //increment loop counter

            // Prompt user for continuation of game
            message = "Would you like to play again? Y or N";
            continueGame = JOptionPane.showConfirmDialog(null, message, "Continue?", JOptionPane.YES_NO_OPTION);
            if (continueGame != JOptionPane.YES_OPTION){
                playGame = false;
            }
        }
        while (playGame);
        JOptionPane.showMessageDialog(null, "Game Over");
    }
}
