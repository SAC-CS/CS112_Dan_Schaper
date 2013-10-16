import java.util.Random;
import java.util.Scanner;

/**
 * @author Dan Schaper
 *         Date: 10/15/13
 *         Time: 7:49 PM
 *         Midterm Question One - Odd or Even Guessing game
 */
public class OddEvenGame {
    public boolean keepPlaying;
    private String[][] triesHistory;
    private Random rand = new Random();
    private String userGuess;
    private int targetNumber;
    private int roundNumber;
    private int compWins;
    private int userWins;
    Scanner in = new Scanner(System.in);


    public OddEvenGame() {
        keepPlaying = true;
        triesHistory = new String[100][3];
        roundNumber = 0;
        System.out.println("Welcome to the Odd or Even Guessing game!");
    }

    public void setUserGuess() {
        System.out.println("Now you must guess if the number is odd or even.");
        String userEntry = "t";
        while (!"oe".contains(userEntry.toLowerCase())) {
            System.out.print("Please enter 'O' for odd or 'E' for even: ");
            userEntry = in.next();
        }
        userGuess = userEntry.toLowerCase();
    }

    public void setTargetNumber() {
        System.out.println("The computer has guessed a number between 0 and 100.");
        targetNumber = rand.nextInt(101);
    }

    public void playGame() {
        String winner;
        String modResult;
        modResult = (targetNumber % 2 == 0) ? "e" : "o";
        if (modResult.equals(userGuess)) {
            winner = "User";
            System.out.println("Congratulations, you won this round!");
            userWins++;
        } else {
            winner = "Computer";
            System.out.println("Sorry, you lost this round.");
            compWins++;
        }
        triesHistory[roundNumber][0] = userGuess.toUpperCase();
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
        System.out.printf("Total games played: %d, User wins: %d, Computer wins: %d\n", roundNumber, userWins, compWins);
        System.out.println("Round, User Guess, Target Number,   Winner");
        System.out.println("-----------------------------------------------");
        for (int i = 0; i < roundNumber; i++) {
            System.out.printf("%2d %14s %13s %12s\n", i + 1, triesHistory[i][0], triesHistory[i][1], triesHistory[i][2]);
        }
    }
}
