import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Dan Schaper
 *         Date: 10/15/13
 *         Time: 8:18 PM
 */
public class Bonus2 {
    public static void main(String[] args) {
        int M;
        int F;
        int N;
        Scanner in;

        in = new Scanner(System.in);
        N = 0;
        M = 1;
        F = 1;
        do {
            System.out.print("Please enter a positive integer: ");
            try {
                N = in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please enter integers only.");
                in.nextLine();
            }
        } while (N < 1);

        do {
            F *= M;
        } while (M++ != N);
        System.out.println(F);


    }
}
