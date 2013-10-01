/**
 * @author Dan Schaper
 *         3.14 Employee Class Homework
 */
public class EmployeeTest {

    public static void main(String[] args) {

        // Instantiate two Employee objects
        Employee hire1 = new Employee("John", "Doe", 2000.25);
        Employee hire2 = new Employee("Roberta", "Smith", 1234.12);

        // Change hire1's first name
        hire1.setFirstName("Johnny");

        // Change hire2's last name
        hire2.setLastName("Smith-Jones");

        // Try to set hire1's salary to a negative value
        hire1.setMonthlySalary(-1000.00);

        // Print current yearly salary
        System.out.printf("%s %s has a yearly salary of $%.2f\n", hire1.getFirstName(), hire1.getLastName(),
                hire1.getMonthlySalary() * 12);
        System.out.printf("%s %s has a yearly salary of $%.2f\n", hire2.getFirstName(), hire2.getLastName(),
                hire2.getMonthlySalary() * 12);

        // Give a 10% raise
        System.out.println("Giving employees a 10% raise");
        hire1.setMonthlySalary(hire1.getMonthlySalary() * 1.10);
        hire2.setMonthlySalary(hire2.getMonthlySalary() * 1.10);

        // Print new yearly salary
        System.out.printf("%s %s now has a yearly salary of $%.2f\n", hire1.getFirstName(), hire1.getLastName(),
                hire1.getMonthlySalary() * 12);
        System.out.printf("%s %s now has a yearly salary of $%.2f\n", hire2.getFirstName(), hire2.getLastName(),
                hire2.getMonthlySalary() * 12);

    }
}
