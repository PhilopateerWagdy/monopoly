package monopoly.gameboards;

import monopoly.GameBoard;
import monopoly.cells.CardCell;
import monopoly.enums.CardType;

public class CardCellBoard extends GameBoard {

    public static CardCell cc1;
    public static CardCell cc2;
    public static CardCell cc3;
    public static CardCell c1;
    public static CardCell c2;
    public static CardCell c3;

    CardCellBoard()
    {

        cc1 = new CardCell(CardType.CC, "Community Chest 1");
         cc2 = new CardCell(CardType.CC, "Community Chest 2");
         cc3 = new CardCell(CardType.CC, "Community Chest 3");
         c1 = new CardCell(CardType.CHANCE, "Chance 1");
         c2 = new CardCell(CardType.CHANCE, "Chance 2");
         c3 = new CardCell(CardType.CHANCE, "Chance 3");

    }

}
