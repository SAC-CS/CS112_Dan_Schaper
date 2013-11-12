package DiceGame;

/**
 * @author Dan Schaper
 *         Week 11 Homework
 *         TripleDiceWithHistory clone / equals method overrides
 */
public class TrippleDiceWithHistoryTester {
    public static void main(String[] args) {
        TrippleDiceWithHistory T1 = new TrippleDiceWithHistory();
        TrippleDiceWithHistory T2 = new TrippleDiceWithHistory();
        for (int i = 0; i < 10; i++) {
            T1.Throw();
            T2.Throw();
        }
        System.out.printf("T1: \n %s\n", T1);
        System.out.printf("T2: \n %s\n", T2);

        TrippleDiceWithHistory cloneDice = T1.clone();
        System.out.printf("Clone of T1: \n %s\n", cloneDice);

        System.out.printf("T1 and Clone of T1 %s equal\n", T1.equals(cloneDice) ? "are" : "are not");
        System.out.printf("T2 and Clone of T1 %s equal\n", T2.equals(cloneDice) ? "are" : "are not");


    }
}

// Try these:
//        System.out.printf("T1 and Clone of T1 %s equal\n", T1 == cloneDice ? "are" : "are not");
//        System.out.printf("T2 and Clone of T1 %s equal\n", T2 == cloneDice ? "are" : "are not");
