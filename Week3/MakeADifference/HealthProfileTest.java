/**
 * @author Dan Schaper
 *         3.17 Computerization of Health Records
 */
public class HealthProfileTest {

    public static void main(String[] args) {
        HealthProfile profile = new HealthProfile("John", "Smith", "Male", 14, 2, 1954, 65, 125.25);
        System.out.println("Health Profile Report");
        System.out.printf("First Name: %s\n", profile.getFirstName());
        System.out.printf("Last Name: %s\n", profile.getLastName());
        System.out.printf("Gender: %s\n", profile.getGender());
        System.out.printf("DOB: %02d/%02d/%4d\n", profile.getMonthOfBirth(), profile.getDayOfBirth(),
                profile.getYearOfBirth());
        System.out.printf("Weight (in pounds): %.2f\n", profile.getWeightInPounds());
        System.out.printf("Height (in inches): %.2f\n", profile.getHeightInInches());
        System.out.printf("Maximum Heart Rate: %d\n", profile.maxHeartRate());
        System.out.printf("Target Heart Rate: %s\n", profile.targetHeartRate());
        System.out.printf("BMI: %.1f\n", profile.BMI());
        System.out.printf("BMI VALUES\nUnderweight: less than 18.5\nNormal:      between 18.5 and 24.9\n" +
                "Overweight:  between 25 and 29.9\nObese:       30 or greater\n");
    }
}
