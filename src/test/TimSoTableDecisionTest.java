package test;

import com.test.TimSo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimSoTableDecisionTest {

    //    A: a % 2 == 0
    //    B: a % 3 == 0
    //    C: a % 5 == 0
    //    điều kiện ktra [(A AND B) OR C]
    @Test
    public void testCase1() {
        // A true, B true, C not check
        TimSo timSo = new TimSo();
        int res = timSo.specialCalculator(6);

        assertEquals(816, res);
    }

    @Test
    public void testCase2() {
        // A true, B false, C true
        TimSo timSo = new TimSo();
        int res = timSo.specialCalculator(10);

        assertEquals(550, res);
    }

    @Test
    public void testCase3() {
        // A true, B false, C false
        TimSo timSo = new TimSo();
        int res = timSo.specialCalculator(4);

        assertEquals(0, res);
    }

    @Test
    public void testCase4() {
        // A false, B not check, C true
        TimSo timSo = new TimSo();
        int res = timSo.specialCalculator(5);

        assertEquals(1050, res);
    }

    @Test
    public void testCase5() {
        // A false, B not check, C false
        TimSo timSo = new TimSo();
        int res = timSo.specialCalculator(11);

        assertEquals(0, res);
    }

    @Test
    public void testCase6() {
        // out of boundary
        TimSo timSo = new TimSo();
        int res = timSo.specialCalculator(105);

        assertEquals(0, res);
    }
}
