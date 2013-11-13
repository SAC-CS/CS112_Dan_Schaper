package Quiz3;

import java.util.ArrayList;

/**
 * @author Dan Schaper
 *         Date: 11/12/13
 *         Time: 8:56 PM
 */
public class DoubleDice extends Dice {
    private ArrayList<Integer> hist;

    public DoubleDice() {
        super(2);
        hist = new ArrayList<>();
    }

    @Override
    public int Throw() {
        int value = super.Throw();
        this.hist.add(value);
        return value;
    }

    @Override
    public String toString() {
        String result = "";
        for (int roll : hist) {
            result += roll + ", ";
        }
        return result;
    }
}
