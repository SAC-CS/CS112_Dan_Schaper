/**
 * @author Dan Schaper
 *         Date: 10/29/13
 *         Time: 8:29 PM
 */
public class DiceLab3Tester {

    public static void main(String[] args) {

        DiceLab3 die = new DiceLab3();
        System.out.println(die.Throw());
        System.out.println(die.Value());

        DiceLab3 die2 = new DiceLab3(3);
        System.out.println(die2.Throw());
        System.out.println(die2.Value());

    }

}
