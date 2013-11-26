package Quiz3;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Dan Schaper
 *         Date: 11/12/13
 *         Time: 8:40 PM
 */
public abstract class Dice {
    private int dices;
    private ArrayList<Integer> hist;
    public static final Random rand = new Random();

    public Dice(int d) {
        dices = d;
        hist = new ArrayList<>();

    }

    public Dice() {
        this(1);
    }

    public int Throw() {
        int value = rand.nextInt((6 * dices - dices) + 1) + dices;   // ((max - min) + 1) + min;
        hist.add(value);
        return value;
    }

    @Override
    public String toString() {
        String result = "Roll History: ";
        for (int i = 0; i < hist.size() - 1; i++) {
            result += hist.get(i) + ", ";
        }
        result += hist.get(hist.size() - 1) + "";
        return result;
    }


}
