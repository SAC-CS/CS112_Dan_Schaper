import java.util.ArrayList;
import java.util.Random;

/**
 * @author Dan Schaper
 *         Date: 11/19/13
 *         Time: 7:55 PM
 *         Week 13 Lab 1
 */
public class Dice implements History {
    Random rand;
    ArrayList<String> hist;

    public Dice() {
        rand = new Random();
        hist = new ArrayList<String>();
    }

    public int getRandom() {
        if (hist.size() > 2) {
            throw new UnsupportedOperationException("Dice thrown 3 times already.");
        }
        int m_val = rand.nextInt(6) + 1;
        hist.add(m_val + "");
        return m_val;
    }

    public String printHistory() {
        String result = "";
        for (String entry : hist) {
            result += entry + " ";
        }
        return result;
    }

}
