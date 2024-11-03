package src.treasurehunt;

public class Score {
    private int score;
    private int[] oldPosition;
    private int[] newPosition;

    // Default constructor
    public Score() {
        this.score = 0;
        this.oldPosition = new int[2];
        this.newPosition = new int[2];
    }

    // Copy constructor
    public Score(Score score) {
        this.score = score.score;
        this.oldPosition = score.oldPosition;
        this.newPosition = score.newPosition;
    }

    // Parameterized constructor
    public Score(int score, int[] oldPosition, int[] newPosition) {
        this.score = score;
        this.oldPosition = oldPosition;
        this.newPosition = newPosition;
    }

    // Getters and setters

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int[] getOldPosition() {
        int[] copyPosition = new int[2];
        copyPosition[0] = oldPosition[0];
        copyPosition[1] = oldPosition[1];

        return copyPosition;
    }

    public void setOldPosition(int[] oldPosition) {
        this.oldPosition = oldPosition;
    }

    public int[] getNewPosition() {
        int[] copyPosition = new int[2];
        copyPosition[0] = newPosition[0];
        copyPosition[1] = newPosition[1];

        return copyPosition;
    }

    public void setNewPosition(int[] newPosition) {
        this.newPosition = newPosition;
    }

    public String toString() {
        return score + "," + "(" + oldPosition[0] + "," + oldPosition[1] + "),(" + newPosition[0] + "," + newPosition[1] + ")";
    }

}
