package Quiz3;

/**
 * Created with IntelliJ IDEA.
 * User: Dan
 * Date: 11/26/13
 * Time: 2:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class SingleDice extends Dice {

    public SingleDice() {
        super(1);
    }

    @Override
    public String toString() {
        return "SingleDice " + super.toString();
    }
}
