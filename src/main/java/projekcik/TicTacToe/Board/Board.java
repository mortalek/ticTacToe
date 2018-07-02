package projekcik.TicTacToe.Board;

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
}
