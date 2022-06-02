package monopoly.gameboards;

import monopoly.GameBoard;
import monopoly.cells.PropertyCell;
import monopoly.enums.ColorGroup;

public class PropertyCellBoard extends GameBoard {

    public static PropertyCell dp1;
    public static PropertyCell dp2 ;
    public static PropertyCell dp3 ;
    public static PropertyCell lb1 ;
    public static PropertyCell lb2 ;
    public static PropertyCell lb3 ;
    public static PropertyCell p1 ;
    public static PropertyCell p2 ;
    public static PropertyCell p3 ;
    public static PropertyCell o1 ;
    public static PropertyCell o2 ;
    public static PropertyCell o3 ;
    public static PropertyCell r1;
    public static PropertyCell r2 ;
    public static PropertyCell r3;
    public static PropertyCell g1 ;
    public static PropertyCell g2 ;
    public static PropertyCell g3 ;
    public static PropertyCell y1 ;
    public static PropertyCell y2 ;
    public static PropertyCell y3 ;
    public static PropertyCell db1 ;
    public static PropertyCell db2 ;
    public static PropertyCell db3 ;

    public static void func(DataPropertyCell dataPropertyCell)
    {
        dataPropertyCell.obj.setPrice(dataPropertyCell.price);
        dataPropertyCell.obj.setColorGroup(dataPropertyCell.color);
        dataPropertyCell.obj.setHousePrice(dataPropertyCell.housePrice);
        dataPropertyCell.obj.setName(dataPropertyCell.name);
        dataPropertyCell.obj.setRent(dataPropertyCell.rent);
    }

    PropertyCellBoard()
    {

         dp1 = new PropertyCell();
         dp2 = new PropertyCell();
         dp3 = new PropertyCell();
         lb1 = new PropertyCell();
         lb2 = new PropertyCell();
         lb3 = new PropertyCell();
         p1 = new PropertyCell();
         p2 = new PropertyCell();
         p3 = new PropertyCell();
         o1 = new PropertyCell();
         o2 = new PropertyCell();
         o3 = new PropertyCell();
         r1 = new PropertyCell();
         r2 = new PropertyCell();
         r3 = new PropertyCell();
         g1 = new PropertyCell();
         g2 = new PropertyCell();
         g3 = new PropertyCell();
         y1 = new PropertyCell();
         y2 = new PropertyCell();
         y3 = new PropertyCell();
         db1 = new PropertyCell();
         db2 = new PropertyCell();
         db3 = new PropertyCell();


        DataPropertyCell dataProperty1 = new DataPropertyCell(dp1, 60,ColorGroup.PURPLE,50,"Mediterranean Avenue", 2);
        DataPropertyCell dataProperty2 = new DataPropertyCell(dp2, 60,ColorGroup.PURPLE,50,"Baltic Avenue", 4);
        DataPropertyCell dataProperty3 = new DataPropertyCell(dp3, 60,ColorGroup.PURPLE,50,"Sarah Avenue", 4);
        DataPropertyCell dataProperty4 = new DataPropertyCell(lb1, 100,ColorGroup.TEAL,50,"Oriental Avenue", 6);
        DataPropertyCell dataProperty5 = new DataPropertyCell(lb2, 100,ColorGroup.TEAL,50,"Vermont Avenue", 6);
        DataPropertyCell dataProperty6 = new DataPropertyCell(lb3, 120,ColorGroup.TEAL,50,"Connecticut Avenue", 8);
        DataPropertyCell dataProperty7 = new DataPropertyCell(p1, 140,ColorGroup.FUCHSIA,100,"St. Charles Place", 10);
        DataPropertyCell dataProperty8 = new DataPropertyCell(p2, 140,ColorGroup.FUCHSIA,100,"States Avenue", 10);
        DataPropertyCell dataProperty9 = new DataPropertyCell(p3, 160,ColorGroup.FUCHSIA,100,"Virginia Avenue", 12);
        DataPropertyCell dataProperty10 = new DataPropertyCell(o1, 180,ColorGroup.MAROON,100,"St. James Avenue", 14);
        DataPropertyCell dataProperty11 = new DataPropertyCell(o2, 180,ColorGroup.MAROON,100,"Tennessee Avenue", 14);
        DataPropertyCell dataProperty12 = new DataPropertyCell(o3, 200,ColorGroup.MAROON,100,"New York Avenue", 16);
        DataPropertyCell dataProperty13 = new DataPropertyCell(r1, 220,ColorGroup.RED,150,"Kentucky Avenue", 18);
        DataPropertyCell dataProperty14 = new DataPropertyCell(r2, 220,ColorGroup.RED,150,"Indiana Avenue", 18);
        DataPropertyCell dataProperty15 = new DataPropertyCell(r3, 240,ColorGroup.RED,150,"Illinois Avenue", 20);
        DataPropertyCell dataProperty16 = new DataPropertyCell(y1, 260,ColorGroup.ORANGE,150,"Atlantic Avenue", 22);
        DataPropertyCell dataProperty17 = new DataPropertyCell(y2, 260,ColorGroup.ORANGE,150,"Ventnor Avenue", 22);
        DataPropertyCell dataProperty18 = new DataPropertyCell(y3, 280,ColorGroup.ORANGE,150,"Marvin Gardens", 24);
        DataPropertyCell dataProperty19 = new DataPropertyCell(g1, 300,ColorGroup.GREEN,200,"Pacific Avenue", 26);
        DataPropertyCell dataProperty20 = new DataPropertyCell(g2, 300,ColorGroup.GREEN,200,"North Carolina Avenue", 26);
        DataPropertyCell dataProperty21 = new DataPropertyCell(g3, 320,ColorGroup.GREEN,200,"Pennsylvania Avenue", 28);
        DataPropertyCell dataProperty22 = new DataPropertyCell(db1, 350,ColorGroup.BLUE,200,"Park Place", 35);
        DataPropertyCell dataProperty23 = new DataPropertyCell(db2, 350,ColorGroup.BLUE,200,"Dright Place", 35);
        DataPropertyCell dataProperty24 = new DataPropertyCell(db3, 400,ColorGroup.BLUE,200,"Boardwalk", 50);

        func(dataProperty1);
        func(dataProperty2);
        func(dataProperty3);
        func(dataProperty4);
        func(dataProperty5);
        func(dataProperty6);
        func(dataProperty7);
        func(dataProperty8);
        func(dataProperty9);
        func(dataProperty10);
        func(dataProperty11);
        func(dataProperty12);
        func(dataProperty13);
        func(dataProperty14);
        func(dataProperty15);
        func(dataProperty16);
        func(dataProperty17);
        func(dataProperty18);
        func(dataProperty19);
        func(dataProperty20);
        func(dataProperty21);
        func(dataProperty22);
        func(dataProperty23);
        func(dataProperty24);
    }

}
