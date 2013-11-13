/**
 * @author Dan Schaper
 *         Date: 11/12/13
 *         Time: 7:49 PM
 */
public abstract class Dice {
    private int m_value;

    public Dice() {
        m_value = 0;
    }

    public abstract int Throw();
}
