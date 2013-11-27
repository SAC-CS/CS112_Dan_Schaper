package Quiz3;

/**
 * @author Dan Schaper
 *         Week 12 Quiz Dice Game
 */
public class DiceGamePlayer {

    public static void main(String[] args) {
        DiceGame game = new DiceGame();
        game.createDices();
        do {
            game.throwDices();
            game.setPlayerGuess();
            game.playGame();
            game.playAgain();
        } while (game.continueGame());
        System.out.print(game.getHistory());
    }
}
