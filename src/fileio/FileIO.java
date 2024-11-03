/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package src.fileio;

import java.io.FileWriter;
import java.io.IOException;
import src.treasurehunt.Score;
import src.treasurehunt.Scoreboard;

/**
 * @author mertdenizertekin
 * @author nuhanberkehallac
 */
public class FileIO {
    // In this class, we implement the file writing operations.
    public void writeFile(String filePath, Scoreboard scoreboard) {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("Score,Old Position,New Position\n");
            for (Score score : scoreboard.getScores()) {
                writer.write(score.toString() + "\n");
            }
        } catch (IOException e) {
            System.err.println("An error occurred while saving the scoreboard to a file.");
        }
    }
}
