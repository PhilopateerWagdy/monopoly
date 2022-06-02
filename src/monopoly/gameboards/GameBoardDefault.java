package monopoly.gameboards;

import monopoly.GameBoard;
import monopoly.cards.JailCard;
import monopoly.cards.MoneyCard;
import monopoly.cards.MovePlayerCard;
import monopoly.cells.CardCell;
import monopoly.cells.FreeParkingCell;
import monopoly.cells.GoToJailCell;
import monopoly.cells.JailCell;
import monopoly.cells.PropertyCell;
import monopoly.cells.RailRoadCell;
import monopoly.cells.UtilityCell;
import monopoly.enums.CardType;
import monopoly.enums.ColorGroup;

public class GameBoardDefault extends GameBoard {
    public GameBoardDefault() {
        super();

        CardCellBoard c = new CardCellBoard();
        FreeParkingCellBoard f = new FreeParkingCellBoard();
        GoToJailCellBoard g = new GoToJailCellBoard();
        JailCellBoard j = new JailCellBoard();
        PropertyCellBoard p = new PropertyCellBoard();
        RailRoadCellBoard r = new RailRoadCellBoard();
        UtilityCellBoard u = new UtilityCellBoard();

        super.addCell(f.fp);
        super.addCell(r.rr1);
        super.addCell(r.rr2);
        super.addCell(r.rr3);
        super.addCell(r.rr4);
        super.addCell(u.u1);
        super.addCell(u.u2);
        super.addCell(j.jail);
        super.addCell(c.c1);
        super.addCell(c.c2);
        super.addCell(c.c3);
        super.addCell(c.cc1);
        super.addCell(c.cc2);
        super.addCell(c.cc3);
        super.addCell(p.dp1);
        super.addCell(p.dp2);
        super.addCell(p.dp3);
        super.addCell(p.lb1);
        super.addCell(p.lb2);
        super.addCell(p.lb3);
        super.addCell(p.p1);
        super.addCell(p.p2);
        super.addCell(p.p3);
        super.addCell(p.o1);
        super.addCell(p.o2);
        super.addCell(p.o3);
        super.addCell(p.r1);
        super.addCell(p.r2);
        super.addCell(p.r3);
        super.addCell(p.y1);
        super.addCell(p.y2);
        super.addCell(p.y3);
        super.addCell(p.g1);
        super.addCell(p.g2);
        super.addCell(p.g3);
        super.addCell(p.db1);
        super.addCell(p.db2);
        super.addCell(p.db3);
        super.addCell(g.goToJail);


        super.addCard(new MoneyCard("Win $50", 50, CardType.CC));
        super.addCard(new MoneyCard("Win $20", 20, CardType.CC));
        super.addCard(new MoneyCard("Win $10", 10, CardType.CC));
        super.addCard(new MoneyCard("Lose $100", -100, CardType.CC));
        super.addCard(new MoneyCard("Lose $50", -50, CardType.CC));
        super.addCard(new JailCard(CardType.CC));
        super.addCard(new MovePlayerCard("St. Charles Place", CardType.CC));
        super.addCard(new MovePlayerCard("Boardwalk", CardType.CC));

        super.addCard(new MoneyCard("Win $50", 50, CardType.CHANCE));
        super.addCard(new MoneyCard("Win $20", 20, CardType.CHANCE));
        super.addCard(new MoneyCard("Win $10", 10, CardType.CHANCE));
        super.addCard(new MoneyCard("Lose $100", -100, CardType.CHANCE));
        super.addCard(new MoneyCard("Lose $50", -50, CardType.CHANCE));
        super.addCard(new JailCard(CardType.CHANCE));
        super.addCard(new MovePlayerCard("Illinois Avenue", CardType.CHANCE));
        
        super.shuffleCards();
    }
}
