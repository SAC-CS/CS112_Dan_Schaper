import java.util.Scanner;

/**
 * @author Dan Schaper
 *         Date: 9/10/13
 *         Time: 9:35 PM
 */
public class Lab06 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); // Create scanner for user input

        int user1;  // Declare first integer variable

        System.out.print("Please enter your integer: "); //Prompt for user input
        user1 = in.nextInt();

        if (user1 > 10 || user1 < 5) {
            System.out.printf("%d is > 10 or < 5\n", user1);
        } else {
            System.out.printf("%d is not > 10 or < 5\n", user1);
        }
    }
}
