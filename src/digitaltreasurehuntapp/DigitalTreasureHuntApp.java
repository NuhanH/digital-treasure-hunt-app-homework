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
        // The player starts at a random position on the map.
        int[] playerPosition = map.generateRandomMapPosition(true);

        // We handle the player position and interactions.
        handlePlayerPosition(map, player, playerPosition);

        // The game loop continues until the player runs out of lives or points.
        while (player.getLives() > 0 && player.getPoints() > 0) {
            // The player moves to a random position on the map.
            int[] newPosition = map.generateRandomMapPosition(true);

            // We handle the player position and interactions.
            handlePlayerPosition(map, player, newPosition);
        }
    }

    // This method handles the player position and interactions.
    private void handlePlayerPosition(Map map, Player player, int[] position) {

        // If the new position is occupied, we handle the player interaction.
        if (map.getMapItem(position[0], position[1]).isOccupied()) {
            MapItem mapItem = map.getMapItem(position[0], position[1]);
            mapItem.playerInteraction(player);

            // We update the player's old position as unoccupied and change the symbol to '_'.
            map.getMapItem(player.getPosition()[0], player.getPosition()[1]).setOccupied(false);
            map.getMapItem(player.getPosition()[0], player.getPosition()[1]).setSymbol('_');
        }

        // We update the player's position on the map.
        player.setPosition(position[0], position[1]);

        // We update the player's new position as occupied and set the symbol as 'P'.
        map.getMapItem(position[0], position[1]).setOccupied(true);
        map.setMapItem(position[0], position[1], player);
    }
}
