import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CounterTest {
    @Test
    public void countOne() throws Exception {
        assertEquals(0, count(1));
    }

    @Test
    public void countTwo() throws Exception {
        assertEquals(1, count(2));
    }

    @Test
    public void countFour() throws Exception {
        assertEquals(3, count(4));
    }

    private int count(int n) {
        return n/4 + n/2;
    }
}
