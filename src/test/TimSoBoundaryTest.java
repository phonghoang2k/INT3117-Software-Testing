package test;

import com.test.TimSo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimSoBoundaryTest {

    @Test
    public void testCase1() {

        TimSo timSo = new TimSo();
        int res = timSo.specialCalculator(10);

        assertEquals(550, res);
    }

    @Test
    public void testCase2() {

        TimSo timSo = new TimSo();
        try {
            int res = timSo.specialCalculator(0);
        } catch (ArithmeticException e) {
            assertEquals("Number 0 cannot be divided", e.getMessage());
        }

    }

    @Test
    public void testCase3() {

        TimSo timSo = new TimSo();
        int res = timSo.specialCalculator(100);

        assertEquals(100, res);
    }

    @Test
    public void testCase4() {

        TimSo timSo = new TimSo();
        int res = timSo.specialCalculator(1);

        assertEquals(0, res);
    }

    @Test
    public void testCase5() {

        TimSo timSo = new TimSo();
        int res = timSo.specialCalculator(99);

        assertEquals(0, res);
    }

    @Test
    public void testCase6() {

        TimSo timSo = new TimSo();
        int res = timSo.specialCalculator(101);

        assertEquals(0, res);
    }

    @Test
    public void testCase7() {

        TimSo timSo = new TimSo();
        int res = timSo.specialCalculator(-1);

        assertEquals(0, res);
    }
}
