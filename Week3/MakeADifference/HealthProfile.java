import java.util.Calendar;

/**
 * @author Dan Schaper
 *         3.17 Computerization of Health Records
 */
public class HealthProfile {

    private String firstName;
    private String lastName;
    private String gender;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private double heightInInches;
    private double weightInPounds;
    private Calendar cal = Calendar.getInstance();
    private int currentYear = cal.get(Calendar.YEAR);
    private int currentMonth = cal.get(Calendar.MONTH) + 1;
    private int currentDay = cal.get(Calendar.DATE);

    /**
     * Constructor HealthProfile
     *
     * @param firstName      Patient first name
     * @param lastName       Patient last name
     * @param gender         Patient gender
     * @param dayOfBirth     Patient day of birth
     * @param monthOfBirth   Patient month of birth
     * @param yearOfBirth    Patient year of birth
     * @param heightInInches Patient height in inches
     * @param weightInPounds Patient weight in pounds
     */
    public HealthProfile(String firstName, String lastName, String gender, int dayOfBirth, int monthOfBirth,
                         int yearOfBirth, double heightInInches, double weightInPounds) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        if (dayOfBirth > 0 && dayOfBirth <= 31) {
            this.dayOfBirth = dayOfBirth;
        }
        if (monthOfBirth > 0 && monthOfBirth <= 12) {
            this.monthOfBirth = monthOfBirth;
        }
        if (yearOfBirth > 1900 && yearOfBirth <= currentYear) {
            this.yearOfBirth = yearOfBirth;
        }
        if (heightInInches > 0) {
            this.heightInInches = heightInInches;
        }
        if (weightInPounds > 0) {
            this.weightInPounds = weightInPounds;
        }

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDayOfBirth(int dayOfBirth) {
        if (dayOfBirth > 0 && dayOfBirth <= 31) {
            this.dayOfBirth = dayOfBirth;
        }
    }

    public void setMonthOfBirth(int monthOfBirth) {
        if (monthOfBirth > 0 && monthOfBirth <= 12) {
            this.monthOfBirth = monthOfBirth;
        }
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth > 1900 && yearOfBirth <= currentYear) {
            this.yearOfBirth = yearOfBirth;
        }
    }

    public void setHeightInInches(double heightInInches) {
        if (heightInInches > 0) {
            this.heightInInches = heightInInches;
        }
    }

    public void setWeightInPounds(double weightInPounds) {
        if (weightInPounds > 0) {
            this.weightInPounds = weightInPounds;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public double getHeightInInches() {
        return heightInInches;
    }

    public double getWeightInPounds() {
        return weightInPounds;
    }

    public int ageInYears() {
        if ((currentMonth < monthOfBirth) || (currentMonth == monthOfBirth && currentDay < dayOfBirth)) {
            return currentYear - yearOfBirth - 1;
        } else {
            return currentYear - yearOfBirth;
        }
    }

    public int maxHeartRate() {
        return 220 - ageInYears();
    }

    public String targetHeartRate() {
        int maxRate = maxHeartRate();
        return (int) (maxRate * .5) + " - " + (int) (maxRate * .85);
    }

    public double BMI() {
        return (weightInPounds * 703) / (heightInInches * heightInInches);
    }
}
