package p04_oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointUtilsTest {

    @Test
    void mirrorPointAxis() {
        Point p1 = new Point(3,4);
        Point result = PointUtils.mirrorPointXAxis(p1);
        Point expected= new Point(-3,4);
        assertEquals(expected, result);
        //assertTrue(expected.equals(result));
    }


}