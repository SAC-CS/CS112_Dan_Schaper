/**
 * @author Dan Schaper
 *         Date: 11/5/13
 *         Time: 9:18 PM
 */
public class TrippleDiceWithHistoryTester {
    public static void main(String[] args) {
        TrippleDiceWithHistory T1 = new TrippleDiceWithHistory();
        for (int i = 0; i < 10; i++) {
            T1.Throw();
        }
        System.out.println(T1);

    }
}
