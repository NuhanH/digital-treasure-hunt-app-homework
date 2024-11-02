package src.treasurehunt;

/**
 *
 * @author Mert Deniz Ertekin
 * @author Nuhan Berke Hallaç
 */

public class Treasure extends MapItem {
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

    // Getters and setters

    public int getLive() {
        return live;
    }

    // This method is called when a player interacts with a treasure and adds a live to the player.
    @Override
    public void playerInteraction(Player player) {
        player.addLives(getLive());
    }
}
