package src.treasurehunt;

/**
 * @author Mert Deniz Ertekin
 * @author Nuhan Berke Hallaç
 */

public class MapItem {
    private char symbol;
    private boolean isOccupied;
    private int[] mapPosition = new int[2]; /** We used an array to store the position of the map item 
                                             *as index 0 for x and index 1 for y.
                                             */

    // Default constructor
    public MapItem() {
        mapPosition[0] = 0;
        mapPosition[1] = 0;
        this.symbol = '_';
        this.isOccupied = false;
    }

    // Copy constructor
    public MapItem(MapItem mapItem) {
        mapPosition[0] = mapItem.mapPosition[0];
        mapPosition[1] = mapItem.mapPosition[1];
        this.symbol = mapItem.symbol;
        this.isOccupied = mapItem.isOccupied;
    }

    // Parameterized constructor
    public MapItem(int x, int y, char symbol) {
        mapPosition[0] = x;
        mapPosition[1] = y;
        this.symbol = symbol;

        this.isOccupied = true;
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

    public int[] getPosition() {
        return mapPosition;
    }

    public void setPosition(int x, int y) {
        mapPosition[0] = x;
        mapPosition[1] = y;
    }



    
}
