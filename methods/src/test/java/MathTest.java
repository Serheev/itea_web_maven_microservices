import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathTest {
    private double expected;
    private double actual;
    private double delta = .01;

    @Test
    public void shouldPerformMathSumCorrectly() {
        expected = 6.66;
        actual = Double.sum(3.33, 3.33);
        assertEquals(expected, actual, delta);
    }

    @Test
    public void shouldPerformMathSqrtCorrectly() {
        expected = 3.0;
        actual = Math.sqrt(9);
        assertEquals(expected, actual, delta);
    }

    @Test
    public void shouldPerformMathPowCorrectly() {
        expected = 2.75;
        actual = Math.pow(1.5, 2.5);
        assertEquals(expected, actual, delta);
    }
}
