package src.treasurehunt;

import java.util.ArrayList;

/**
 * @author Mert Deniz Ertekin
 * @author Nuhan Berke Hallaç
 * 
 * The Breaker class represents a MapItem containing multiple breaker items like Frog and Mushroom.
 * It provides constructors for initialization and a method to interact with a player by 
   invoking each breaker item's interaction.
 */

public class Breaker extends MapItem{
    private ArrayList<MapItem> breakerItems;

    // Default constructor
    public Breaker() {
        super(0, 0, 'X');

        this.breakerItems = new ArrayList<>();

        // Add breaker items
        this.breakerItems.add(new Frog());
        this.breakerItems.add(new Mushroom());
    }

    // Copy constructor
    public Breaker(Breaker breaker) {
        super(breaker);
        this.breakerItems = new ArrayList<>();

        for (MapItem item : breaker.breakerItems) {
            this.breakerItems.add(item);
        }
    }

    // Parameterized constructor
    public Breaker(int x, int y, char symbol) {
        super(x, y, symbol);
        
        // Add breaker items
        if (symbol == 'X') {
            this.breakerItems = new ArrayList<>();
            this.breakerItems.add(new Frog());
            this.breakerItems.add(new Mushroom());
        }
    }

    // Getters and setters

    // Get breaker items array list.
    public ArrayList<MapItem> getBreakerItems() {
        return this.breakerItems;
    }

    /*  This method is called when a player interacts with a breaker and calls the 
     *  playerInteraction method of each breaker item. 
     */
    @Override
    public void playerInteraction(Player player) {
        for (MapItem item : this.breakerItems) {
            item.playerInteraction(player);
        }

        if(player.getPoints() < 0){
            player.setPoints(0);
        }

        if(player.getLives() < 0){
            player.setLives(0);
        }
    }
}
