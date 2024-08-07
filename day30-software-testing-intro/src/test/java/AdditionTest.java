import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {
    @Test
    void twoAndTwoMakeFour() {
        Addition sum = new Addition(2, 2);
        assertEquals(4, sum.getResult());
    }
    @Test
    void twoAndThreeMakeFive() {
        Addition sum = new Addition(2, 3);
        assertEquals(5, sum.getResult());
    }
    @Test
    void twoAndThreeMakeNotSix() {
        Addition sum = new Addition(2, 3);
        assertNotEquals(6, sum.getResult());
    }
    @Test
    void twoAndMinusTwoMakeZero() {
        Addition sum = new Addition(2, -2);
        assertEquals(0, sum.getResult());
    }
}