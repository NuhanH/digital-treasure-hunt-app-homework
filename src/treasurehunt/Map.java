package src.treasurehunt;

import java.util.ArrayList;

/**
 * @author Mert Deniz Ertekin
 * @author Nuhan Berke Hallaç
 */

public class Map {
    private ArrayList<ArrayList<MapItem>> map;

    // Default constructor
    public Map() {
        this.map = new ArrayList<>();
    }
    
    // Copy constructor
    public Map(Map map) {
        this.map = new ArrayList<>();
        for (ArrayList<MapItem> row : map.map) {
            ArrayList<MapItem> newRow = new ArrayList<>();
            for (MapItem mapItem : row) {
                newRow.add(new MapItem(mapItem));
            }
            this.map.add(newRow);
        }
    }

    // Parameterized constructor
    public Map(ArrayList<ArrayList<MapItem>> map) {
        this.map = new ArrayList<>();
        for (ArrayList<MapItem> row : map) {
            ArrayList<MapItem> newRow = new ArrayList<>();
            for (MapItem mapItem : row) {
                newRow.add(new MapItem(mapItem));
            }
            this.map.add(newRow);
        }
    }

    // Getters and setters

    public ArrayList<ArrayList<MapItem>> getMap() {
        return map;
    }

    public MapItem getMapItem(int x, int y) {
        return map.get(y).get(x);
    }

    public void setMapItem(int x, int y, MapItem mapItem) {
        map.get(y).set(x, mapItem);
    }



}
