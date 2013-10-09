/**
 * @author Dan Schaper
 *         CS112 Week 6 Homework Rock-Paper-Scissors Lab6
 */
public class RPSGamePlayerLab1 {

    public static void main(String[] args) {
        RPSGameLab1 game = new RPSGameLab1();
        while (game.gameResult()) {
            game.setCompChoice();
            game.setUserChoice();
            game.roundResult();
        }
    }
}

