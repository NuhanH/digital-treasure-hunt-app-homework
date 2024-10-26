package src.treasurehunt;

/**
 * @author Mert Deniz Ertekin
 * @author Nuhan Berke Hallaç
 */

public class Player extends MapItem {

    // Default constructor
    public Player() {
        super(0, 0, 'P');
    }

    // Copy constructor
    public Player(Player player) {
        super(player);
    }

    // Parameterized constructor
    public Player(int x, int y) {
        super(x, y, 'P');
    }

    // Getters and setters

}
