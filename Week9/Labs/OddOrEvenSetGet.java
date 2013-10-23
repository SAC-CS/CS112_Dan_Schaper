/**
 * @author Dan Schaper
 *         Date: 10/22/13
 *         Time: 8:13 PM
 *         Week 9 Lab 2
 */
public class OddOrEvenSetGet {
    private int m_val;

    public void odd() {
        System.out.println("Odd");
    }

    public void even() {
        System.out.println("Even");
    }

    public void setM_val(int value) {
        m_val = value;
    }

    public void OddEven() {
        if (m_val % 2 == 0) {
            even();
        } else {
            odd();
        }
    }
}
