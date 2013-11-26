package Quiz3;

/**
 * @author Dan Schaper
 *         Date: 11/12/13
 *         Time: 9:06 PM
 */
public class TrippleDice extends Dice {

    public TrippleDice() {
        super(3);
    }

    @Override
    public String toString() {
        return "TrippleDice " + super.toString();
    }

}
