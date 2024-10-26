package src.treasurehunt;

/**
 *
 * @author Mert Deniz Ertekin
 * @author Nuhan Berke Hallaç
 */

public class Treasure extends Booster {
    private int live;

    // Default constructor
    public Treasure() {
        super();
        this.live = 1;
    }

    // Copy constructor
    public Treasure(Treasure treasure) {
        super(treasure);
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
}
