import java.util.Scanner;

/**
 * @author Dan Schaper
 *         CS112 Week 5 Homework Rock-Paper-Scissors Game
 */
public class RPSGamePlayer {

    public static void main(String[] args) {
        String playGame;
        Scanner in = new Scanner(System.in);
        do {
            RPSGame game = new RPSGame();
            game.setUserChoice();
            game.battleResult();
            System.out.print("Enter Y to play again, any other key to quit: ");
            playGame = in.next();
        } while (playGame.toUpperCase().equals("Y"));
    }
}
