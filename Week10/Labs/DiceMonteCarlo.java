/**
 * Created with IntelliJ IDEA.
 * User: Dan
 * Date: 11/5/13
 * Time: 2:42 AM
 * To change this template use File | Settings | File Templates.
 */
public class DiceMonteCarlo {

    public static void main(String[] args) {
        for (int i = 1; i < 7; i++) {
            System.out.printf("1000 Simulations of 10,000 rolls with %d bounces\n", i);
            rollMonteCarlo(1000, 10000, i);
            System.out.println();
        }

    }

    public static void printArray(int[] array, int rolls) {
        for (int i = 1; i < array.length; i++) {
            System.out.printf("%s: %s, %.2f%%\n", i, array[i], (float) array[i] / rolls * 100);
        }
    }

    public static void rollMonteCarlo(int sims, int rolls, int bounces) {
        int[] faces = new int[7];
        DiceLab5 dice = new DiceLab5();
        for (int j = 0; j < sims; j++) { // j number of  simulations
            int[] temp = new int[7];
            for (int i = 0; i < rolls; i++) {   // i number of rolls
                ++temp[dice.Throw(1, bounces)];
            }
            for (int k = 0; k < temp.length; k++) { // update faces array
                if (faces[k] == 0) {
                    faces[k] = temp[k];
                } else {
                    faces[k] = (faces[k] + temp[k]) / 2;
                }
            }
        }
        printArray(faces, rolls);
    }
}
