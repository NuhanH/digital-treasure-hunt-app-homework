package src.treasurehunt;

/**
 * @author Mert Deniz Ertekin
 * @author Nuhan Berke Hallaç
 */

public class Player extends MapItem {
    private int points;
    private int lives;

    // Default constructor
    public Player() {
        super(0, 0, 'P');
        this.points = 100;
        this.lives = 2;
    }

    // Copy constructor
    public Player(Player player) {
        super(player);
        this.points = player.points;
        this.lives = player.lives;
    }

    // Parameterized constructor
    public Player(int x, int y) {
        super(x, y, 'P');
        this.points = 100;
        this.lives = 2;
    }

    // Getters and setters

    public int getPoints() {
        return points;
    }

    public void addPoints(int points) {
        this.points += points;
    }   

    public void removePoints(int points) {
        this.points -= points;
    }

    public int getLives() {
        return lives;
    }

    public void addLives(int lives) {
        this.lives += lives;
    }

    public void removeLives(int lives) {
        this.lives -= lives;
    }
}
