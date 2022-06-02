package monopoly.gameboards;

import monopoly.GameBoard;
import monopoly.cells.JailCell;

public class JailCellBoard extends GameBoard {

    public static JailCell jail;

    JailCellBoard()
    {

        jail = new JailCell();

    }

}
