/**
 * @author Dan Schaper
 *         CS112 Week 7 Lab 1 Rock-Paper-Scissors
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
