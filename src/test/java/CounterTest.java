import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CounterTest {
    @Test
    public void countOne() throws Exception {
        assertEquals(0, countFactorTwoInFactorialOf(1));
    }

    @Test
    public void countTwo() throws Exception {
        assertEquals(1, countFactorTwoInFactorialOf(2));
    }

    @Test
    public void countFour() throws Exception {
        assertEquals(3, countFactorTwoInFactorialOf(4));
    }

    @Test
    public void countEight() throws Exception {
        assertEquals(7, countFactorTwoInFactorialOf(8));
    }

    private int countFactorTwoInFactorialOf(int n) {
        return n/8 + n/4 + n/2;
    }
}
