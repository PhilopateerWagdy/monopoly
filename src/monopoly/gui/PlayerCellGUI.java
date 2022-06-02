package monopoly.gui;
import monopoly.BoardController;
import monopoly.MainController;
import monopoly.Player;
import javax.swing.*;

public class PlayerCellGUI extends JPanel
{
    private final JLabel[] playersLabel = new JLabel[BoardController.MAX_PLAYER];

    public void addPlayer(MainController mainController, int index) {
        Player player = mainController.getPlayer(index);
        playersLabel[index].setOpaque(true);
        playersLabel[index].setBackground(player.getPlayerColor());
    }
    public void createPlayerLabels(JPanel playerPanel) {
        for (int i = 0; i < BoardController.MAX_PLAYER; i++) {
            playersLabel[i] = new JLabel();
            playerPanel.add(playersLabel[i]);

        }
    }
    public void removePlayer(int index) {
        playersLabel[index].setText("");
        playersLabel[index].setOpaque(false);
        this.repaint();
    }
}
