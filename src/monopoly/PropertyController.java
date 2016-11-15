
package monopoly;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import monopoly.cells.PropertyCell;
import monopoly.cells.RailRoadCell;
import monopoly.cells.UtilityCell;

public class PropertyController {
    private final BoardController boardCtl;
    
    public PropertyController(BoardController boardCtl) {
        this.boardCtl = boardCtl;
    }

    public ArrayList<Player> getSellerList() {
        ArrayList sellers = new ArrayList();
        boardCtl.getPlayers().stream().filter((player) -> 
                (player != boardCtl.getCurrentPlayer())).forEach((player) -> {
            sellers.add(player);
        });
        return sellers;
    }
    
    public int purchaseHouse(String selectedMonopoly, int houses) {
        Player currentPlayer = boardCtl.getCurrentPlayer();
        GameBoard gameBoard = boardCtl.getGameBoard();
        
        int newNumber = 0;
        int money = currentPlayer.getMoney();
        PropertyCell[] cells = gameBoard.getPropertiesInMonopoly(selectedMonopoly);
        if ((money >= (cells.length * (cells[0].getHousePrice() * houses)))) {
            for (PropertyCell cell : cells) {
                newNumber = cell.getNumHouses() + houses;
                if (newNumber <= 5) {
                    cell.setNumHouses(newNumber);
                    currentPlayer.subtractMoney(cell.getHousePrice() * houses);
                }
            }
        }
        return newNumber;
    }
    
    public void buyProperty(Cell property, int amount) {
        Player currentPlayer = boardCtl.getCurrentPlayer();
        property.setPlayer(currentPlayer);
        if (property instanceof PropertyCell) {
            currentPlayer.addProperty((PropertyCell) property);
        }
        if (property instanceof RailRoadCell) {
            currentPlayer.addRailRoad((RailRoadCell) property);
        }
        if (property instanceof UtilityCell) {
            currentPlayer.addUtility((UtilityCell) property);
        }
        currentPlayer.setMoney(currentPlayer.getMoney() - amount);
    }
    
    public void purchase() {
        Player currentPlayer = boardCtl.getCurrentPlayer();

        if (currentPlayer.getPosition().isAvailable()) {
            Cell cell = currentPlayer.getPosition();
            buyProperty(cell, cell.getPrice());
            cell.setAvailable(false);
        }
    }
    
    public ArrayList<String> getMonopolies(Player player) {
        Map<String, Integer> colorGroups = player.getColorGroups();
        GameBoard gameBoard = boardCtl.getGameBoard();
        ArrayList<String> monopolies = new ArrayList<>();
        Set colors = colorGroups.keySet();
        
        for (int i = 0; i < colors.size(); i++) {
            String colorGroup = colors.toArray()[i].toString();
            if (!colorGroup.equals(RailRoadCell.COLOR_GROUP) && !colorGroup.equals(UtilityCell.COLOR_GROUP)) {
                Integer num = colorGroups.get(colorGroup);
                if (num == gameBoard.getPropertyNumberForColor(colorGroup)) {
                    monopolies.add(colorGroup);
                }
            }
        }
        return monopolies;
    }
    
    public boolean canBuyHouse() {
        return (!getMonopolies(boardCtl.getCurrentPlayer()).isEmpty());
    }

}
