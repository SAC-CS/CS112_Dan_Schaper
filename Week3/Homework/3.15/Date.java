/**
 * @author Dan Schaper
 *         3.15 Date Class Homework
 */
public class Date {

    private int month;
    private int day;
    private int year;

    /**
     * Constructor for Date class
     *
     * @param month Month value of the date
     * @param day   Day value of the date
     * @param year  Year value of the date
     */
    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    /**
     * Display formatted date
     */
    public void displayDate() {
        System.out.printf("%02d/%02d/%4d", month, day, year);
    }

    /**
     * Set the month value
     *
     * @param month Value for the month
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * Set the day value
     *
     * @param day Value for the day
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * Set the year value
     *
     * @param year Value for the year
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Get the month value
     *
     * @return Month value as int
     */
    public int getMonth() {
        return this.month;
    }

    /**
     * Get the day value
     *
     * @return Day value as int
     */
    public int getDay() {
        return this.day;
    }

    /**
     * Get the year value
     *
     * @return Year value as int
     */
    public int getYear() {
        return this.year;
    }
}
