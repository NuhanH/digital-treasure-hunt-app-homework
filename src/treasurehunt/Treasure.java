package src.treasurehunt;

/**
 *
 * @author Mert Deniz Ertekin
 * @author Nuhan Berke Hallaç
 */

public class Treasure extends Booster {
    // Default constructor
    public Treasure() {
        super();
    }

    // Copy constructor
    public Treasure(Treasure treasure) {
        super(treasure);
    }

    // Parameterized constructor
    public Treasure(int x, int y, char symbol) {
        super(x, y, symbol);
    }
}
