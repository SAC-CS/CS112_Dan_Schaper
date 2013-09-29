import javax.swing.JOptionPane;

/**
 * @author Dan Schaper
 *         Date: 9/26/13
 *         Time: 2:58 PM
 *         CS 112 Lab 7 Do While Sentinel with some Swing!
 */
public class Lab7 {
    public static void main(String[] args) {

        int count = 1; // incrementing counter for number of rounds played
        String continueGame; // Sentinel variable for game end control

        do { // Main application loop for game
            String message; // Dialog box message local variable
            String userGuessStr; // Users guess local variable
            String roundTitle = String.format("Round %d", count); // Set title for dialog box

            int targetNumber = 0 + (int) (Math.random() * 10); // Set random target number
            System.out.println(targetNumber); //For debugging purposes show target number

            do { // Basic exception handling for Null Pointer if user clicks Cancel
                message = "Please enter an integer between 0 and 10"; // dialog box message
                userGuessStr = JOptionPane.showInputDialog(null, message, roundTitle, JOptionPane.QUESTION_MESSAGE);
            } while (userGuessStr == null);

            int userGuessInt = Integer.parseInt(userGuessStr); // Parse out integer from String input

            if (userGuessInt == targetNumber) {
                message = "Congrats! You guessed the number! Round Over."; // dialog box message
                JOptionPane.showMessageDialog(null, message, "You Won!", JOptionPane.INFORMATION_MESSAGE);
            } else if (userGuessInt < targetNumber) {
                JOptionPane.showMessageDialog(null, "Sorry, you were too low");
            } else {
                JOptionPane.showMessageDialog(null, "Sorry, you were too high...");
            }
            count++; //increment loop counter
            continueGame = JOptionPane.showInputDialog(null, "Would you like to play again? Y or N");
        }
        while (continueGame.toLowerCase().equals("y")); // Continue while user enters Y
        JOptionPane.showMessageDialog(null, "Game Over");
    }
}
