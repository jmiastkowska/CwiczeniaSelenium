package p03array;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    public void convertBoardToStringRepresentationAndPrintIt_boardIsEmpty_printStringAsWithinTemplation(){
       String boardStringRepresentation = Game.convertBoardToStringRepresentationAndPrintIt();
               String expectedRepresentation = "1:[ ,  ,  ]\n" +
                       "2:[ ,  ,  ]\n" +
                       "3:[ ,  ,  ]\n" +
                       "   1  2  3";
       assertEquals(expectedRepresentation, boardStringRepresentation);
    }

}