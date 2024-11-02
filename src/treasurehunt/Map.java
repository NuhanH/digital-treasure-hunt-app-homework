package src.treasurehunt;

import java.util.ArrayList;

/**
 * @author Mert Deniz Ertekin
 * @author Nuhan Berke Hallaç
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

    public ArrayList<ArrayList<MapItem>> getMap() {
        return map;
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
    
    // In this method, we generate random map items and place them to the mapItems array list and return it.
    public ArrayList<MapItem> generateMapItems() {
       
        // Generate random map items
        mapItems = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Coin coin = new Coin(); 
            mapItems.add(coin);
        }

        for (int i = 0; i < 5; i++) {
            Diamond diamond = new Diamond();
            mapItems.add(diamond);
        }

        for (int i = 0; i < 2; i++) {
            Treasure treasure = new Treasure();
            mapItems.add(treasure);
        }

        for (int i = 0; i < 2; i++) {
            Frog frog = new Frog();
            mapItems.add(frog);
        }

        for (int i = 0; i < 5; i++) {
            Mushroom mushroom = new Mushroom();
            mapItems.add(mushroom);
        }

            Breaker breaker = new Breaker();
            mapItems.add(breaker);

            Booster booster = new Booster();
            mapItems.add(booster);

        return mapItems;

    }

    public ArrayList<MapItem> getMapItems() {
        return mapItems;
    }

    // Randomly generate a position for the map item and return it.
    public int[] generateRandomMapPosition(boolean isPlayer) {
        int x = (int) (Math.random() * 20);
        int y = (int) (Math.random() * 20);
        int[] position = new int[2];

        // Check if the position is occupied
        boolean isOccupied = getMapItem(x, y).isOccupied();
        if (getMapItem(x, y).isOccupied() && !isPlayer) {
            position = generateRandomMapPosition(false);
        } else {
            position[0] = x;
            position[1] = y;
        }

        return position;
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
