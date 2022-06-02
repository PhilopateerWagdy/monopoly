package monopoly.gameboards;

import monopoly.GameBoard;
import monopoly.cells.RailRoadCell;

public class RailRoadCellBoard extends GameBoard {

    int rrBaseRent = 25;
    int rrPrice = 200;

    public static RailRoadCell rr1;
    public static RailRoadCell rr2;
    public static RailRoadCell rr3;
    public static RailRoadCell rr4;

    RailRoadCellBoard()
    {

        rr1 = new RailRoadCell();
        rr2 = new RailRoadCell();
        rr3 = new RailRoadCell();
        rr4 = new RailRoadCell();

        rr1.setName("Reading Railroad");
        rr1.setBaseRent(rrBaseRent);
        rr1.setPrice(rrPrice);

        rr2.setName("Pennsylvania Railroad");
        rr2.setBaseRent(rrBaseRent);
        rr2.setPrice(rrPrice);

        rr3.setName("B. & O. RailRoad");
        rr3.setBaseRent(rrBaseRent);
        rr3.setPrice(rrPrice);

        rr4.setName("Short Line");
        rr4.setBaseRent(rrBaseRent);
        rr4.setPrice(rrPrice);

    }

}
