import java.util.Random;
import java.util.Scanner;

/**
 * @author Dan Schaper
 *         CS112 Week 7 Lab 2 Rock-Paper-Scissors
 */
public class RPSGameLab2 {
    private int compItem; // Computer Item selection
    private int userItem; // User Item selection
    private int[] winLossTies; // Number of wins, loss, ties
    private int roundsToWin; // Number of rounds needed to declare winner
    private int roundsPlayed; // Counter for number of rounds played
    private String[] userMoves; // Array of user moves
    private String[] compMoves; // Array of computer moves
    private Scanner in = new Scanner(System.in); // Scanner for input
    private Random rand = new Random(); // Random generator

    /**
     * Constructor for Rock, Paper, Scissors
     */
    public RPSGameLab2() {
        int maxRounds = setNumRounds(); // Set number of rounds user chooses to play
        winLossTies = new int[3]; // Init win, loss, ties values to 0
        roundsPlayed = 0;
        roundsToWin = maxRounds / 2 + 1; // number of rounds needed to win game
        userMoves = new String[100]; // create a 100 move array
        compMoves = new String[100]; // create a 100 move array

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
        userMoves[roundsPlayed] = intToItem(userItem); // Update array with user choice
    }

    public void setCompChoice() {
        compItem = rand.nextInt(3) + 1; // Select computers choice
        compMoves[roundsPlayed] = intToItem(compItem); // Update array with computer choice
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
            default:
                return "Error: Choice not available.";
        }
    }

    /**
     * Convert user choice to int for game logic
     *
     * @param userChoice String user choice
     * @return integer value of user game choice
     */
    private int itemToInt(String userChoice) {
        String userChoiceUpper = userChoice.toUpperCase();
        switch (userChoiceUpper) {
            case "R":
                return 1;
            case "S":
                return 2;
            case "P":
                return 3;
            default:
                return 0;
        }
    }

    /**
     * Main game logic method for each round
     */
    public void roundResult() {
        roundsPlayed++;
        System.out.printf("Round %d: Computer chose %s, you chose %s,\n", roundsPlayed, intToItem(compItem), intToItem(userItem));
        if (userItem - (compItem % 3) == 1) {
            System.out.println("Sorry, you lost.");
            winLossTies[1] += 1;
        } else if (userItem == compItem) {
            System.out.println("It's a tie.");
            winLossTies[2] += 1;
        } else {
            System.out.println("Congrats, you won!");
            winLossTies[0] += 1;
        }
    }

    public boolean gameResult() {
        if (winLossTies[0] == roundsToWin) {
            System.out.println("Congratulations, you won!");
            System.out.printf("Rounds won: %d. Rounds lost %d. Rounds tied %d.\n\n", winLossTies[0], winLossTies[1],
                    winLossTies[2]);
            return false; //Game Over
        } else if (winLossTies[1] == roundsToWin) {
            System.out.println("Sorry, the computer won...");
            System.out.printf("Rounds won: %d. Rounds lost %d. Rounds tied %d.\n\n", winLossTies[0], winLossTies[1],
                    winLossTies[2]);
            return false; //Game Over
        } else {
            return true; // Keep playing
        }
    }

    public void gameHistory() {
        for (int i = 0; i < roundsPlayed; i++) {
            System.out.printf("Round %d: Computer played: %-8s User Played: %-8s\n", i + 1, compMoves[i], userMoves[i]);
        }

    }
}
