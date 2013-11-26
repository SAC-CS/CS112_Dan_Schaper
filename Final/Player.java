import java.util.InputMismatchException;

/**
 * @author Dan Schaper
 *         CS 112 Tic Tac Toe Final Project
 */
public class Player {
    private String token;

    public Player(int number) {
        token = (number == 0 ? "X" : "O");
    }

    public String getToken() {
        return token;
    }

    public int getMove() throws InputMismatchException {
        int cell;
        System.out.print("Enter the cell number (1 - 9) for your move: ");
        cell = TicTacToeGame.in.nextInt();
        if (cell < 1 || cell > 9) {
            throw new InputMismatchException();
        }
        return cell;
    }
}
