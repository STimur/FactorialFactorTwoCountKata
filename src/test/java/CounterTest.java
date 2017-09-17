import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CounterTest {
    private void assertsNumberOfFactorTwoInFactorialOf(int n, int nOfFactorTwo) {
        assertEquals(nOfFactorTwo, countFactorTwoInFactorialOf(n));
    }

    @Test
    public void countOne() throws Exception {
        assertsNumberOfFactorTwoInFactorialOf(1, 0);
    }

    @Test
    public void countTwo() throws Exception {
        assertsNumberOfFactorTwoInFactorialOf(2, 1);
    }

    @Test
    public void countFour() throws Exception {
        assertsNumberOfFactorTwoInFactorialOf(4, 3);
    }

    @Test
    public void countEight() throws Exception {
        assertsNumberOfFactorTwoInFactorialOf(8, 7);
    }

    private int countFactorTwoInFactorialOf(int n) {
        return n/8 + n/4 + n/2;
    }
}
