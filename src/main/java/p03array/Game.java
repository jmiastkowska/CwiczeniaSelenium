package p03array;

import java.util.Arrays;
import java.util.Scanner;

public class Game {
    static char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

static char currentSymbol = 'X';

    public static void printBoard(){
        for (int row=0; row<board.length; row++){
            System.out.println((row+1)+ ":"+(Arrays.toString(board[row])));
        }
        System.out.println("   1  2  3");
    }

    public static void move(){
        System.out.println("Runda "+ currentSymbol);
        Scanner sc = new Scanner(System.in);
        System.out.println("Wpisz numer wiersza");
        int rowNo = sc.nextInt();
        System.out.println("Wpisz numer kolumny");
        int colNo = sc.nextInt();
        board[rowNo-1][colNo-1]=currentSymbol;
        //2currentSymbol = przeciwnySymbol;
        if(currentSymbol=='X'){
            currentSymbol='O';
        }else{
            currentSymbol='X';
        }
    }



    public static void main(String[] args) {
      //  int wiek = readInt( "Podaj wiek");

        printBoard();
        move();
        printBoard();
        move();
        printBoard();
    }
}
