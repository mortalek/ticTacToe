package projekcik;

import projekcik.TicTacToe.Player.Player;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ticTacToeMain {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Player player = new Player();
        System.out.print("Enter your nickname: ");
            try {
               player.setUsername(br.readLine());

            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Your NICKNAME is: " + player.getUsername() + "!");
            System.out.println("Choose either Noughts or Crosses( O or X )");
            try {
                player.setShape(br.readLine());

            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Your choice: " + player.getShape() + "!");
    }
}