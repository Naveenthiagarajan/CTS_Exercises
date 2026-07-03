import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.*;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        System.out.println("Setup");
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        System.out.println("Teardown");
    }

    @Test
    void testSubtract() {

        int a = 20;
        int b = 10;

        int result = calculator.subtract(a, b);

     
        assertEquals(10, result);
    }
}