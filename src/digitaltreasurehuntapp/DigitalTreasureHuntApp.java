package src.digitaltreasurehuntapp;

import java.util.ArrayList;

import src.treasurehunt.Map;
import src.treasurehunt.MapItem;
import src.treasurehunt.Player;

/**
 * @author Mert Deniz Ertekin
 * @author Nuhan Berke Hallac
 */

public class DigitalTreasureHuntApp {
    
    public static void main(String[] args) {
        DigitalTreasureHuntApp app = new DigitalTreasureHuntApp();
        app.flowControl();
        
    }

    // In this method, the flow of the game is controlled.
    private void flowControl() {
        Map map = new Map();
        Player player = new Player();
        ArrayList<MapItem> mapItems = map.generateMapItems();

        for (MapItem mapItem : mapItems) {
            int[] position = map.generateRandomMapPosition();
            mapItem.setPosition(position[0], position[1]);

        }



    }
}
