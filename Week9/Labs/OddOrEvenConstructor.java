/**
 * @author Dan Schaper
 *         Date: 10/22/13
 *         Time: 8:49 PM
 *         Week 9 Lab 3
 */
public class OddOrEvenConstructor {
    private int m_val;

    public OddOrEvenConstructor(int value) {
        m_val = value;
    }

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
