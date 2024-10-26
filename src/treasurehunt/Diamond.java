package src.treasurehunt;

/**
 * @author Mert Deniz Ertekin
 * @author Nuhan Berke Hallaç
 */

public class Diamond extends Booster {

    // Default constructor
    public Diamond() {
        super();
    }

    // Copy constructor
    public Diamond(Diamond diamond) {
        super(diamond);
    }

    // Parameterized constructor
    public Diamond(int x, int y, char symbol) {
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
