import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
 
public class SimpleCalculator assertEquals(25.0, calculator.add(20, 5));
    }
 
    @Test
    public void testSubtraction() {
        assertEquals(15.0, calculator.subtract(20, 5));
    }
 
    @Test
    public void testMultiplication() {
        assertEquals(100.0, calculator.multiply(20, 5));
    }
 
    @Test
    public void testDivision() {
        assertEquals(4.0, calculator.divide(20, 5));
    }
 
    @Test
    public void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(20, 0);
        });
        assertEquals("Division by zero", exception.getMessage());
    }
}
