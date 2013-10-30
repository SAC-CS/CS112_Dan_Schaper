/**
 * @author Dan Schaper
 *         Date: 10/29/13
 *         Time: 8:29 PM
 */
public class DiceLab2Tester {

    public static void main(String[] args) {

        DiceLab2 die = new DiceLab2();
        System.out.println(die.Throw());
        System.out.println(die.Value());
        System.out.println(die.Throw(3));

    }

}
