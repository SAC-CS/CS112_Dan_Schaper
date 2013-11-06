/**
 * @author Dan Schaper
 *         Date: 11/5/13
 *         Time: 8:23 PM
 */
public class TrippleDice extends Dice {

    public TrippleDice() {
        super();
    }

    @Override
    public int Throw() {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += super.Throw();
        }
        return sum / 3;
    }

}
