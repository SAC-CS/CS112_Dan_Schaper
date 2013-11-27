/**
 */
public class SingleDice extends Dice implements Runnable {
    String threadName;

    public SingleDice(String tName) {
        super(1);
        threadName = tName;
    }

    @Override
    public String toString() {
        return "SingleDice " + super.toString();
    }

    @Override
    public void run() {
        System.out.printf("Thread %s threw %d\n", threadName, super.Throw());
    }
}
