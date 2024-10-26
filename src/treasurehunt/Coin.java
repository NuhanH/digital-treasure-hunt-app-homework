package src.treasurehunt;

/**
 * @author Mert Deniz Ertekin
 * @author Nuhan Berke Hallaç
 */

public class Coin extends Booster {

    // Default constructor
    public Coin() {
        super();
    }

    // Copy constructor
    public Coin(Coin coin) {
        super(coin);
    }

    // Parameterized constructor
    public Coin(int x, int y, char symbol) {
        super(x, y, symbol);
    }

    // Getters and setters

    public char getSymbol() {
        return super.getSymbol();
    }

    public void setSymbol(char symbol) {
        super.setSymbol(symbol);
    }
}
