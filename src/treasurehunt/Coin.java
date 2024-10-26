package src.treasurehunt;

/**
 * @author Mert Deniz Ertekin
 * @author Nuhan Berke Hallaç
 */

public class Coin extends Booster {
    private int point;

    // Default constructor
    public Coin() {
        super(0, 0, 'C');
        point = 5;
    }

    // Copy constructor
    public Coin(Coin coin) {
        super(coin);
        this.point = coin.point;
    }

    // Parameterized constructor
    public Coin(int x, int y) {
        super(x, y, 'C');
        this.point = 5;
    }

    // Getters and setters

    public int getPoint() {
        return point;
    }
}
