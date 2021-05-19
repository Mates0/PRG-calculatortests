import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogicTest {
    Logic logic = new Logic();

    @Test
    void sum() {
        int value = logic.sum(1,2);
        assertEquals(3, value);
    }

    @Test
    void subtract() {
        int value = logic.subtract(2,1);
        assertEquals(1, value);
    }

    @Test
    void multiply() {
        int value = logic.multiply(4,4);
        assertEquals(16, value);
    }

    @Test
    void divide() {
        int value = logic.divide(70,10);
        assertEquals(7, value);
    }

    @Test
    void square() {
        int value = logic.square(5);
        assertEquals(25, value);
    }

    @Test
    void factorial() {
        int value = logic.factorial(5);
        assertEquals(120, value);
    }
}