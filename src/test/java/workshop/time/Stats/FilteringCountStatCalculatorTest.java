package workshop.time.Stats;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilteringCountStatCalculatorTest {

    private int[]dataForAllTheTests;
    @BeforeEach
    public void prepare(){
        dataForAllTheTests = new int[]{5, 10, 15, 20};
    }

    @Test
    void calculate_givenOddIntTester_countOddValuesOnly(){

        FilteringCountStatCalculator oddCountCalculator =new FilteringCountStatCalculator( n -> n%2==0,"odd_count");
    Statistic result = oddCountCalculator.calculate(dataForAllTheTests);
    Statistic expected = new Statistic("odd_count", 2.);
    assertEquals(expected, result);
    }

    @Test
    void calculate_givenEvenIntTester_countOddValuesOnly(){

        FilteringCountStatCalculator oddCountCalculator =new FilteringCountStatCalculator( n -> n%2==0,"even_count");
        Statistic result = oddCountCalculator.calculate(dataForAllTheTests);
        Statistic expected = new Statistic("even_count", 2.);
        assertEquals(expected, result);
    }

}