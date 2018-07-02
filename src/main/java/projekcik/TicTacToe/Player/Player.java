package projekcik.TicTacToe.Player;

public class Player {
    String username;
    String shape;
    int coords;

    public Player() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getCoords() {
        return coords;
    }

    public void setCoords(int coords) {
        this.coords = coords;
    }
}
