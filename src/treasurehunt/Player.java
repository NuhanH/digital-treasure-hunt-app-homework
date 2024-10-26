package src.treasurehunt;

/**
 * @author Mert Deniz Ertekin
 * @author Nuhan Berke Hallaç
 */

public class Player extends MapItem {
    // Default constructor
    public Player() {
        super();
    }

    // Copy constructor
    public Player(Player player) {
        super(player);
    }

    // Parameterized constructor
    public Player(int x, int y, char symbol) {
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
