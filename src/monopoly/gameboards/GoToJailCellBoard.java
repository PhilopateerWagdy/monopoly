package monopoly.gameboards;

import monopoly.GameBoard;
import monopoly.cells.GoToJailCell;

public class GoToJailCellBoard extends GameBoard {

    public static GoToJailCell goToJail;

    GoToJailCellBoard()
    {

         goToJail = new GoToJailCell();
    }

}
