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


    public static String convertBoardToStringRepresentationAndPrintIt(){
        String boardAsString = "";
        for (int row=0; row<board.length; row++){
            boardAsString += (row+1)+ ":"+ Arrays.toString(board[row])+"\n";
        }
        boardAsString += "   1  2  3";
        System.out.println(boardAsString);
        return boardAsString;
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
    public static void wyswietlPlansze() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
  public static boolean isGameFinished(){
       for (int i=0; i<3; i++){
           for (int j=0; j<3; j++){
               if(board[i][j] == ' '){
                   return false;
               }
           }
       }

       System.out.println("Koniec gry. Zagrasz jeszcze raz?");
    return false;
    }

    public static String[] getDiagonals(char [][] board) {
        String[] diagonals = new String[2];
        diagonals[0] = String.valueOf(board[0][0]) + String.valueOf(board[1][1] + String.valueOf(board[2][2]));
        diagonals[1] = String.valueOf(board[0][2]) + String.valueOf(board[1][1]+ String.valueOf(board[2][0]));
        return diagonals;
    }


    public static void main(String[] args) {
      //  int wiek = readInt( "Podaj wiek");

      /*  printBoard();
        move();
        printBoard();
        move();
        printBoard();
        ale mozna petle for aby byla kontrola konca wypelniania
       */

       for(int i=0; i<9;i++){
           convertBoardToStringRepresentationAndPrintIt();
           move();
           wyswietlPlansze();
           isGameFinished();
       }
    }
}
