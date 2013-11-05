import java.util.Random;

/**
 * @author Dan Schaper
 *         Week 10 Homework Dice Game
 */
public class Dice {

    private int m_value; // Average value of dice(s) and bounces
    private int m_bounces; // Number of bounces per roll
    private int m_dices; // Number of dice to use
    private int m_throws; // Counter of number of times dice(s) have been thrown
    private Random rand = new Random(); // Random number generator

    public Dice() { // Default constructor
        m_bounces = 1;
        m_dices = 1;
        m_throws = 0;
    }

    public Dice(int bounces) {  // Constructor for single dice
        m_bounces = bounces;
        m_dices = 1;
        m_throws = 0;
    }

    public Dice(int dices, int bounces) { // Constructor for multiple dices
        m_bounces = bounces;
        m_dices = dices;
        m_throws = 0;
    }

    public int Throw() {
        m_throws++; // Increment number of throws
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

    public int getValue() {
        return m_value;
    }

    public int getThrows() {
        return m_throws;
    }

}
