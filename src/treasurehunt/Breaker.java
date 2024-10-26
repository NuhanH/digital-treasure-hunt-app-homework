package src.treasurehunt;

/**
 * @author Mert Deniz Ertekin
 * @author Nuhan Berke Hallaç
 */

public class Breaker extends MapItem{
    // Default constructor
    public Breaker() {
        super();
    }

    // Copy constructor
    public Breaker(Breaker breaker) {
        super(breaker);
    }

    // Parameterized constructor
    public Breaker(int x, int y, char symbol) {
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
