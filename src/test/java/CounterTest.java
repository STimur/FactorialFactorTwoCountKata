import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class CounterTest {
    private void assertsNumberOfFactorTwoInFactorialOf(int n, int nOfFactorTwo) {
        assertEquals(nOfFactorTwo, countFactorTwoInFactorialOf(n));
    }

    private int bruteForceCountFactorTwoInFactorialOf(int n) {
        BigInteger fact = fact(new BigInteger(Integer.toString(n)));
        int i = 0;
        while (isMultipleOfTwo(fact) && greaterThanTwo(fact)) {
            fact = fact.divide(new BigInteger("2"));
            i++;
        }
        return i;
    }

    private boolean greaterThanTwo(BigInteger n) {
        return n.compareTo(new BigInteger("2")) >= 0;
    }

    private boolean isMultipleOfTwo(BigInteger n) {
        return n.remainder(new BigInteger("2")).compareTo(new BigInteger("0")) == 0;
    }

    private BigInteger fact(BigInteger n) {
        if (n.compareTo(new BigInteger("1")) == 0)
            return new BigInteger("1");
        return n.multiply(fact(n.subtract(new BigInteger("1"))));
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

    @Test
    public void acceptance() throws Exception {
        int n = 100;
        assertEquals(bruteForceCountFactorTwoInFactorialOf(n), countFactorTwoInFactorialOf(n));
    }

    private int countFactorTwoInFactorialOf(int n) {
        if (n == 1)
            return 0;
        return n / 2 + countFactorTwoInFactorialOf(n / 2);
    }
}
