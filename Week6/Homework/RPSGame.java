import java.util.Random;
import java.util.Scanner;

/**
 * @author Dan Schaper
 *         CS112 Week 6 Homework Rock-Paper-Scissors Lab6
 */
public class RPSGame {
    private int compItem; // Computer Item selection
    private int userItem; // User Item selection
    private int wins; // Number of wins
    private int loss; // Number of losses
    private int ties; // Number of ties
    private int roundsToWin; // Number of rounds needed to declare winner
    private int roundsPlayed; // Counter for number of rounds played
    private Scanner in = new Scanner(System.in); // Scanner for input
    private Random rand = new Random(); // Random generator

    /**
     * Constructor for Rock, Paper, Scissors
     */
    public RPSGame() {
        int maxRounds = setNumRounds(); // Set number of rounds user chooses to play
        wins = 0;
        loss = 0;
        ties = 0;
        roundsPlayed = 0;
        roundsToWin = maxRounds / 2 + 1; // number of rounds needed to win game
    }

    public int setNumRounds() {
        System.out.print("Welcome to Rock, Paper, Scissors\nHow many rounds would you like to play? ");
        return in.nextInt();
    }

    /**
     * Prompt user for item choice
     */
    public void setUserChoice() {
        System.out.print("Please choose your weapon, \n'R'ock, 'P'aper, or 'S'cissors:"); // Prompt for user choice
        userItem = itemToInt(in.next()); // Convert user choice to int for game logic
        while (userItem == 0) {  // Check for valid input
            System.out.print("Please type R, P, or S:");
            userItem = itemToInt(in.next());
        }
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
     * Convert user choice to int for game logic
     *
     * @param userChoice String user choice
     * @return integer value of user game choice
     */
    private int itemToInt(String userChoice) {
        String userChoiceUpper = userChoice.toUpperCase();
        if (userChoiceUpper.equals("R")) {
            return 1;
        }
        if (userChoiceUpper.equals("S")) {
            return 2;
        }
        if (userChoiceUpper.equals("P")) {
            return 3;
        }
        return 0;
    }

    /**
     * Main game logic method for each round
     */
    public void roundResult() {
        roundsPlayed++;
        System.out.printf("Round %d: Computer chose %s, you chose %s,\n", roundsPlayed, intToItem(compItem), intToItem(userItem));
        if (userItem - (compItem % 3) == 1) {
            System.out.println("Sorry, you lost.");
            loss++;
        } else if (userItem == compItem) {
            System.out.println("It's a tie.");
            ties++;
        } else {
            System.out.println("Congrats, you won!");
            wins++;
        }
        System.out.printf("Rounds won: %d. Rounds lost %d. Rounds tied %d.\n\n", wins, loss, ties);
    }

    public boolean gameResult() {
        if (wins == roundsToWin) {
            System.out.println("Congratulations, you won!");
            return false; //Game Over
        } else if (loss == roundsToWin) {
            System.out.println("Sorry, the computer won...");
            return false; //Game Over
        } else {
            return true; // Keep playing
        }

    }
}
