package monopoly.gameboards;

import monopoly.GameBoard;
import monopoly.cells.FreeParkingCell;

public class FreeParkingCellBoard extends GameBoard {

    public static FreeParkingCell fp;

    FreeParkingCellBoard()
    {
        fp = new FreeParkingCell();
    }

}
