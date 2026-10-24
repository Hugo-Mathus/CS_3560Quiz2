import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void testSum(){
        int expected = 3;
        int actual = calculator.sum(1,2);
        assertEquals(expected, actual);
    }

    @Test
    public void testSumNegative() {
        int expected = -7;
        int actual = calculator.sum(-3, -4);
        assertEquals(expected, actual);
    }

    @Test
    public void testSumZero() {
        int expected = 5;
        int actual = calculator.sum(5, 0);
        assertEquals(expected, actual);
    }

    @Test
    public void testSubtract(){
        int expected = 4;
        int actual = calculator.subtract(5,1);
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiply(){
        int expected = 12;
        int actual = calculator.multiply(3,4);
        assertEquals(expected, actual);
    }

    @Test
    public void testDivide(){
        int expected = 2;
        int actual = calculator.divide(8,4);
        assertEquals(expected, actual);
    }

    @Test
    public void testDivideByZero(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calculator.divide(1,0));
        String expectedMessage = "Ints can NOT be divided by zero";
        String actualMessage = exception.getMessage();
        assertEquals(expectedMessage,actualMessage);
    }

    @Test
    public void testIsEven(){
        boolean actual = calculator.isEven(2);
        assertTrue(actual);
    }

    @Test
    public void testIsOdd(){
        boolean actual = calculator.isEven(3);
        assertFalse(actual);
    }

}