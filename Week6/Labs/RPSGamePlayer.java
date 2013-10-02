import java.util.Scanner;

/**
 * @author Dan Schaper
 *         CS112 Week 5 Homework Rock-Paper-Scissors Game
 */
public class RPSGamePlayer {

    public static void main(String[] args) {
        RPSGame game = new RPSGame();
        game.setUserChoice();
        game.battleResult();
        game.gameStatistics();
    }
}
}
