import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


/**
 * @author Dan Schaper
 *         CS 112 Tic Tac Toe Final Project
 */

public class TicTacToeGame {
    protected static Scanner in = new Scanner(System.in);
    protected String emptyCells;
    private TicTacToeBoard tGameBoard;
    private int lastCell;
    private Player[] players;
    private int currentPlayer;
    private String winner;
    private final static int MARK_X = 0;
    private final static int MARK_O = 1;
    private final static int PLAYER_0 = 0;
    private final static int PLAYER_1 = 1;

    public TicTacToeGame() {
        tGameBoard = new TicTacToeBoard();
        players = new Player[2];
        emptyCells = tGameBoard.getEmptyCells();
        System.out.printf("Welcome to the Tic-Tac-Toe Game!\nThe first player to mark 3 consecutive spots wins.\n\n");
        boolean continueLoop = true;
        do {
            try {
                int playerPick = pickLetter();
                //players[PLAYER_0] = new Player(playerPick); // Set human player
                players[PLAYER_0] = new ComputerPlayer(playerPick); // Set computer to play itself
                players[PLAYER_1] = new ComputerPlayer(playerPick == MARK_X ? MARK_O : MARK_X);
                continueLoop = false;
            } catch (InputMismatchException e) {
                System.out.println("Please enter X or O");
            }
        } while (continueLoop);
        currentPlayer = PLAYER_0;
        System.out.println(tGameBoard);
        boolean continueGame = true;
        while (continueGame) {
            continueGame = playGame();
            currentPlayer = currentPlayer == PLAYER_0 ? PLAYER_1 : PLAYER_0;
        }
        System.out.printf("Game Over -- %s", winner);
    }

    private int pickLetter() throws InputMismatchException {
        System.out.print("Please pick your token: X or O: ");
        String letter = in.nextLine();
        if (!"XO".contains(letter.toUpperCase())) {
            throw new InputMismatchException("Please choose either X or O.");
        }
        return (letter.toUpperCase().equals("X") ? MARK_X : MARK_O);
    }

    private boolean playGame() {
        boolean playGame = true;
        int cell;
        try {
            String playersMark = players[currentPlayer].getToken();
            cell = players[currentPlayer].getMove() - 1;
            tGameBoard.setCell(cell, playersMark);
            lastCell = cell;
            emptyCells = tGameBoard.getEmptyCells();
            System.out.printf("\nPlayer %s took cell %d\n%s", playersMark, cell + 1, tGameBoard);
            playGame = !isGameOver();
        } catch (IllegalArgumentException e) {
            System.out.println("That cell has already been played.");
        } catch (InputMismatchException e) {
            in.nextLine();
            System.out.println("Please enter your move as a number 1 - 9");
        }
        return playGame;
    }

    private boolean isGameOver() {
        String pTokenWinString;
        if (emptyCells.length() > 6) { // 3 moves have not yet been played
            return false;
        }
        pTokenWinString = players[currentPlayer].getToken() + "{3}"; // regex string of 3 consecutive player tokens - a win string
        for (String line : getCheckLines(lastCell)) {
            if (line.matches(pTokenWinString)) {
                winner = String.format("Player %s Won!", players[currentPlayer].getToken());
                return true;
            }
        }
        winner = "It's a draw...";
        return tGameBoard.getEmptyCells().length() == 0; // Board is full
    }

    private ArrayList<String> getCheckLines(int cell) {
        ArrayList<String> lines = new ArrayList<>();
        lines.add(tGameBoard.getRow(cell));
        lines.add(tGameBoard.getCol(cell));
        String fDiag = tGameBoard.getFDiag(cell);
        String bDiag = tGameBoard.getBDiag(cell);
        if (!fDiag.isEmpty()) {
            lines.add(fDiag);
        }
        if (!bDiag.isEmpty()) {
            lines.add(bDiag);
        }
        return lines;
    }

    private class ComputerPlayer extends Player {
        Random rand = new Random();

        public ComputerPlayer(int number) {
            super(number);
        }

        @Override
        public int getMove() {
            int cell = rand.nextInt(emptyCells.length());
            return Integer.parseInt(emptyCells.substring(cell, cell + 1)) + 1;
        }
    }
}
