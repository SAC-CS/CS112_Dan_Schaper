import java.util.Scanner;

/**
 * @author Dan Schaper
 *         Date: 9/10/13
 *         Time: 8:08 PM
 */
public class Lab03 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); // Create scanner for user input

        int user1; // Variable for first user input
        int user2; // Variable for second user input

        System.out.print("Please enter your first integer: "); // Get input and assign
        user1 = in.nextInt();

        System.out.print("Please enter your second integer: "); // Get second input and assign
        user2 = in.nextInt();

        System.out.printf("Hello, you entered %d and %d.", user1, user2);// Display result

    }
}
