package counter;

import org.junit.Test;

import java.util.Random;
import java.util.Stack;

import static org.junit.Assert.assertEquals;

public class FunctionalTest {

    @Test
    public void test() {
        Counter c = new CounterImpl();
        assertEquals(0, c.get());
        assertEquals(0, c.getAndAdd(10));
        assertEquals(10, c.get());
        assertEquals(10, c.getAndAdd(-10));
        assertEquals(0, c.get());
    }
}