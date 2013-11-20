/**
 * @author Dan Schaper
 *         Date: 11/19/13
 *         Time: 7:55 PM
 *         Week 13 Lab 1
 */
public class HistoryTester {

    public static void main(String[] args) {
        History[] historyObjects = new History[2];
        historyObjects[0] = new Dice();
        historyObjects[1] = new Card();

        try {
            for (History historyItem : historyObjects) {
                historyItem.getRandom();
                historyItem.getRandom();
                historyItem.getRandom();
                System.out.println(historyItem.printHistory());
            }
        } catch (UnsupportedOperationException e) {
            System.out.printf("Error: %s", e);
        }

        try {
            for (History historyItem : historyObjects) {
                historyItem.getRandom();
                historyItem.getRandom();
                historyItem.getRandom();
                historyItem.getRandom();
                System.out.println(historyItem.printHistory());
            }
        } catch (UnsupportedOperationException e) {
            System.out.printf("Error: %s", e);
        }

    }
}
