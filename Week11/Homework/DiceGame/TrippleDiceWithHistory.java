package DiceGame;

import java.util.ArrayList;

/**
 * @author Dan Schaper
 *         Week 11 Homework
 *         TripleDiceWithHistory clone / equals method overrides
 */
public class TrippleDiceWithHistory extends TrippleDice {
    private ArrayList<Integer> hist; // ArrayList for history of values


    /**
     * Constructor for TrippleDiceWithHistory with bounces argument
     *
     * @param bounces number of bounces to use
     */
    public TrippleDiceWithHistory(int bounces) {
        super(bounces);  // call TrippleDice constructor
        hist = new ArrayList<>();  // initialize ArrayList for history

    }

    /**
     * Default constructor for TrippleDiceWithHistory
     */
    public TrippleDiceWithHistory() {
        this(1); // Call this constructor with 1 bounce by default
    }


    /**
     * Throw the TrippleDice
     *
     * @return Average value of the numbers rolled
     */
    @Override
    public int Throw() {
        int val = super.Throw(); // Call superclass Throw method (Dice class)
        hist.add(val);  // add value to history
        return val;
    }

    /**
     * Display the dice in a history format
     *
     * @return formatted display of TrippleDice history
     */
    @Override
    public String toString() {
        int counter = 1;
        String result = String.format("%s %s\n", "Throw", "Value"); // Print header
        for (int entry : hist) {  // loop through each entry in history
            result += String.format("%5d %5d\n", counter, entry);  // print history entry
            counter++;
        }
        return result;
    }

    /**
     * Create a clone of an existing TrippleDice
     *
     * @return new TrippleDiceWithHistory object deep copied
     */
    @Override
    public TrippleDiceWithHistory clone() throws CloneNotSupportedException {
        return (TrippleDiceWithHistory) super.clone();  // return cloned TrippleDice object
    }

    /**
     * Determine if two TrippleDiceWithHistory objects have the same history
     *
     * @param dice TrippleDiceWithHistory object to test for equivalency
     * @return True if dice have same history.
     */
    @Override
    public boolean equals(Object dice) {
        if (dice == null || dice.getClass() != this.getClass()) {  // Check if dice is null or not a TrippleDiceWithHistory object
            return false;
        }
        TrippleDiceWithHistory tDice = (TrippleDiceWithHistory) dice;   // Cast argument Object to TrippleDice
        for (int i = 0; i < this.hist.size(); i++) {  // Loop through each entry in this TrippleDices history
            if (!tDice.hist.get(i).equals(this.hist.get(i))) {   // Compare history entries
                return false;
            }
        }
        return true;
    }

}
