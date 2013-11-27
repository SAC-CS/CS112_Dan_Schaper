/**
 * @author Dan Schaper
 *         Date: 11/26/13
 *         Time: 7:50 PM
 */
public class DiceMain {
    public static void main(String[] args) {
        System.out.println("Start");
        for (int i = 0; i < 25; i++) {
            Runnable SDThread = new SingleDice();
            Thread worker = new Thread(SDThread);
            worker.setName("SingleDice " + i);
            worker.start();
            System.out.printf("%s Complete \n", worker.getName());
        }
        System.out.println("Main Complete");
    }
}
