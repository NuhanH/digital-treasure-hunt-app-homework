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
            int[] position;
            do {
                position = map.generateRandomMapPosition(false);
            } while (map.getMapItem(position[0], position[1]).isOccupied());

            mapItem.setPosition(position[0], position[1]);
            mapItem.setOccupied(true);
            map.setMapItem(position[0], position[1], mapItem);
        }
        return map;
    }

    // In this method, we implement the game loop.
    private void gameLoop(Map map) {
    
        Player player = new Player();

        // The player starts at a random position on the map.
        int[] playerPosition = map.generateRandomMapPosition(true);

        // We handle the player position and interactions.
        handlePlayerPosition(map, player, playerPosition);

        // The game loop continues until the player runs out of lives or points.
        
        while (player.getLives() > 0 && player.getPoints() > 0 && map.getMapItems().size() > 0) {
            // The player moves to a random position on the map.
            int[] newPosition = map.generateRandomMapPosition(true);

            if (newPosition[0] == player.getPosition()[0] && newPosition[1] == player.getPosition()[1]) {
                continue;
            }

            // We handle the player position and interactions.
            handlePlayerPosition(map, player, newPosition);
            System.out.println();
            map.printMap();  
            
        }
        System.out.println("Lives: " + player.getLives() + " Points: " + player.getPoints());
    }

    // This method handles the player position and interactions.
    private void handlePlayerPosition(Map map, Player player, int[] position) {
        if (player.getPosition()[0] == -1 || player.getPosition()[1] == -1) {
            player.setPosition(position[0], position[1]);
        }

        Player copyPlayer = new Player(player);
        int[] oldPosition = copyPlayer.getPosition();

        // If the new position is occupied, we handle the player interaction.
        if (map.getMapItem(position[0], position[1]).isOccupied()) {
            MapItem mapItem = map.getMapItem(position[0], position[1]);
            mapItem.playerInteraction(player);
            map.removeMapItem(mapItem);
            map.setMapItem(position[0], position[1], new MapItem(position[0], position[1], '_'));

        }

        // We update the player's position on the map.
        player.setPosition(position[0], position[1]);
        Player newPlayer = new Player(player);

        // We update the player's old position as empty map item.
        map.setMapItem(oldPosition[0], oldPosition[1], new MapItem(oldPosition[0], oldPosition[1], '_'));  

        // We update the player's new position as occupied and set the symbol as 'P'.
        map.getMapItem(position[0], position[1]).setOccupied(true);
        map.setMapItem(position[0], position[1], newPlayer);
    }
}
