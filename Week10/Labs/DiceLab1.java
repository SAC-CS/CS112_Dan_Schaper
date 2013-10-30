import java.util.Random;

/**
 * @author Dan Schaper
 *         Date: 10/29/13
 *         Time: 8:25 PM
 */
public class DiceLab1 {
    private int faceValue;
    Random rand;

    public DiceLab1() {
        rand = new Random();
    }

    public int Throw() {
        faceValue = rand.nextInt(6) + 1;
        return faceValue;
    }

    public int Value() {
        return faceValue;
    }
}
