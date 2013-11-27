/**
 */
public class SingleDice extends Dice implements Runnable {

    public SingleDice() {
        super(1);
    }

    @Override
    public String toString() {
        return "SingleDice " + super.toString();
    }

    @Override
    public void run() {
        System.out.println(super.Throw());
    }
}
