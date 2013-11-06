import java.util.Random;

/**
 * @author Dan Schaper
 *         Date: 11/5/13
 *         Time: 7:19 PM
 */
public class Dice {
    private static int s_throws;
    private int m_value;
    private int m_bounces;
    Random rand = new Random();

    public Dice(int bounces) {
        m_bounces = bounces;
    }

    public Dice() {
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

    public int Throw(int dices, int bounces) {
        int sum = 0;
        for (int i = 0; i < dices; i++) {
            Dice die = new Dice(bounces);
            sum += die.Throw();
        }
        m_value = sum / dices;
        return m_value;
    }

    public static int OneThrow() {
        Random rFace = new Random();
        s_throws++;
        return rFace.nextInt(6) + 1;
    }

    public int Value() {
        return m_value;
    }

    public int getS_throws() {
        return s_throws;
    }
}
