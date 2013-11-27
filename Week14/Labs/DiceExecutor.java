import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Dan Schaper
 *         Date: 11/26/13
 *         Time: 8:40 PM
 */
public class DiceExecutor {

    public static void main(String[] args) {
        System.out.println("Starting Thread Pool");
        ExecutorService threadExecutor = Executors.newCachedThreadPool();
        for (int i = 0; i < 25; i++) {
            SingleDice SD = new SingleDice(String.valueOf(i));
            threadExecutor.execute(SD);
        }
        threadExecutor.shutdown();
        System.out.println("ThreadExecutor shutdown.");
    }
}
