package monopoly.gui;

import javax.swing.JOptionPane;
import monopoly.*;

public class Main {

    private static final MainController MAIN_CONTROLLER = new MainController();

    public static String getFromUserNumberOfPlayers(MainWindow window){
        String numberOfPlayers = "";
        numberOfPlayers = JOptionPane.showInputDialog(
                window,
                "How many players"
        );
        if (numberOfPlayers == null) {
            System.exit(0);
        }
        return numberOfPlayers;
    }
    public static void checkInputOfNumberOfPlayers(int numPlayers, MainWindow window) {
        if (numPlayers < 2 || numPlayers > BoardController.MAX_PLAYER) {
            JOptionPane.showMessageDialog(
                    window,
                    "Please input a number between 2 and 8"
            );
        } else {
            MAIN_CONTROLLER.setNumberOfPlayers(numPlayers);
        }
    }
    private static int parseInputOfNumberOfPlayers(int numPlayers, String numberOfPlayers, MainWindow window){
        try {
            numPlayers = Integer.parseInt(numberOfPlayers);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    window,
                    "Please input a number"
            );
        }
        return numPlayers;
    }
    public static int inputNumberOfPlayers(MainWindow window) {
        String numberOfPlayers = "";
        int numPlayers = 0;
        while (numPlayers < 2 || numPlayers > BoardController.MAX_PLAYER) {
            numberOfPlayers = getFromUserNumberOfPlayers(window);
            numPlayers = parseInputOfNumberOfPlayers(numPlayers, numberOfPlayers, window);
            checkInputOfNumberOfPlayers(numPlayers, window);
        }
        return numPlayers;
    }

    public static void main(String[] args) {
        MainWindow window = new MainWindow(MAIN_CONTROLLER);
        if (args.length > 0) {
            try {
                GameBoard board = (GameBoard) Class.forName(args[1]).newInstance();
                MAIN_CONTROLLER.setGameBoard(board);
            } catch (ClassNotFoundException e) {
                JOptionPane.showMessageDialog(
                    window, 
                    "Class Not Found.  Program will exit"
                );
                System.exit(0);
            } catch (IllegalAccessException e ) {
                JOptionPane.showMessageDialog(
                    window, 
                    "Illegal Access of Class.  Program will exit"
                );
                System.exit(0);
            } catch (InstantiationException e) {
                JOptionPane.showMessageDialog(
                    window, 
                    "Class Cannot be Instantiated.  Program will exit"
                );
                System.exit(0);
            }
        }
        
        int numPlayers = inputNumberOfPlayers(window);
        for (int i = 0; i < numPlayers; i++) {
            String name = JOptionPane.showInputDialog(
                window, 
                "Please input name for Player " + (i + 1)
            );
            if (name.equals("") || name.trim().isEmpty()) {
                MAIN_CONTROLLER.getPlayer(i).setName("Player " + (i + 1));
            } else {
                MAIN_CONTROLLER.getPlayer(i).setName(name);
            }
        }
        window.setupGameBoard(MAIN_CONTROLLER.getGameBoard());
        window.setVisible(true);
        MAIN_CONTROLLER.setGUI(window);
        MAIN_CONTROLLER.startGame();
    }
}
