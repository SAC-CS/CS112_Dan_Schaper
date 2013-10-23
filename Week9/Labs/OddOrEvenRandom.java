import java.util.Random;

/**
 * @author Dan Schaper
 *         Date: 10/22/13
 *         Time: 9:06 PM
 */
public class OddOrEvenRandom {
    private int m_val;
    Random rand;

    public OddOrEvenRandom(int value) {
        m_val = value;
    }

    public OddOrEvenRandom() {
        rand = new Random();
        m_val = rand.nextInt(100);
    }

    public void odd() {
        System.out.println("Odd");
    }

    public void even() {
        System.out.println("Even");
    }

    public void setM_val(int value) {
        m_val = value;
    }

    public void OddEven() {
        if (m_val % 2 == 0) {
            even();
        } else {
            odd();
        }
    }
}
