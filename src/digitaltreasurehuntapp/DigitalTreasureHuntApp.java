package src.digitaltreasurehuntapp;

import src.fileio.FileIO;
import src.treasurehunt.GameManager;
import src.treasurehunt.Map;
import src.treasurehunt.Scoreboard;

/**
 * @author Mert Deniz Ertekin
 * @author Nuhan Berke Hallac
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
