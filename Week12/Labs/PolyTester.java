/**
 * @author Dan Schaper
 *         Date: 11/12/13
 *         Time: 8:03 PM
 */
public class PolyTester {
    public static void main(String[] args) {
        DoubleDice dDice = new DoubleDice();
        TrippleDice tDice = new TrippleDice();
        Dice sDice = new DoubleDice();

        System.out.println(dDice);
        System.out.println(dDice.Throw());
        System.out.println(tDice);
        System.out.println(tDice.Throw());
        System.out.println(sDice);
        System.out.println(sDice.Throw());

    }
}
