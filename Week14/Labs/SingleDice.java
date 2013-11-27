/**
 */
public class SingleDice extends Dice implements Runnable {
    String threadName;
    private static final int[] valuesArray = new int[9];
    private static int writeIndex = 0;

    public SingleDice(String tName) {
        super(1);
        threadName = tName;
    }

    public synchronized void add(int value) {
        int pos = writeIndex;
        valuesArray[pos] = value;
        System.out.printf("%s wrote %d to index %d\n", threadName, value, writeIndex);
        writeIndex++;
    }

    @Override
    public String toString() {
        return "SingleDice " + super.toString();
    }

    @Override
    public void run() {
        System.out.println(threadName + "loop begin");
        for (int i = 0; i < 3; i++) {
            this.add(super.Throw());
        }
        System.out.println(threadName + "loop end");
    }
}
