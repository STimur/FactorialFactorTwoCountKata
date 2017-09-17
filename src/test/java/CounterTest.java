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

    @Test
    public void sixteen() throws Exception {
        assertsNumberOfFactorTwoInFactorialOf(16, 15);
    }

    private int countFactorTwoInFactorialOf(int n) {
        if (n == 1)
            return 0;
        return n / 2 + countFactorTwoInFactorialOf(n / 2);
    }
}
