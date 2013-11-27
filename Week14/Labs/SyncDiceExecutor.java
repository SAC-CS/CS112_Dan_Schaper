import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Dan Schaper
 *         Date: 11/26/13
 *         Time: 8:40 PM
 */
public class SyncDiceExecutor {

    public static void main(String[] args) {
        System.out.println("Starting Thread Pool");
        ExecutorService executor = Executors.newCachedThreadPool();
        SingleDice SD1 = new SingleDice("SD1");
        SingleDice SD2 = new SingleDice("SD2");
        SingleDice SD3 = new SingleDice("SD3");
        executor.execute(SD1);
        System.out.println("Starting Thread Sd1");
        executor.execute(SD2);
        System.out.println("Starting Thread SD2");
        executor.execute(SD3);
        System.out.println("Starting Thread SD3");


    }
}
