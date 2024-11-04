package src.treasurehunt;

/**
 * @author Mert Deniz Ertekin
 * @author Nuhan Berke Hallaç
 * 
 *  Represents a coin item on the map that a player can interact with to gain points.
 */

public class Coin extends Booster {
    private int point;

    // Default constructor
    public Coin() {
        super(0, 0, 'C');
        point = 5;
    }

    // Copy constructor
    public Coin(Coin coin) {
        super(coin);
        this.point = coin.point;
    }

    // Parameterized constructor
    public Coin(int x, int y) {
        super(x, y, 'C');
        this.point = 5;
    }

    // This method returns the point value of the coin.
    public int getPoint() {
        return point;
    }

    // This method is called when a player interacts with a coin and adds points to the player.
    @Override
    public void playerInteraction(Player player) {
        player.addPoints(getPoint());

    }

}
