package src.fileio;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import src.treasurehunt.Score;

public class Scoreboard {
    private ArrayList<Score> scores;

    // Default constructor
    public Scoreboard() {
        scores = new ArrayList<Score>();
    }

    // Copy constructor
    public Scoreboard(ArrayList<Score> scores) {
        this.scores = scores;
    }

    // Parameterized constructor
    public Scoreboard(Scoreboard scoreboard) {
        this.scores = scoreboard.scores;
    }

    // Getters and Setters

    public void addScore(Score score) {
        scores.add(score);
    }

    public ArrayList<Score> getScores() {
        return scores;
    }

    public void saveToFile(String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("Score, Old Position, New Position\n");
            for (Score score : scores) {
                writer.write(score.toString() + "\n");
            }
        } catch (IOException e) {
            System.err.println("An error occurred while saving the scoreboard to a file.");
        }
    }

    public void getHighestScore () {
        int highestScore = 0;
        for (Score score : scores) {
            if (score.getScore() > highestScore) {
                highestScore = score.getScore();
            }
        }
        System.out.println("The highest score is: " + highestScore);
    }
}
