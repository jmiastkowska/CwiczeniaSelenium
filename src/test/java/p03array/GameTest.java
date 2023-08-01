package p03array;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;
import static p03array.Game.getDiagonals;

public class GameTest {

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
    
}