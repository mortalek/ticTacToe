package projekcik.TicTacToe.Board;

import projekcik.TicTacToe.Constants.Constants;
import projekcik.TicTacToe.Player.Player;

import java.awt.*;

public class Board {
    String[][] board = new String[3][3];

    public Board() {

    }

    public void printBoard() {
        for (int i = 0; i < board.length; i++) {
        	for(int j = 0; j < board[i].length; j++) {
        	    board[i][j] = " ";
                System.out.print(board[i][j] + " |");
            }
            System.out.println();
        }
    }

    public boolean fillBoard(Point playerCoords, String playerShape) {
        int coordX = (int) playerCoords.getX();
        int coordY = (int) playerCoords.getY();
        if(coordX >= 0 && coordX <= 2 && coordY >= 0 && coordY <= 2) {
                board[coordX][coordY] = playerShape;
        }
        return true;
    }

    public String[][] getBoard() {
        return board;
    }

    public void setBoard(String[][] board) {
        this.board = board;
    }
}
