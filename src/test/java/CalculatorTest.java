import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void testSum(){
        int expected = 3;
        int actual = calculator.sum(1,2);
        assertEquals(expected, actual);
    }

    @Test
    public void testSubtract(){
        int expected = 4;
        int actual = calculator.subtract(5,1);
        assertEquals(expected, actual);
    }


}