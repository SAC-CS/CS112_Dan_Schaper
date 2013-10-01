import java.util.Scanner;

/**
 * @author Dan Schaper
 *         Date: 9/10/13
 *         Time: 9:14 PM
 */
public class Lab05 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); // Create scanner for user input

        int user1;  // Declare first integer variable

        System.out.print("Please enter your integer: "); //Prompt for user input
        user1 = in.nextInt();

        if (user1 > 10) {  // Check for greater than 10
            System.out.printf("%d is greater than 10.\n", user1);
        }

        if (user1 <= 10) { // Check for less than or equal to 10
            System.out.printf("%d is not greater than 10.\n", user1);
        }
    }
}
