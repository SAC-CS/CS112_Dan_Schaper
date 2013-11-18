/**
 * Created with IntelliJ IDEA.
 * User: Dan
 * Date: 11/18/13
 * Time: 12:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class TicTacToePlayer {
    public static void main(String[] args) {
        GameBoard gBoard = new GameBoard();
        gBoard.pickLetter();
        while (gBoard.play) {
            gBoard.getMove();
            if (gBoard.play) {
                gBoard.compMove();
            }
        }
    }
}
