package Quiz3;

import java.util.Scanner;

/**
 * @author Dan Schaper
 *         Week 12 Quiz
 */
public class DiceGame {
    private Scanner in = new Scanner(System.in);
    private int playerGuess; // Players guess
    private Dice dices; // Dice for game
    private String history; // ArrayList for game history
    private boolean continueGame; // Play the game
    private int diceValue;
    private int numDice;
    private int numPlayerWins;
    private int numRounds;

    private enum Winner {Computer, Player}


    public DiceGame() {  // Construct the game
        continueGame = true;
        history = "";
        numRounds = 0;
        System.out.println("Welcome to the Guess A Number Game -- Now With multiple dice!");
        System.out.println("The computer will pick a number using between one and three standard 6 sided dice.");
    }

    /**
     * Instantiate the dice for this game
     */
    public void createDices() {
        System.out.print("How many dice would you like to continueGame with, 1, 2 or 3 :");
        numDice = in.nextInt();
        switch (numDice) {
            case 1:
                dices = new SingleDice();
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
        System.out.printf("Now it's your turn to guess (between %d and %d): ", numDice, 6 * numDice);
        while (!in.hasNextInt()) {  // Check for integer input
            System.out.print("Please enter a number only: ");
            in.next();
        }
        playerGuess = in.nextInt();
        while (playerGuess < numDice || playerGuess > 6 * numDice) {   // Check if input is valid
            System.out.print("You can only guess a number that could possibly be rolled: ");
            playerGuess = in.nextInt();
        }
    }

    /**
     * Main game logic
     */
    public void playGame() {
        numRounds++;
        Winner winner;
        String result;
        if (playerGuess == diceValue) {
            winner = Winner.Player;
            result = "You Won!";
            numPlayerWins++;
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
        System.out.print("Would you like to continueGame again? ");
        continueGame = "y".contains(in.next().substring(0, 1).toLowerCase());
    }

    public String getHistory() {
        String result = "\n";
        double playerWinPercent = (double) numPlayerWins / numRounds * 100;
        result += String.format("Round   Player Guess   Computer Roll     Winner\n");
        result += history;
        result += String.format("\nPlayer won %d games (%.1f%%)", numPlayerWins, playerWinPercent);
        return result;
    }

    /**
     * Create an entry in the game history
     *
     * @param winner      Winner of the game round
     * @param playerGuess Players guess for this round
     */
    public void setHistory(Winner winner, int playerGuess, int dicesValue) {
        history += String.format("%5s%15s%16s%11s\n", numRounds, playerGuess, dicesValue, winner.toString());
    }

    public boolean continueGame() {
        return continueGame;
    }


}
