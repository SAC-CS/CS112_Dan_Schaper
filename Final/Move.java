

/**
 * Created with IntelliJ IDEA.
 * User: Dan
 * Date: 11/18/13
 * Time: 8:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class Move {
    private int row;
    private String col;
    private GameBoard.Token token;

    public int getRow() {
        return row - 1;
    }

    public String getCol() {
        return col;
    }

    public void setRow(int row) {
        if (row < 1 || row > 3) {
            throw new IllegalArgumentException();
        }
        this.row = row;
    }

    public void setCol(String col) {
        if (!"ABC".contains(col.toUpperCase())) {
            throw new IllegalArgumentException();
        }
        this.col = col;
    }

    public void setToken(GameBoard.Token token) {
        this.token = token;
    }

    public GameBoard.Token getToken() {
        return token;
    }

    @Override
    public String toString() {
        return String.format("%s at [%s][%d]", token, col, row);
    }
}
