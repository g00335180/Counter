package ie.gmit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CounterTest
{
    Counter myCounter;

    @DisplayName("Checking Constructor is initialised")
    @Test
    void testConstructor()
    {
        myCounter = new Counter();
        assertEquals(0, myCounter.getCount());
    }

    @DisplayName("Checking Constructor with value")
    @Test
    void testConstructorWithValue()
    {
        myCounter = new Counter();
        assertThrows(IllegalArgumentException.class, ()-> {myCounter.getValueGreater(0);});
    }

    @DisplayName("Test Increment method")
    @Test
    void testIncrement()
    {
        myCounter = new Counter();
        assertEquals(1, myCounter.getIncrement());
    }

    @DisplayName("Test Decrement method")
    @Test
    void testDecrement()
    {
        myCounter = new Counter();
        assertEquals(-1, myCounter.getDecrement());
    }

}
