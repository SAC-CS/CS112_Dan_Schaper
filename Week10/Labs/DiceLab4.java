import java.util.Random;

/**
 * @author Dan Schaper
 *         Date: 10/29/13
 *         Time: 8:25 PM
 */
public class DiceLab4 {
    private int m_value;
    private int m_bounces;
    Random rand = new Random();

    public DiceLab4(int bounces) {
        m_bounces = bounces;
    }

    public DiceLab4() {
        m_bounces = 1;
    }

    public int Throw() {
        int sum = 0;
        for (int i = 0; i < m_bounces; i++) {
            sum += rand.nextInt(6) + 1;
        }
        m_value = sum / m_bounces;
        return m_value;
    }

    public static int OneThrow() {
        Random rFace = new Random();
        return rFace.nextInt(6) + 1;
    }

    public int Value() {
        return m_value;
    }
}
