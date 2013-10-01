import java.util.Scanner;

/**
 * @author Dan Schaper
 *         Date: 9/10/13
 *         Time: 8:46 PM
 */
public class Lab04 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); // Create scanner for user input

        int user1;  // Declare first integer variable
        int user2;  // Declare second integer variable

        System.out.print("Please enter your first integer: "); //Prompt for user input
        user1 = in.nextInt();

        System.out.print("Please enter your second integer: "); // Prompt for second input
        user2 = in.nextInt();

        System.out.printf("Sum is %d, difference is %d, product is %d, quotient is %dr%d\n", user1 + user2,
                user1 - user2, user1 * user2, user1 / user2, user1 % user2); // Display results
    }
}
