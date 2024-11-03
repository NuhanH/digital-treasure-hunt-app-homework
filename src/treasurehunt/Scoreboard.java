package src.treasurehunt;

import java.util.ArrayList;

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
