/**
 * @author Dan Schaper
 *         Date: 11/12/13
 *         Time: 8:00 PM
 */
public class TrippleDice extends Dice {
    private int m_value;

    public TrippleDice() {
        super();
    }

    @Override
    public int Throw() {
        return 3;
    }

    @Override
    public String toString() {
        return String.format("Tripple Dice ");
    }

}
