package src.digitaltreasurehuntapp;

import src.fileio.FileIO;
import src.treasurehunt.GameManager;
import src.treasurehunt.Map;
import src.treasurehunt.Scoreboard;

/**
 * @author Mert Deniz Ertekin
 * @author Nuhan Berke Hallac
 * 
 * The DigitalTreasureHuntApp class serves as the entry point for the Digital Treasure Hunt application. 
 * 
 * The main method initializes the game by creating instances of GameManager, Map, Scoreboard, and FileIO.
 * It then starts the game loop, writes the scoreboard to a txt file, and retrieves the highest score.
 * 
 */

public class DigitalTreasureHuntApp {
    
    public static void main(String[] args) {
        GameManager gameManager = new GameManager();
        Map map = gameManager.generateDefaultMap();
        Scoreboard scoreboard = new Scoreboard();
        FileIO fileIO = new FileIO();

        gameManager.gameLoop(map, scoreboard);
        fileIO.writeFile("resources/scoreboard.txt", scoreboard);
        scoreboard.getHighestScore();
    }
}
