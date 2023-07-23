package p03array;

import java.util.Arrays;

public class Game {
    static char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };




    public static void printBoard(){
        for (int row=0; row<board.length; row++){
            System.out.println((row+1)+ ":"+(Arrays.toString(board[row])));
        }
        System.out.println("   1  2  3");
    }
    public static void main(String[] args) {
      //  int wiek = readInt( "Podaj wiek");

printBoard();
    }
}
