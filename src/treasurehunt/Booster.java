package src.treasurehunt;

/**
 * @author Mert Deniz Ertekin
 * @author Nuhan Berke Hallaç
 */

public class Booster extends MapItem {
    // Default constructor
    public Booster() {
        super();
    }

    // Copy constructor
    public Booster(Booster booster) {
        super(booster);
    }

    // Parameterized constructor
    public Booster(int x, int y, char symbol) {
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
