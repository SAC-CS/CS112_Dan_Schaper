/**
 * @author Dan Schaper
 *         Date: 10/29/13
 *         Time: 8:29 PM
 */
public class DiceLab5Tester {

    public static void main(String[] args) {

        DiceLab5 die = new DiceLab5();
        System.out.println(die.Throw());
        System.out.println(die.Value());

        DiceLab5 die2 = new DiceLab5(3);
        System.out.println(die2.Throw());
        System.out.println(die2.Value());

        DiceLab5 die3 = new DiceLab5();
        System.out.println(die3.Throw(2, 5));
        System.out.println(die3.Value());

        System.out.println(DiceLab5.OneThrow());

    }

}
