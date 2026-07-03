import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAssertions() {

        assertEquals(30, calculator.multiply(5, 6));

        assertTrue(calculator.isPositive(10));

        assertFalse(calculator.isPositive(-5));

        assertNotNull(calculator.getMessage());

        assertEquals("JUnit", calculator.getMessage());
    }
}