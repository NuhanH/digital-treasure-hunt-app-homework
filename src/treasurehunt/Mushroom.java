package src.treasurehunt;

/**
 * @author Mert Deniz Ertekin
 * @author Nuhan Berke Hallaç
 * 
 * Represents a mushroom item on the map that a player can interact with to lose points.
 */

public class Mushroom extends Breaker {
    private int point;

    // Default constructor
    public Mushroom() {
        super(0, 0, 'M');
        this.point = 20;
    }

    // Copy constructor
    public Mushroom(Mushroom mushroom) {
        super(mushroom);
        this.point = mushroom.point;
    }

    // Parameterized constructor
    public Mushroom(int x, int y) {
        super(x, y, 'M');
        this.point = 20;
    }

    // This method returns the point value of the mushroom.
    public int getPoint() {
        return point;
    }

    // This method is called when a player interacts with a mushroom and adds points to the player.
    @Override
    public void playerInteraction(Player player) {
        player.removePoints(getPoint());
        if (player.getPoints() < 0) {
            player.setPoints(0);
        }
    }
}
