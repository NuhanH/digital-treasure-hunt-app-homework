package src.treasurehunt;

/**
 * @author Mert Deniz Ertekin
 * @author Nuhan Berke Hallaç
 * 
 * Represents a frog item on the map that a player can interact with to lose lives.
 */

public class Frog extends Breaker {
    private int live;

    // Default constructor
    public Frog() {
        super(0, 0, 'F');
        this.live = 1;
    }

    // Copy constructor
    public Frog(Frog frog) {
        super(frog);
        this.live = frog.live;
    }

    // Parameterized constructor
    public Frog(int x, int y) {
        super(x, y, 'F');
        this.live = 1;
    }

    // This method returns the live value of the frog.
    public int getLive() {
        return live;
    }

    @Override
    // This method is called when a player interacts with a frog and removes a life from the player.
    public void playerInteraction(Player player) {
        player.removeLives(getLive());

        if (player.getLives() < 0) {
            player.setLives(0);
        }
    }
}
