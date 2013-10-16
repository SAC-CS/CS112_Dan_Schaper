/**
 * @author Dan Schaper
 *         Date: 10/15/13
 *         Time: 7:49 PM
 *         Midterm Question One - Odd or Even Guessing game
 */
public class OddEvenGamePlayer {
    public static void main(String[] args) {
        OddEvenGame game = new OddEvenGame();
        while (game.keepPlaying) {
            game.setTargetNumber();
            game.setUserGuess();
            game.playGame();
            game.playAgain();
        }
        game.printHistory();
    }
}
