/**
 * @author Dan Schaper
 *         Date: 11/5/13
 *         Time: 7:21 PM
 */
public class ThreeDice {
    Dice D1 = new Dice();
    Dice D2 = new Dice();
    Dice D3 = new Dice();

    public int Throw() {
        int m_sum = 0;
        m_sum += D1.Throw();
        m_sum += D2.Throw();
        m_sum += D3.Throw();
        return m_sum / 3;
    }

}
