package DiceGame;

import java.util.Random;


/**
 * @author Dan Schaper
 *         Week 11 Homework
 *         TripleDiceWithHistory clone / equals method overrides
 */
public class Dice implements Cloneable {
    private int m_throws;
    private int m_value;
    private int m_bounces;
    private int m_dices;
    private static final Random rand = new Random();

    public Dice(int dices, int bounces) { // full constructor
        setDices(dices);
        setBounces(bounces);
    }

    public Dice(int dices) {  // dices only constructor
        this(dices, 1);
    }

    public Dice() { // default constructor
        this(1, 1);
    }

    public void setDices(int d) {
        if (d > 0) {
            m_dices = d;
        } else {
            throw new IllegalArgumentException("You must use at least one dice.");
        }
    }

    public int getBounces() {
        return m_bounces;
    }

    public void setBounces(int b) {
        if (b > 0) {
            m_bounces = b;
        } else {
            throw new IllegalArgumentException("You must bounce at least once");
        }
    }

    public int Throw() {
        int dicesSum = 0;
        m_throws++;
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

    @Override
    public String toString() {
        return String.format("%d Dices, %d Bounces, Current Value is %d", m_dices, m_bounces, m_value);
    }

    @Override
    public Dice clone() throws CloneNotSupportedException {
        return (Dice) super.clone();
    }
}
