package src.treasurehunt;

/**
 * @author Mert Deniz Ertekin
 * @author Nuhan Berke Hallaç
 */

public class MapItem {
    private char symbol;
    private int x;
    private int y;
    private boolean isOccupied;

    // Default constructor
    public MapItem() {
        this.x = 0;
        this.y = 0;
        this.symbol = '_';
        this.isOccupied = false;
    }

    // Copy constructor
    public MapItem(MapItem mapItem) {
        this.x = mapItem.x;
        this.y = mapItem.y;
        this.symbol = mapItem.symbol;
        this.isOccupied = mapItem.isOccupied;
    }

    // Parameterized constructor
    public MapItem(int x, int y, char symbol) {
        this.x = x;
        this.y = y;
        this.symbol = symbol;
        this.isOccupied = false;
    }

    // Getters and setters

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    
}
