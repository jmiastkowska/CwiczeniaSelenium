package p03array;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static p03array.Game.getDiagonals;

public class GameTest {
    PrintStream originalOut = System.out;
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void convertBoardToStringRepresentationAndPrintIt_boardIsEmpty_printStringAsWithinTemplation(){
        Game.board = new char[][]{
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };
       String boardStringRepresentation = Game.convertBoardToStringRepresentationAndPrintIt();
               String expectedRepresentation = "1:[ ,  ,  ]\n" +
                       "2:[ ,  ,  ]\n" +
                       "3:[ ,  ,  ]\n" +
                       "   1  2  3";
       assertEquals(expectedRepresentation, boardStringRepresentation);
    }
    @Test
    public void convertBoardToStringRepresentationAndPrintIt_SymbolInCorner_printStringAsWithinTemplation(){
        Game.board = new char[][]{
                {'X', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };
        String boardStringRepresentation = Game.convertBoardToStringRepresentationAndPrintIt();
        String expectedRepresentation = "1:[X,  ,  ]\n" +
                "2:[ ,  ,  ]\n" +
                "3:[ ,  ,  ]\n" +
                "   1  2  3";
        assertEquals(expectedRepresentation, boardStringRepresentation);
    }

    @Test
    public void getDiagonalsTest() {
        char[][] board = {
                {'X', 'O', 'X'},
                {'X', 'O', 'X'},
                {'O', 'O', 'O'}
        };
        String[] check = getDiagonals(board);
        String[] expected = new String[]{"XOO","XOO"};
        Assertions.assertArrayEquals(expected, check);
    }
    @Test
     public void checkIfFinishMessageIsDisplayed() {
        Game.board = new char[][]{
                {'X', 'O', 'X'},
                {'X', 'O', 'X'},
                {'O', 'O', 'O'}
        };

        System.out.println("Koniec gry. Zagrasz jeszcze raz?");
        String expectedMessage = "Koniec gry. Zagrasz jeszcze raz?";

        assertEquals(expectedMessage, outContent.toString().trim());
        }
}