package src.treasurehunt;

/**
 *
 * @author Mert Deniz Ertekin
 * @author Nuhan Berke Hallaç
 * 
 * Represents a treasure item on the map that a player can interact with to gain lives.
 */

public class Treasure extends Booster {
    private int live;

    // Default constructor
    public Treasure() {
        super(0, 0, 'T');
        this.live = 1;
    }

    // Copy constructor
    public Treasure(Treasure treasure) {
        super(treasure);
        this.live = treasure.live;
    }

    // Parameterized constructor
    public Treasure(int x, int y) {
        super(x, y, 'T');
        this.live = 1;
    }

    // This method returns the live value of the treasure.
    public int getLive() {
        return live;
    }

    // This method is called when a player interacts with a treasure and adds a live to the player.
    @Override
    public void playerInteraction(Player player) {
        player.addLives(getLive());
    }
}
