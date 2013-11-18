import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Dan
 * Date: 11/12/13
 * Time: 1:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class GameBoard {
    Scanner in = new Scanner(System.in);
    private Token[][] board;
    private Token playerToken;
    private Token compToken;
    private Token winner;
    public boolean play;
    private int boardLength = 3;

    private enum Columns {A, B, C}

    private enum Token {EMPTY, X, O}

    private ArrayList<String> allMoves;


    public GameBoard() {
        play = true;
        winner = null;
        allMoves = new ArrayList<String>();
        board = new Token[boardLength][boardLength];
        for (Token row[] : board) {
            Arrays.fill(row, Token.EMPTY);
        }
        for (Columns col : Columns.values()) {
            for (int i = 1; i <= boardLength; i++) {
                allMoves.add(String.format("%s%s", col.toString(), i));
            }
        }
        System.out.print(this.toString());
    }

    @Override
    public String toString() {
        String result = " A B C\n";
        int counter = 1;
        for (Token[] row : board) {
            String rowString = String.format("%d", counter++);
            for (Token col : row) {
                if (col == Token.EMPTY) {
                    rowString += " |";
                } else {
                    rowString += col.toString() + "|";
                }
            }
            result += rowString.substring(0, rowString.length() - 1) + "\n";
            result += " -----\n";

        }
        result = result.substring(0, result.length() - 7) + "\n";
        if (winner != null) {
            if (winner != Token.EMPTY) {
                result += String.format("Player %s Wins!", winner.toString());
            } else {
                result += "It's a Tie!";
            }
        }
        return result;
    }

    public void pickLetter() {
        System.out.print("Pick X or O: ");
        String letter = in.nextLine();
        playerToken = Token.valueOf(letter);
        if (playerToken == Token.O) {
            compToken = Token.X;
        } else {
            compToken = Token.O;
        }
    }

    public void getMove() {
        System.out.print("Enter your coordinate move: ");
        String move = in.nextLine();
        int col = Columns.valueOf(move.substring(0, 1).toUpperCase()).ordinal();
        int row = Integer.parseInt(move.substring(1)) - 1;
        while (board[row][col] != Token.EMPTY) {
            System.out.println("Already a token there");
            System.out.print("Enter your coordinate move: ");
            move = in.nextLine();
            col = Columns.valueOf(move.substring(0, 1).toUpperCase()).ordinal();
            row = Integer.parseInt(move.substring(1)) - 1;
        }
        allMoves.remove(move);
        board[row][col] = playerToken;
        checkWinner(row, col, playerToken);
    }

    public void compMove() {
        Random rand = new Random();
        int i = rand.nextInt(allMoves.size());
        String compMove = allMoves.get(i);
        int col = Columns.valueOf(compMove.substring(0, 1).toUpperCase()).ordinal();
        int row = Integer.parseInt(compMove.substring(1)) - 1;
        System.out.printf("Computer picks %s\n", compMove);
        allMoves.remove(compMove);
        board[row][col] = compToken;
        checkWinner(row, col, compToken);
    }

    /*
     * Check to see if last move was a winning move
     */
    public void checkWinner(int row, int col, Token playerMove) {
        // We always need to check the row and column of last move
        for (int checkRow = 0; checkRow < boardLength; checkRow++) {
            if (board[row][checkRow] != playerMove) {
                break;
            }
            if (checkRow == boardLength - 1) {
                play = false;
                winner = playerMove;
            }
        }
        for (int checkCol = 0; checkCol < board.length; checkCol++) {
            if (board[checkCol][col] != playerMove || !play) { // If tokens don't match or we already have a winner
                break;
            }
            if (checkCol == boardLength - 1) {
                play = false;
                winner = playerMove;
            }
        }
        // If move is on a diagonal, check them (If Column - Row % 2 == 0)
        if (Math.abs(row - col) % 2 == 0 && play) {   // Only check diags if move is on diag and we don't have a winner
            // Check forward diag
            for (int foreDiag = 0; foreDiag < boardLength; foreDiag++) {
                if (board[foreDiag][foreDiag] != playerMove) {
                    break;
                }
                if (foreDiag == boardLength - 1) {
                    play = false;
                    winner = playerMove;
                }
            }
            // Check back diag
            for (int backDiag = 0; backDiag < boardLength; backDiag++) {
                if (board[backDiag][(boardLength - 1) - backDiag] != playerMove) {
                    break;
                }
                if (backDiag == boardLength - 1) {
                    play = false;
                    winner = playerMove;
                }
            }

        }
        if (allMoves.size() == 0) { // If the board is full
            play = false;
            winner = Token.EMPTY;
        }
        System.out.println(this.toString());
    }
}
