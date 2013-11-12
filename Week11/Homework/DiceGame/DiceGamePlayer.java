package DiceGame;

/**
 * @author Dan Schaper
 *         Week 11 Homework Dice Game
 */
public class DiceGamePlayer {

    public static void main(String[] args) {
        DiceGame game = new DiceGame();
        game.setNumOfBounces();
        game.createDices();
        while (game.play) {
            game.throwDices();
            game.setPlayerGuess();
            game.playGame();
            game.playAgain();
        }
        game.printHistory();

    }
}
