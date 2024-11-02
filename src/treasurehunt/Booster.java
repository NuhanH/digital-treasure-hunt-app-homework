package src.treasurehunt;

import java.util.ArrayList;

/**
 * @author Mert Deniz Ertekin
 * @author Nuhan Berke Hallaç
 */

public class Booster extends MapItem {
    private ArrayList<MapItem> boosterItems;

    // Default constructor
    public Booster() {
        super(0, 0, 'O');
        this.boosterItems = new ArrayList<>();

        // Add booster items
        this.boosterItems.add(new Diamond());
        this.boosterItems.add(new Coin());
        this.boosterItems.add(new Treasure());
    }

    // Copy constructor
    public Booster(Booster booster) {
        super(booster);
        this.boosterItems = new ArrayList<>();

        for (MapItem item : booster.boosterItems) {
            this.boosterItems.add(item);
        }
    }

    // Parameterized constructor
    public Booster(int x, int y) {
        super(x, y, 'O');
        this.boosterItems = new ArrayList<>();

        // Add booster items
        this.boosterItems.add(new Diamond());
        this.boosterItems.add(new Coin());
        this.boosterItems.add(new Treasure());
    }

    // Getters and setters

    // Get booster items array list.
    public ArrayList<MapItem> getBoosterItems() {
        return this.boosterItems;
    }

    /*  This method is called when a player interacts with a booster and calls the 
     *  playerInteraction method of each booster item. 
     */
    @Override
    public void playerInteraction(Player player) {
        for (MapItem item : this.boosterItems) {
            item.playerInteraction(player);
        }

    }
}
