package monopoly.gui;

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.OverlayLayout;
import javax.swing.border.BevelBorder;
import monopoly.BoardController;
import monopoly.Cell;
import monopoly.MainController;
import monopoly.Player;

public class CellGUI extends JPanel {
    private static final long serialVersionUID = 2752137388247147409L;
    private final Cell cell;
    private JLabel infoLabel;
    PlayerCellGUI playerCellGUI = new PlayerCellGUI();
    
    public CellGUI(Cell cell) {
        this.cell = cell;
        super.setLayout(new OverlayLayout(this));
        super.setBorder(new BevelBorder(BevelBorder.LOWERED));
        JPanel playerPanel = new JPanel();
        playerPanel.setLayout(new GridLayout(2, 4, 0, 25));
        playerPanel.setOpaque(false);
        playerCellGUI.createPlayerLabels(playerPanel);
        super.add(playerPanel);
        super.setPreferredSize(new Dimension(100,100));
        addCellInfo();
        super.setToolTipText(InfoFormatter.cellToolTip(cell));
        super.doLayout();
    }
	
    private void addCellInfo() {
        infoLabel = new JLabel();
        displayInfo();
        JPanel infoPanel = new JPanel();
        infoPanel.setLayout(new GridLayout(1, 1));
        infoPanel.add(infoLabel);
        add(infoPanel);
    }

    public void displayInfo() {
        infoLabel.setText(InfoFormatter.cellInfo(cell));
        this.setToolTipText(InfoFormatter.cellToolTip(cell));
        this.invalidate();
        this.repaint();
    }

    public Cell getCell() {
        return cell;
    }

}
