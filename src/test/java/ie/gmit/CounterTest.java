package ie.gmit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CounterTest
{
    Counter myCounter;

    @Test
    void testConstructor()
    {
        myCounter = new Counter();
        assertEquals(0, myCounter.getCount());
    }

    @Test
    void testIncrement()
    {
        myCounter = new Counter();
        assertEquals(1, myCounter.getIncrement());
    }

    @Test
    void testDecrement()
    {
        myCounter = new Counter();
        assertEquals(-1, myCounter.getDecrement());
    }

    @Test
    void testConstructorWithValue()
    {
        myCounter = new Counter();
        assertEquals(2, myCounter.getValueGreater(2));
    }

}
