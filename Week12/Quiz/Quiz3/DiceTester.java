package Quiz3;

/**
 * @author Dan Schaper
 *         Date: 11/12/13
 *         Time: 8:53 PM
 */
public class DiceTester {
    public static void main(String[] args) {
        Dice d1 = new SingleDice();
        Dice d2 = new DoubleDice();
        Dice d3 = new TrippleDice();
        for (int i = 0; i < 10; i++) {
            d1.Throw();
            d2.Throw();
            d3.Throw();
        }
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);


    }
}
