package workshop.time;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @ParameterizedTest
    @CsvSource({"3,13:26:00","4,13:26:01","60,13:26:57"})      //dane w formacie csv ktore beda podstawione do testu

    void addSeconds_secondsRotatedMinutes_minutesAreRotated(int secondsToAdd, String expectedTimeAsString) {
    Time t1 = new Time( 13,25,57);
    Time result = t1.addSeconds(secondsToAdd);
    Time expected = new Time (expectedTimeAsString);
    assertEquals(expected,result);

    }
}