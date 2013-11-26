import java.util.Arrays;

/**
 * @author Dan Schaper
 *         CS 112 Tic Tac Toe Final Project
 */
public class TicTacToeBoard {
    private String[] board;  // Array for board

    public TicTacToeBoard(int size) {
        board = new String[size];
        Arrays.fill(board, " ");
    }

    public TicTacToeBoard() {
        this(9);
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < board.length - 1; i++) {
            result += board[i];
            if (i % 3 < 2) {
                result += "|";
            } else {
                result += "\n-----\n";
            }
        }
        return result + board[board.length - 1] + "\n";
    }

    public void setCell(int cell, String token) throws IllegalArgumentException {
        if (isEmptyCell(cell)) {
            board[cell] = token;
        } else {
            throw new IllegalArgumentException("Selected cell has already been played.");
        }
    }

    private boolean isEmptyCell(int cell) {
        return board[cell].equals(" ");
    }

    public String getCell(int cell) {
        return board[cell];
    }

    public String getEmptyCells() {
        String result = "";
        for (int i = 0; i < board.length; i++) {
            if (this.isEmptyCell(i)) {
                result += i;
            }
        }
        return result;
    }

    /**
     * Returns a String containing the values of cell marks for the called cell
     *
     * @param cell Value of 0 - 8 for cell on game board
     * @return Values for marks on the row containing cell
     */
    public String getRow(int cell) {
        int rows = cell / 3; // cell / 3 results in 0, 1 or 2 for rows index
        String rowString = ""; // String to store row of cell marks
        for (int i = rows; i < rows + 3; i++) {
            rowString += this.getCell(i); // add mark in cell at row + column
        }
        return rowString;
    }

    /**
     * Returns a String containing the values of cell marks for the called cell
     *
     * @param cell Value of 0 - 8 for cell on game board
     * @return Values for marks on the column containing cell
     */
    public String getCol(int cell) {
        int column = cell % 3;
        String colString = ""; // String to store row of cell argument
        for (int i = column; i < 9; i += 3) {
            colString += this.getCell(i);
        }
        return colString;
    }

    /**
     * Returns a String containing the values of cell marks for the forward diagonal of the called cell
     *
     * @param cell Value of 0 - 8 for cell on game board
     * @return Values for marks on the row containing cell, or empty string if cell does not lie on forward diagonal
     */
    public String getFDiag(int cell) {
        String fDiagString = "";
        if (cell % 4 == 0) {  // if cell == 0, 4 or 8
            for (int i = 0; i < board.length; i += 4) {
                fDiagString += this.getCell(i);
            }
        }
        return fDiagString;
    }

    public String getBDiag(int cell) {
        String bDiagString = "";
        if (cell % 3 + cell / 3 == 2) {  // if cell == 2, 4 or 6
            for (int i = 2; i < board.length - 1; i += 2) {
                bDiagString += this.getCell(i);
            }
        }
        return bDiagString;
    }
}
