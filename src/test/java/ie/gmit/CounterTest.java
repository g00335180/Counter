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

}
