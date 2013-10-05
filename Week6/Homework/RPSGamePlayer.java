/**
 * @author Dan Schaper
 *         CS112 Week 6 Homework Rock-Paper-Scissors Lab6
 */
public class RPSGamePlayer {

    public static void main(String[] args) {
        RPSGame game = new RPSGame();
        while (game.gameResult()) {
            game.setCompChoice();
            game.setUserChoice();
            game.roundResult();
        }
    }
}

