package DiceGame;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Dan Schaper
 *         Week 11 Homework TrippleDiceWithHistory Game
 */
public class DiceGame {
    private Scanner in = new Scanner(System.in);
    private int numOfBounces; // Number of bounces per roll
    private int playerGuess; // Players guess
    private int numCompWins; // Number of Computer wins
    private TrippleDiceWithHistory dices; // Dice for game
    public ArrayList<String[]> history; // ArrayList for game history
    public boolean play; // Play the game

    public DiceGame() {  // Construct the game
        numOfBounces = 0;
        play = true;
        numCompWins = 0;
        history = new ArrayList<>();
        System.out.println("Welcome to the Guess A Number Game -- Now With TrippleDice!");
        System.out.println("The computer will pick a number using three standard 6 sided dice.");
    }

    /**
     * Set the number of bounces per roll
     */
    public void setNumOfBounces() {
        System.out.print("Please enter the number of bounces per TrippleDice roll: ");
        while (!in.hasNextInt()) {   // Check for valid integer input
            System.out.print("Please enter a number only: ");
            in.next();
        }
        numOfBounces = in.nextInt();
    }

    /**
     * Instantiate the dice for this game
     */
    public void createDices() {
        dices = new TrippleDiceWithHistory(numOfBounces);
        System.out.printf("We are now playing with a TrippleDice bouncing %d times.\n", numOfBounces);
    }

    /**
     * Roll the dice
     */
    public void throwDices() {
        System.out.println("The computer is throwing the dice...");
        dices.Throw();
    }

    /**
     * Get the players guess
     */
    public void setPlayerGuess() {
        System.out.print("Now it's your turn to guess (between 1 and 6): ");
        while (!in.hasNextInt()) {  // Check for integer input
            System.out.print("Please enter a number only: ");
            in.next();
        }
        playerGuess = in.nextInt();
        while (playerGuess < 1 || playerGuess > 6) {   // Check if input is valid
            System.out.print("You can only guess a number on the face of the dice: ");
            playerGuess = in.nextInt();
        }
    }

    /**
     * Main game logic
     */
    public void playGame() {
        String winner;
        String result;
        int dicesValue = dices.getValue();
        if (playerGuess == dicesValue) {
            winner = "Player";
            result = "You Won!";
        } else {
            winner = "Computer";
            result = "You lost...";
            numCompWins++;
        }
        System.out.printf("You guessed %d, the computer rolled %d, %s\n", playerGuess, dicesValue, result);
        this.setHistory(winner, playerGuess);
    }

    /**
     * Check to see if user wants to continue
     */
    public void playAgain() {
        System.out.print("Would you like to play again? ");
        play = "y".contains(in.next().substring(0, 1).toLowerCase());
    }

    /**
     * Print the game history
     */
    public void printHistory() {
        System.out.println("Round   Player Guess   Computer Roll     Winner");
        for (String[] entry : history) {
            System.out.printf("%5s%15s%16s%11s\n", entry[0], entry[1], entry[2], entry[3]);
        }
        int numPlayerWins = dices.getThrows() - numCompWins;
        double playerWinPercent = (double) numPlayerWins / dices.getThrows();
        System.out.printf("Player won %d games (%.1f%%)", numPlayerWins, playerWinPercent * 100);

    }

    /**
     * Create an entry in the game history
     *
     * @param winner      Winner of the game round
     * @param playerGuess Players guess for this round
     */
    public void setHistory(String winner, int playerGuess) {
        String[] entry = {Integer.toString(dices.getThrows()), Integer.toString(playerGuess), Integer.toString(dices.getValue()),
                winner}; // Create the String array for the history entry in the ArrayList
        history.add(entry); // Add to the ArrayList
    }


}
