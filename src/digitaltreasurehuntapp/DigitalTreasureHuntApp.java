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
        Map map = app.generateDefaultMap();
        app.gameLoop(map);
        
    }

    // In this method, we generate a default map with default map items.
    private Map generateDefaultMap() {
        Map map = new Map();
        ArrayList<MapItem> mapItems = map.generateMapItems();

        for (MapItem mapItem : mapItems) {
            int[] position = map.generateRandomMapPosition(false);
            mapItem.setPosition(position[0], position[1]);
            mapItem.setOccupied(true);
        }
        return map;
    }


    // In this method, we implement the game loop.
    private void gameLoop(Map map) {
        Player player = new Player();
        int[] playerPosition = map.generateRandomMapPosition(true);
        if (map.getMapItem(playerPosition[0], playerPosition[1]).isOccupied()) {
            //map.getMapItem(playerPosition[0], playerPosition[1])
        } else {
            // Set player position, set occupied status and set player to map.
            player.setPosition(playerPosition[0], playerPosition[1]);
            map.getMapItem(playerPosition[0], playerPosition[1]).setOccupied(true);
            map.setMapItem(playerPosition[0], playerPosition[1], player);
        }
        while (player.getLives() > 0 && player.getPoints() > 0) {
            // Implement game loop here
        }
    }
}
