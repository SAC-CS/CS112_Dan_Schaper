package Quiz3;

/**
 * @author Dan Schaper
 *         Date: 11/12/13
 *         Time: 8:56 PM
 */
public class DoubleDice extends Dice {

    public DoubleDice() {
        super(2);
    }

    @Override
    public String toString() {
        return "DoubleDice " + super.toString();
    }

}
