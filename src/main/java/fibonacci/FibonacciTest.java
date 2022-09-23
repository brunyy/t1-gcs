package fibonacci;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(JUnit4.class)
public class FibonacciTest {

    @Test
    public void generateFibonacciSeries_shouldReturnSeriesMin() {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals("0",fibonacci.generateFibonacciSeries(0));
    }

    @Test
    public void generateFibonacciSeries_shouldReturnSeriesMax() {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals("0 1 1 2 3 5 8 13 21 34",fibonacci.generateFibonacciSeries(10));
    }
}