package src.treasurehunt;

import java.util.ArrayList;

/**
 * @author Mert Deniz Ertekin
 * @author Nuhan Berke Hallaç
 *
 * In this class, we implement the game manager. 
 * The game manager is responsible for generating the default map,
   handling the game loop, and player interactions.
 * The game manager is also responsible for managing the game's logic and flow.
 */
public class GameManager {

    // In this method, we generate a default map with default map items.
    public Map generateDefaultMap() {
        Map map = new Map();
        ArrayList<MapItem> mapItems = map.generateMapItems();

    // We randomly place the map items on the map.
        for (MapItem mapItem : mapItems) {
            int[] position;

            // We ensure that the map item is placed on an empty position.
            do {
                position = map.generateRandomMapPosition(false);
            } while (map.getMapItem(position[0], position[1]).isOccupied());

            // We set the map item's position and set it as occupied.
            mapItem.setPosition(position[0], position[1]);
            mapItem.setOccupied(true);
            map.setMapItem(position[0], position[1], mapItem);
        }
        return map;
    }

    // In this method, we implement the game loop.
    public void gameLoop(Map map, Scoreboard scoreboard) {
    
        Player player = new Player();

        // The player starts at a random position on the map.
        int[] playerPosition = map.generateRandomMapPosition(true);

        // We handle the player position and interactions.
        handlePlayerPosition(map, player, playerPosition, scoreboard);

        // The game loop continues until the player runs out of lives or points.
        while (player.getLives() > 0 && player.getPoints() > 0 && map.getMapItems().size() > 0) {
            // The player moves to a random position on the map.
            int[] newPosition = map.generateRandomMapPosition(true);

            // We handle the player position and interactions.
            handlePlayerPosition(map, player, newPosition, scoreboard);

            // We print the map.
            System.out.println();
            map.printMap();
        }
    }

    // This method handles the player position and interactions.
    private void handlePlayerPosition(Map map, Player player, int[] position, Scoreboard scoreboard) {

        // If the player's position is not set, we set it to a new position. 
        if (player.getPosition()[0] == -1 || player.getPosition()[1] == -1) {
            player.setPosition(position[0], position[1]);
        }

        // We create a copy of the player to keep track of the old position.
        Player copyPlayer = new Player(player);
        int[] oldPosition = copyPlayer.getPosition();

        // If the new position is occupied, we handle the player interaction.
        if (map.getMapItem(position[0], position[1]).isOccupied()) {
            MapItem mapItem = map.getMapItem(position[0], position[1]);

            // We handle the player interaction, remove the map item and 
            // update the position with an empty map item to prepare for adding the player later
            mapItem.playerInteraction(player);
            map.removeMapItem(mapItem);
            map.setMapItem(position[0], position[1], new MapItem());
            map.getMapItem(position[0], position[1]).setPosition(position[0], position[1]);

            // We create a score object and add it to the scoreboard.
            Score score = handleScore(copyPlayer, oldPosition, position);
            scoreboard.addScore(score);
        }

        // We update the player's position on the map.
        player.setPosition(position[0], position[1]);
        Player newPlayer = new Player(player);

        // We update the player's old position as empty map item.
        map.setMapItem(oldPosition[0], oldPosition[1], new MapItem());
        map.getMapItem(oldPosition[0], oldPosition[1]).setPosition(oldPosition[0], oldPosition[1]);

        // We update the player's new position as occupied and set the player on the map.
        map.getMapItem(position[0], position[1]).setOccupied(true);
        map.setMapItem(position[0], position[1], newPlayer);
    }

    // This method creates a score object based on the player's points and positions and returns it.
    private Score handleScore(Player player, int[] oldPosition, int[] newPosition) {
        Score score = new Score();
        score.setScore(player.getPoints());
        score.setOldPosition(oldPosition);
        score.setNewPosition(newPosition);

        return score;
    }
}
