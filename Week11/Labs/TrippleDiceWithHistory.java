/**
 * @author Dan Schaper
 *         Date: 11/5/13
 *         Time: 9:12 PM
 */
public class TrippleDiceWithHistory extends TrippleDice {
    private int m_throws; // Track number of throws
    private int m_val; // Store throw values
    private int[] hist; // Array for history of values

    public TrippleDiceWithHistory() {
        m_throws = 0;
        m_val = 0;
        hist = new int[100];
    }

    @Override
    public int Throw() {
        m_val = super.Throw();
        m_throws++;
        hist[m_throws] = m_val;
        return m_val;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 1; i <= m_throws; i++) {
            result += String.format("Throw %d was %d\n", i, hist[i]);
        }
        return result;
    }

}
