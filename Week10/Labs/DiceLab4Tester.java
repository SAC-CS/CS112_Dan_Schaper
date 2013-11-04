/**
 * @author Dan Schaper
 *         Date: 10/29/13
 *         Time: 8:29 PM
 */
public class DiceLab4Tester {

    public static void main(String[] args) {

        DiceLab4 die = new DiceLab4();
        System.out.println(die.Throw());
        System.out.println(die.Value());

        DiceLab4 die2 = new DiceLab4(3);
        System.out.println(die2.Throw());
        System.out.println(die2.Value());

        System.out.println(DiceLab4.OneThrow());

    }

}
