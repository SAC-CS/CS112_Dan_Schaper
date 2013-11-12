package DiceGame;

/**
 * @author Dan Schaper
 *         Week 11 Homework
 *         TripleDiceWithHistory clone / equals method overrides
 */
public class TrippleDiceWithHistoryTester {
    public static void main(String[] args) throws CloneNotSupportedException {
        TrippleDiceWithHistory T1 = new TrippleDiceWithHistory(3);
        TrippleDiceWithHistory T2 = new TrippleDiceWithHistory();
        for (int i = 0; i < 10; i++) {
            T1.Throw();
            T2.Throw();
        }
        System.out.printf("T1: \n %s\n", T1);
        System.out.printf("T2: \n %s\n", T2);

        TrippleDiceWithHistory cloneDice = T1.clone();
        System.out.printf("Clone of T1: \n %s\n", cloneDice);

        System.out.printf("cloneDice has been thrown %d times, bouncing %d times, last throw was %d\n",
                cloneDice.getThrows(), cloneDice.getBounces(), cloneDice.getValue());
        System.out.printf("T1 has been thrown %d times, bouncing %d times, last throw was %d\n\n",
                T1.getThrows(), T1.getBounces(), T1.getValue());


        System.out.printf("T1 and Clone of T1 %s equal\n", T1.equals(cloneDice) ? "are" : "are not");
        System.out.printf("T2 and Clone of T1 %s equal\n", T2.equals(cloneDice) ? "are" : "are not");
        System.out.printf("T1 and Clone of T1 %s ==\n", T1 == cloneDice ? "are" : "are not");
        System.out.printf("T2 and Clone of T1 %s ==\n", T2 == cloneDice ? "are" : "are not");


    }
}

// Try these:
//        System.out.printf("T1 and Clone of T1 %s equal\n", T1 == cloneDice ? "are" : "are not");
//        System.out.printf("T2 and Clone of T1 %s equal\n", T2 == cloneDice ? "are" : "are not");
