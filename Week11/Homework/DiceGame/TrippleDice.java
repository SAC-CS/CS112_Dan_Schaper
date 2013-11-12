package DiceGame;

/**
 * @author Dan Schaper
 *         Week 11 Homework
 *         TripleDiceWithHistory clone / equals method overrides
 */
public class TrippleDice extends Dice implements Cloneable {

    public TrippleDice(int bounces) {
        super(3, bounces); // Call Dice constructor with 3 Dices and n bounces
    }

    public TrippleDice() {
        this(1);  // Call this constructor with 1 bounce as default
    }

    @Override
    public TrippleDice clone() throws CloneNotSupportedException {
        return (TrippleDice) super.clone();
    }

}
