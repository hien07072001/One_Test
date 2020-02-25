import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

class SimpleCalculatorTest {
    @Test
    @DisplayName("Testing sub 0 + 0")

    void add() {
        int first=0;
        int second=0;
        int expected=0;

        int result=SimpleCalculator.add(first,second);
        assertEquals(expected,result);

    }

    @Test
    @DisplayName("Testing sub 1 - 0")
    void sud() {
        int first = 1;
        int second = 0;
        int expected = 1;

        int result = SimpleCalculator.sud(first, second);
        assertEquals(expected, result);
    }
}
