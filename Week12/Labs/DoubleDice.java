/**
 * @author Dan Schaper
 *         Date: 11/12/13
 *         Time: 7:57 PM
 */
public class DoubleDice extends Dice {

    public DoubleDice() {
        super();
    }

    @Override
    public int Throw() {
        return 2;
    }

    @Override
    public String toString() {
        return String.format("Double Dice");
    }


}
