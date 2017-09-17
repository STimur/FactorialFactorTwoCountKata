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

    private int count(int n) {
        if (n == 1)
            return 0;
        return 1;
    }
}
