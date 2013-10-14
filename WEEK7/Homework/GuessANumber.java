import java.util.Random;
import java.util.Scanner;

/**
 * @author Dan Schaper
 *         CS112 Week 7 Homework -  Guess A Number Game
 */
public class GuessANumber {
    public boolean keepPlaying;
    private String[][] triesHistory;
    private Random rand;
    private int userGuess;
    private int targetNumber;
    private int roundNumber;
    Scanner in = new Scanner(System.in);


    public GuessANumber() {
        keepPlaying = true;
        rand = new Random();
        triesHistory = new String[100][3];
        roundNumber = 0;
        System.out.println("Welcome to the Guess A Number game!");
    }

    public void setUserGuess() {
        int userEntry = 0;
        while (userEntry > 10 || userEntry < 1) {
            System.out.print("Please enter a number between 1 and 10: ");
            userEntry = in.nextInt();
        }
        userGuess = userEntry;
    }

    public void setTargetNumber() {
        targetNumber = rand.nextInt(10) + 1;
    }

    public void playGame() {
        String winner;
        if (userGuess == targetNumber) {
            winner = "User";
            System.out.println("Congratulations, you won this round!");
        } else if (userGuess < targetNumber) {
            winner = "Computer";
            System.out.println("Sorry, your guess was too low.");
        } else {
            winner = "Computer";
            System.out.println("Sorry, your guess was too high.");
        }
        triesHistory[roundNumber][0] = Integer.toString(userGuess);
        triesHistory[roundNumber][1] = Integer.toString(targetNumber);
        triesHistory[roundNumber][2] = winner;
        roundNumber++;
    }

    public void playAgain() {
        String response = "t";
        while (!"yn".contains(response.toLowerCase())) {
            System.out.print("Would you like to play again? Y or N: ");
            response = in.next();
        }
        if (response.toLowerCase().equals("n")) {
            keepPlaying = false;
        }
    }

    public void printHistory() {
        System.out.println("   *** Game rounds history ***");
        System.out.println("User Guess, Target Number, Winner");
        System.out.println("----------------------------------");
        for (int i = 0; i < roundNumber; i++) {
            System.out.printf("%-10s %-13s %s\n", triesHistory[i][0], triesHistory[i][1], triesHistory[i][2]);
        }
    }
}

