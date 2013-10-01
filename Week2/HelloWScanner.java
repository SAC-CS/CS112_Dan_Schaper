/**
 * Hello World with Scanner and formatted output
 *
 * @author Dan Schaper
 *
 */

import java.util.Scanner;

public class HelloWScanner {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String userName;

        System.out.print("Please enter your name: ");
        userName = in.next();

        System.out.printf("Hello, %s", userName);

    }

}
