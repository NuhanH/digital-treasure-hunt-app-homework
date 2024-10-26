package src.treasurehunt;

/**
 * @author Mert Deniz Ertekin
 * @author Nuhan Berke Hallaç
 */

public class Frog extends Breaker{
    // Default constructor
    public Frog() {
        super();
    }

    // Copy constructor
    public Frog(Frog frog) {
        super(frog);
    }

    // Parameterized constructor
    public Frog(int x, int y, char symbol) {
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
