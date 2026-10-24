import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {
    Calculator calculator = new Calculator();
//SUM
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
//SUBTRACION
    @Test
    public void testSubtract(){
        int expected = 4;
        int actual = calculator.subtract(5,1);
        assertEquals(expected, actual);
    }

    @Test
    public void testSubtractNegative() {
        int expected = -3;
        int actual = calculator.subtract(2, 5);
        assertEquals(expected, actual);
    }

    @Test
    public void testSubtractZero() {
        int expected = 7;
        int actual = calculator.subtract(7, 0);
        assertEquals(expected, actual);
    }

//MULTIPLY
    @Test
    public void testMultiply(){
        int expected = 12;
        int actual = calculator.multiply(3,4);
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiplyNegative() {
        int expected = -12;
        int actual = calculator.multiply(-3, 4);
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiplyZero() {
        int expected = 0;
        int actual = calculator.multiply(5, 0);
        assertEquals(expected, actual);
    }

//DIVISION
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