/**
 * @author Dan Schaper
 *         CS112 Week 7 Lab 2 Rock-Paper-Scissors
 */
public class RPSGamePlayerLab2 {

    public static void main(String[] args) {
        RPSGameLab2 game = new RPSGameLab2();
        while (game.gameResult()) {
            game.setCompChoice();
            game.setUserChoice();
            game.roundResult();
        }
        game.gameHistory();
    }
}

