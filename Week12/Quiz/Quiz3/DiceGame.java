package Quiz3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Dan Schaper
 *         Week 12 Quiz
 */
public class DiceGame {
    private Scanner in = new Scanner(System.in);
    private int playerGuess; // Players guess
    private Dice dices; // Dice for game
    private ArrayList<Integer[]> history; // ArrayList for game history
    public boolean play; // Play the game
    private int diceValue;
    private int numDice;
    int numPlayerWins;

    private enum Winner {Computer, Player}


    public DiceGame() {  // Construct the game
        play = true;
        history = new ArrayList<>();
        System.out.println("Welcome to the Guess A Number Game -- Now With multiple dice!");
        System.out.println("The computer will pick a number using between one and three standard 6 sided dice.");
    }

    /**
     * Instantiate the dice for this game
     */
    public void createDices() {
        System.out.print("How many dice would you like to play with, 1, 2 or 3 :");
        numDice = in.nextInt();
        switch (numDice) {
            case 1:
                dices = new Dice();
                break;
            case 2:
                dices = new DoubleDice();
                break;
            case 3:
                dices = new TrippleDice();
                break;
        }
        System.out.printf("We are now playing with %d dice(s).\n", numDice);
    }

    /**
     * Roll the dice
     */
    public void throwDices() {
        System.out.println("The computer is throwing the dice...");
        diceValue = dices.Throw();
    }

    /**
     * Get the players guess
     */
    public void setPlayerGuess() {
        System.out.printf("Now it's your turn to guess (between 1 and %d): ", 6 * numDice);
        while (!in.hasNextInt()) {  // Check for integer input
            System.out.print("Please enter a number only: ");
            in.next();
        }
        playerGuess = in.nextInt();
        while (playerGuess < 1 || playerGuess > 6 * numDice) {   // Check if input is valid
            System.out.print("You can only guess a number that could possible be rolled: ");
            playerGuess = in.nextInt();
        }
    }

    /**
     * Main game logic
     */
    public void playGame() {
        Winner winner;
        String result;
        if (playerGuess == diceValue) {
            winner = Winner.Player;
            result = "You Won!";
        } else {
            winner = Winner.Computer;
            result = "You lost...";
        }
        System.out.printf("You guessed %d, the computer rolled %d, %s\n", playerGuess, diceValue, result);
        this.setHistory(winner, playerGuess, diceValue);
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
    @Override
    public String toString() {
        String result = "";
        result += String.format("Round   Player Guess   Computer Roll     Winner\n");
        for (Integer[] entry : history) {
            result += String.format("%5s%15s%16s%11s\n", entry[0], entry[1], entry[2], Winner.values()[entry[3]]);
            numPlayerWins += entry[3];
        }
        return result;
    }

    public void printHistory() {
        double playerWinPercent = (double) numPlayerWins / history.size();
        System.out.printf("Player won %d games (%.1f%%)", numPlayerWins, playerWinPercent * 100);

    }

    /**
     * Create an entry in the game history
     *
     * @param winner      Winner of the game round
     * @param playerGuess Players guess for this round
     */
    public void setHistory(Winner winner, int playerGuess, int dicesValue) {
        Integer[] entry = {history.size() + 1, playerGuess, dicesValue,
                winner.ordinal()}; // Create the Integer array for the history entry in the ArrayList
        history.add(entry); // Add to the ArrayList
    }


}
