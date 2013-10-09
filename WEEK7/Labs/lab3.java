import java.util.Arrays;

/**
 * @author Dan Schaper
 *         Date: 10/8/13
 *         Time: 9:11 PM
 *         CS112 Week 7 lab 3
 */
public class lab3 {
    public static void main(String[] args) {
        int[] listOfInts = {123, 456, 479, 135, 246, 135};
        int sumOfInts = 0;
        Arrays.sort(listOfInts);
        for (int val : listOfInts) {
            System.out.println(val);
            sumOfInts += val;
        }
        System.out.printf("Sum of list: %s", sumOfInts / listOfInts.length);

    }
}
