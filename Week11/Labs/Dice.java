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
    private int m_dices;
    Random rand = new Random();

    public Dice(int dices) {
        m_dices = dices;
        m_bounces = 1;
    }

    public Dice() {
        m_bounces = 1;
    }

    public int Throw() {
        int dicesSum = 0;
        for (int dices = 0; dices < m_dices; dices++) {  // Loop through number of dices
            int bounceSum = 0;
            for (int bounces = 0; bounces < m_bounces; bounces++) {  // Loop through number of bounces
                bounceSum += rand.nextInt(6) + 1;
            }
            dicesSum += bounceSum / m_bounces;  // Add bounce average to dicesSum
        }
        m_value = dicesSum / m_dices;  // Set m_value to average of dices rolls
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
