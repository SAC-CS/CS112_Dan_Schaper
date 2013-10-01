/**
 * @author Dan Schaper
 *         3.15 Date Class Homework
 */
public class DateTest {

    public static void main(String[] args) {
        // Instantiate a Date object
        Date date1 = new Date(7, 4, 1776);
        // Display Date object
        System.out.printf("Currently the Date object is: ");
        date1.displayDate();
        System.out.println();

        // Change date1 to Epoch (01/01/1970)
        System.out.printf("Month has been changed from %02d ", date1.getMonth());
        date1.setMonth(1);
        System.out.printf("to %02d\n", date1.getMonth());

        System.out.printf("Day has been changed from %02d ", date1.getDay());
        date1.setDay(1);
        System.out.printf("to %02d\n", date1.getDay());

        System.out.printf("Year has been changed from %02d ", date1.getYear());
        date1.setYear(1970);
        System.out.printf("to %4d\n", date1.getYear());

        //Display Date object
        System.out.printf("Now the Date object is: ");
        date1.displayDate();
        System.out.println();

    }
}
