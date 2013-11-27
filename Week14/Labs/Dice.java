import java.util.Random;

/**
 * @author Dan Schaper
 *         Date: 11/12/13
 *         Time: 8:40 PM
 */
public abstract class Dice {
    private int dices;
    private String hist;
    public static final Random rand = new Random();

    public Dice(int d) {
        dices = d;
        hist = "";
    }

    public Dice() {
        this(1);
    }

    public int Throw() {
        int value = rand.nextInt((6 * dices - dices) + 1) + dices;   // ((max - min) + 1) + min;
        if (hist.isEmpty()) {
            hist += value + "";
        } else {
            hist += ", " + value;
        }
        return value;
    }

    @Override
    public String toString() {
        return "Roll History: " + hist;
    }


}
