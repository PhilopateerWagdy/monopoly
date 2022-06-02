package monopoly.gameboards;

import monopoly.cells.PropertyCell;
import monopoly.enums.ColorGroup;

public class DataPropertyCell
{
    PropertyCell obj;
    int price;
    ColorGroup color;
    int housePrice;
    String name;
    int rent;

    DataPropertyCell(PropertyCell obj, int price, ColorGroup color, int housePrice, String name, int rent)
    {
        this.obj = obj;
        this.price = price;
        this.color = color;
        this.housePrice = housePrice;
        this.name = name;
        this.rent = rent;
    }
}
