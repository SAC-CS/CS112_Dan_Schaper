import java.util.Scanner;
import java.util.Random;

/**
 * @author Dan Schaper
 *         CS112 Week 5 Homework Rock-Paper-Scissors Game
 */
public class RPSGame {
    private int compItem; // Computer Item selection
    private int userItem;
    private Scanner in = new Scanner(System.in); // Scanner for input

    /**
     * Constructor for Rock, Paper, Scissors
     */
    public RPSGame() {
        Random rand = new Random(); // Random generator
        compItem = rand.nextInt(3) + 1; // Select computers choice
    }

    /**
     * Prompt user for item choice
     */
    public void setUserChoice(){
        System.out.print("Please choose your weapon, \n'R'ock, 'P'aper, or 'S'cissors:"); // Prompt for user choice
        userItem = itemToInt(in.next()); // Convert user choice to int for game logic
        while (userItem == 0) {  // Check for valid input
            System.out.print("Please type R, P, or S:");
            userItem = itemToInt(in.next());
        }
    }

    /**
     * Convert integer to game item
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
     * Main game logic method
     */
    public void battleResult() {
        System.out.printf("Computer chose %s, you chose %s,\n", intToItem(compItem), intToItem(userItem));
        if (userItem - (compItem % 3) == 1) {
            System.out.println("Sorry, you lost.");
        }
        else if (userItem == compItem) {
            System.out.println("It's a tie.");
        }
        else {
            System.out.println("Congrats, you won!");
        }
    }
}
