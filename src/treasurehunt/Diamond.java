package src.treasurehunt;

/**
 * @author Mert Deniz Ertekin
 * @author Nuhan Berke Hallaç
 */

public class Diamond extends MapItem {
    private int point;

    // Default constructor
    public Diamond() {
        super(0, 0, 'D');
        point = 10;
    }

    // Copy constructor
    public Diamond(Diamond diamond) {
        super(diamond);
        this.point = diamond.point;
    }

    // Parameterized constructor
    public Diamond(int x, int y) {
        super(x, y, 'D');
        this.point = 10;
    }

    public int getPoint() {
        return point;
    }

    // This method is called when a player interacts with a diamond and adds points to the player.
    @Override
    public void playerInteraction(Player player) {
        player.addPoints(getPoint());

    }
}
