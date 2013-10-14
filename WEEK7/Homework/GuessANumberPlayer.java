/**
 * @author Dan Schaper
 *         CS112 Week 7 Homework -  Guess A Number Game
 */
public class GuessANumberPlayer {
    public static void main(String[] args) {
        GuessANumber game = new GuessANumber();
        while (game.keepPlaying) {
            game.setTargetNumber();
            game.setUserGuess();
            game.playGame();
            game.playAgain();
        }
        game.printHistory();
    }
}
