package src.treasurehunt;

/**
 * @author Mert Deniz Ertekin
 * @author Nuhan Berke Hallaç
 */

public class MapItem {
    private char symbol;
    private int x;
    private int y;

    // Default constructor
    public MapItem() {
        this.x = 0;
        this.y = 0;
        this.symbol = ' ';
    }

    // Copy constructor
    public MapItem(MapItem mapItem) {
        this.x = mapItem.x;
        this.y = mapItem.y;
        this.symbol = mapItem.symbol;
    }

    // Parameterized constructor
    public MapItem(int x, int y, char symbol) {
        this.x = x;
        this.y = y;
        this.symbol = symbol;
    }
}
