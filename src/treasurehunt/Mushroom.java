package src.treasurehunt;

/**
 * @author Mert Deniz Ertekin
 * @author Nuhan Berke Hallaç
 */

public class Mushroom extends Breaker{
    // Default constructor
    public Mushroom() {
        super();
    }

    // Copy constructor
    public Mushroom(Mushroom mushroom) {
        super(mushroom);
    }

    // Parameterized constructor
    public Mushroom(int x, int y, char symbol) {
        super(x, y, symbol);
    }
}
