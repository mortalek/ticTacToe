package projekcik.TicTacToe.Player;

import java.awt.*;

public class Player {
    String username;
    String shape;
    Point coords = new Point();

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

    public Point getCoords() {
        return coords;
    }

    public void setCoords(int x, int y) { coords.move(x,y);
    }
}
