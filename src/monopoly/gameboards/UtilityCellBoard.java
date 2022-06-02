package monopoly.gameboards;

import monopoly.GameBoard;
import monopoly.cells.UtilityCell;

public class UtilityCellBoard extends GameBoard {

    public static UtilityCell u1;
    public static UtilityCell u2;

    UtilityCellBoard()
    {

        u1 = new UtilityCell();
        u2 = new UtilityCell();
        UtilityCell.setPrice(150);
        u1.setName("Electric Company");
        u2.setName("Water Works");

    }

}
