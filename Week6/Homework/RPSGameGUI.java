import javax.swing.*;
import java.util.Random;

/**
 * @author Dan Schaper
 *         CS112 Week 6 Homework Rock-Paper-Scissors w/ GUI
 */
public class RPSGameGUI {
    private int compItem; // Computer Item selection
    private int userItem; // User Item selection
    private int wins; // Number of wins
    private int loss; // Number of losses
    private int ties; // Number of ties
    private int roundsToWin; // Number of rounds needed to declare winner
    private int roundsPlayed; // Counter for number of rounds played
    private Random rand = new Random(); // Random generator
    public boolean gameWon;

    /**
     * Constructor for Rock, Paper, Scissors
     */
    public RPSGameGUI() {
        gameWon = false;
        int maxRounds = setNumRounds(); // Set number of rounds user chooses to play
        if (maxRounds == 0) {
            gameWon = true;
        }
        wins = 0;
        loss = 0;
        ties = 0;
        roundsPlayed = 0;
        roundsToWin = maxRounds / 2 + 1; // number of rounds needed to win game

    }

    public int setNumRounds() {
        String message = "How many rounds would you like to play? (Enter 0 to quit)";
        String title = "Welcome to Rock, Paper, Scissors";
        String response;
        do { // Basic exception handling to loop while user clicks cancel or doesn't enter a number
            response = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);
        } while (response == null || !"0123456789".contains(response));
        return Integer.parseInt(response);
    }

    /**
     * Prompt user for item choice
     */
    public void setUserChoice() {
        String[] tools = {"Rock", "Scissors", "Paper"}; // Array for user choices
        String message = "Click on your choice";
        String title = "Please choose your weapon";
        int response;
        response = JOptionPane.showOptionDialog(null, message, title, JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, tools, tools[0]);
        userItem = response + 1; //Add 1 to response to account for 0 based indexing
    }

    public void setCompChoice() {
        compItem = rand.nextInt(3) + 1; // Select computers choice
    }

    /**
     * Convert integer to game item
     *
     * @param num number to convert
     * @return game item as String
     */
    private String intToItem(int num) {
        switch (num) {
            case 1:
                return "Rock";
            case 2:
                return "Scissors";
            case 3:
                return "Paper";
        }
        return "Error: Choice not available.";
    }

    /**
     * Main game logic method for each round
     */
    public void roundResult() {
        roundsPlayed++;
        String title = String.format("Playing Round %d", roundsPlayed);
        String message = String.format("Computer chose %s, you chose %s\n\n", intToItem(compItem), intToItem(userItem));
        if (userItem - (compItem % 3) == 1) { // Using magic number 3 as the number of items to choose from
            message += "Sorry, you lost this round.";
            loss++;
        } else if (userItem == compItem) {
            message += "This round is a tie.";
            ties++;
        } else {
            message += "Congrats, you won this round!";
            wins++;
        }
        if (wins == roundsToWin) {
            message += "\n\n And you just won the game!";
            gameWon = true;
        } else if (loss == roundsToWin) {
            message += "\n\n And the computer just won the game.";
            gameWon = true;
        } else {
            message += String.format("\n\nRounds won: %d. Rounds lost: %d. Rounds tied: %d.", wins, loss, ties);
        }
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.PLAIN_MESSAGE);
    }
}
//Good job...this would be week 8 lab/hw
