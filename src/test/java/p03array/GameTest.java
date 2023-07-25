package p03array;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

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
}