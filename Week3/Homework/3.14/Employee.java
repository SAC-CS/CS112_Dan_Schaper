/**
 * @author Dan Schaper
 *         3.14 Employee Class Homework
 */
public class Employee {

    private String firstName;
    private String lastName;
    private double monthlySalary;

    /**
     * Constructor for Employee Class
     *
     * @param fName   Employees first name
     * @param lName   Employees last name
     * @param mSalary Employees monthly salary
     */
    public Employee(String fName, String lName, double mSalary) {
        firstName = fName;
        lastName = lName;
        if (mSalary > 0) {
            monthlySalary = mSalary;
        }
    }

    /**
     * Set Employees first name
     *
     * @param fName Employees first name
     */
    public void setFirstName(String fName) {
        firstName = fName;
    }

    /**
     * Set Employees last name
     *
     * @param lName Employees last name
     */
    public void setLastName(String lName) {
        lastName = lName;
    }

    /**
     * Set Employees Salary
     *
     * @param mSalary Employees salary
     */
    public void setMonthlySalary(double mSalary) {
        if (mSalary > 0) {
            monthlySalary = mSalary;
        }
    }

    /**
     * Get Employees last name
     *
     * @return Employees last name as String
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Get Employees first name
     *
     * @return Employees first name as String
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Get Employees monthly salary
     *
     * @return Employees monthly salary as double
     */
    public double getMonthlySalary() {
        return monthlySalary;
    }

}
