import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        float result = calculator.add(2.5f, 3.5f);
        assertEquals(6.0f, result, 0.001);
    }

    @Test
    public void testSubtract() {
        float result = calculator.subtract(5.5f, 3.5f);
        assertEquals(2.0f, result, 0.001);
    }

    @Test
    public void testDivide() {
        float result = calculator.divide(10.0f, 2.0f);
        assertEquals(5.0f, result, 0.001);
    }

    @Test
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10.0f, 0.0f));
    }

    @Test
    public void testMultiply() {
        float result = calculator.multiply(2.5f, 3.0f);
        assertEquals(7.5f, result, 0.001);
    }
}
