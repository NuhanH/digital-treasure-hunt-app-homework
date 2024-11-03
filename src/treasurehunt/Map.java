package src.treasurehunt;

import java.util.ArrayList;

/**
 * @author Mert Deniz Ertekin
 * @author Nuhan Berke Hallaç
 * 
 * This class represents the map of the game. It contains the map items and the methods to interact with them.
 * The map is a 20x20 grid that contains the map items.
 */

public class Map {
    private ArrayList<ArrayList<MapItem>> map;
    private ArrayList<MapItem> mapItems;

    // Default constructor
    public Map() {
        this.map = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            ArrayList<MapItem> row = new ArrayList<>();
            for (int j = 0; j < 20; j++) {
                row.add(new MapItem(j, i, '_'));
            }
            this.map.add(row);
        }
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

    // This method returns a deep copy of the map.
    public ArrayList<ArrayList<MapItem>> getMap() {
        ArrayList<ArrayList<MapItem>> copyArrayList = new ArrayList<>();
        for (ArrayList<MapItem> row : map) {
            ArrayList<MapItem> newRow = new ArrayList<>();
            for (MapItem mapItem : row) {
                newRow.add(new MapItem(mapItem));
            }
            copyArrayList.add(newRow);
        }
        return copyArrayList;
    }

    public MapItem getMapItem(int x, int y) {
        return map.get(y).get(x);
    }

    public void setMapItem(int x, int y, MapItem mapItem) {
        map.get(y).set(x, mapItem);
        if (mapItem.getSymbol() != '_') {
            mapItem.setOccupied(true);
        }
    }

    public ArrayList<MapItem> getMapItems() {
        return mapItems;
    }

    public void setMapItems(ArrayList<MapItem> mapItems) {
        this.mapItems = mapItems;
    }

    public void removeMapItem(MapItem mapItem) {
        mapItems.remove(mapItem);
    }

    // Randomly generate a position for the map item and return it.
    public int[] generateRandomMapPosition(boolean isPlayer) {
        int x = (int) (Math.random() * 20);
        int y = (int) (Math.random() * 20);
        int[] position = new int[2];

        // Check if the position is occupied
        if (getMapItem(x, y).isOccupied() && !isPlayer) {
            position = generateRandomMapPosition(false);
        } else {
            position[0] = x;
            position[1] = y;
        }
        int[] copyPosition = new int[2];

        copyPosition[0] = position[0];
        copyPosition[1] = position[1];

        return copyPosition;
    }

    public void printMap() {
        for (ArrayList<MapItem> row : map) {
            for (MapItem mapItem : row) {
                System.out.print(mapItem.getSymbol() + " ");
            }
            System.out.println();
        }
    }

}
