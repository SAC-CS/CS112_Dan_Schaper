import java.util.Random;

/**
 * @author Dan Schaper
 *         Date: 10/29/13
 *         Time: 8:25 PM
 */
public class DiceLab2 {
    private int m_faceValue;
    Random rand;

    public DiceLab2() {
        rand = new Random();
    }

    public int Throw() {
        m_faceValue = rand.nextInt(6) + 1;
        return m_faceValue;
    }

    public int Throw(int bounces) {
        int sum = 0;
        for (int i = 0; i < bounces; i++) {
            sum += Throw();
        }
        return sum / bounces;
    }

    public int Value() {
        return m_faceValue;
    }
}
