package projekcik;

import projekcik.TicTacToe.Board.Board;
import projekcik.TicTacToe.Player.Player;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ticTacToeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        Board board = new Board();

        System.out.print("Enter your nickname: ");
        player.setUsername(scanner.next());
        System.out.println("Your NICKNAME is: " + player.getUsername() + "!");

        System.out.println("Choose either Noughts or Crosses( O or X )");
        player.setShape(scanner.next());

        System.out.println("Your choice: " + player.getShape() + "!");
        board.printBoard();

        System.out.println("Enter coords: ");
        player.setCoords(scanner.nextInt());

    }
}