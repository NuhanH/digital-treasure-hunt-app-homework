package src.treasurehunt;

/**
 * @author Mert Deniz Ertekin
 * @author Nuhan Berke Hallaç
 */

public class Mushroom extends Breaker{
    private int point;

    // Default constructor
    public Mushroom() {
        super(0, 0, 'M');
        this.point = -20;
    }

    // Copy constructor
    public Mushroom(Mushroom mushroom) {
        super(mushroom);
    }

    // Parameterized constructor
    public Mushroom(int x, int y) {
        super(x, y, 'M');
        this.point = -20;
    }

    // Getters and setters

    public int getPoint() {
        return point;
    }
}
