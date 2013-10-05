import javax.swing.*;

/**
 * @author Dan Schaper
 *         CS112 Week 6 Homework Rock-Paper-Scissors Lab6
 */
public class RPSGameGUIPlayer {

    public static void main(String[] args) {
        do {
            RPSGameGUI game = new RPSGameGUI();
            while (!game.gameWon) {
                game.setCompChoice();
                game.setUserChoice();
                game.roundResult();
            }
        } while (JOptionPane.showConfirmDialog(null, "Would you like to play again?", "", JOptionPane.YES_NO_OPTION) ==
                JOptionPane.YES_OPTION);
    }
}

