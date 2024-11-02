package src.treasurehunt;

/**
 * @author Mert Deniz Ertekin
 * @author Nuhan Berke Hallaç
 */

public class Frog extends MapItem {
    private int live;

    // Default constructor
    public Frog() {
        super();
        this.live = -1;
    }

    // Copy constructor
    public Frog(Frog frog) {
        super(frog);
    }

    // Parameterized constructor
    public Frog(int x, int y) {
        super(x, y, 'F');
        this.live = -1;
    }

    // Getters and setters

    public int getLive() {
        return live;
    }

    @Override
    // This method is called when a player interacts with a frog and removes a life from the player.
    public void playerInteraction(Player player) {
        player.removeLives(getLive());
    }
}
